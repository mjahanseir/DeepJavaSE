package JDBC.Assign_Threading_Network_DB;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.Date;
public class Server extends Application {
    private TextArea ta = new TextArea();
    String cName;
    private int clientNum = 0;
    String resultQuery="";
    Connection connection = null;
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new ScrollPane(ta), 450,200);
        stage.setTitle("Search Server");
        stage.setScene(scene);
        stage.show();
        new Thread(() -> {
            try (
                ServerSocket serverSocket = new ServerSocket(8001);
            ){
                Platform.runLater(() -> {
                    ta.appendText("Server started at " + new Date() + '\n');
                    try{
                        connection = DriverManager.getConnection("jdbc:mysql://localhost/sakila", "root", "Mo123456789");
                    }catch (SQLException sqle){
                        sqle.printStackTrace();
                    }
                });
                while (true) {
                    Socket socket = serverSocket.accept();
                    clientNum++;
                    Platform.runLater(() -> {
                        ta.appendText("Client " + clientNum + " start at " + new Date() + '\n');
                    });
                    new Thread (new handle(socket)).start();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
    class handle implements Runnable {
        private Socket socket;
        public handle(Socket socket) {
            this.socket = socket;
        }
        public void run() {
            try (
                    DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
                    DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream()) ){
              System.out.println(inputFromClient.readUTF());
                while (true) {
                    String query =
                            " SELECT film.title" +
                                    " FROM actor" +
                                    " JOIN film_actor on actor.actor_id=film_actor.actor_id " +
                                    " JOIN film on film.film_id=film_actor.film_id " +
                                    " where actor.first_name=? AND actor.last_name=?";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    cName=inputFromClient.readUTF();
                    String[] sName = cName.split("," );
                    preparedStatement.setString(1, sName[0]);
                    preparedStatement.setString(2, sName[1]);
                    ResultSet prepResult = preparedStatement.executeQuery();
                    while (prepResult.next()) {
                        resultQuery=resultQuery + prepResult.getString(1)+"\n";
                    }
                    outputToClient.writeUTF(resultQuery);
                    Platform.runLater(() -> {
                        ta.appendText(" client send: " + cName +'\n');
                    });
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
