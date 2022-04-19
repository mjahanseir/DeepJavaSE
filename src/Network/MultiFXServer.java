package Network;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.sql.SQLOutput;
import java.util.Date;

public class MultiFXServer  extends Application {
    // Text area for displaying contents
    private TextArea ta = new TextArea();
    // Number a client
    private int clientNum = 0;
    @Override
    public void start(Stage stage) {

        // Create a scene and place it in the stage
        Scene scene = new Scene(new ScrollPane(ta), 450, 200);
        stage.setTitle("Server");
        stage.setScene(scene);
        stage.show();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        new Thread(() -> {
            try {
                // Create a server socket
                ServerSocket serverSocket = new ServerSocket(8000);
                /////////////////////////////////////////////////////////////////
                Platform.runLater(() -> {
                    ta.appendText("Multi Server started at " + new Date() + '\n');
                });

                while (true) {

    /////////////////////// Step 1: Move the socket listener inside the loop so we can repeatedly accept Connections
                    // Listen for a new connection request
                    Socket socket = serverSocket.accept();

                    // Increment clientNo
                    clientNum++;

                    //////////output connection information to the text area
                    Platform.runLater(() -> {
                        // Display the client number
                        ta.appendText("Starting thread for client " + clientNum + " at " + new Date() + '\n');
                        ////////////////////////////////////////////////////////////////////////////////////////////////
                        // Find the client's host name, and IP address
                        InetAddress inetAddress = socket.getInetAddress();
                        ta.appendText("Client " + clientNum + "'s host name is "   + inetAddress.getHostName() + "\n");
                        ta.appendText("Client " + clientNum + "'s IP Address is "  + inetAddress.getHostAddress() + "\n");
                    });


/////////////////////// Pass processing that used to be here
/////////////////////// ie. stream setup & processing to a new thread as a runnable task
/////////////////////// new Thread (            ).start();
                    new Thread (new HandleAClient(socket)).start();
                }
            } catch (SocketException e) {
                System.out.println("Client Disconnected");
            }catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Define the thread class for handling new connection

    class HandleAClient implements Runnable {
        /////////////////////// PROPERTY
        private Socket socket; // A connected socket

        ///////////////////////NEED constructor to be able to pass information to task

        /**
         * Construct a thread
         */
        public HandleAClient(Socket socket) {
            this.socket = socket;
        }

        /**
         * Run a thread
         */
        public void run() {
            try {
///////////////////////  CREATE DATA STREAM
                // Create data input and output streams
                DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
                DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());

                // Continuously serve the client
                while (true) {
                    // Receive radius from the client
                    double radius = inputFromClient.readDouble();

                    // Compute area
                    double area = radius * radius * Math.PI;

                    // Send area back to the client
                    outputToClient.writeDouble(area);

                    Platform.runLater(() -> {
                        ta.appendText("radius received from client: " + radius + '\n');
                        ta.appendText("Area found: " + area + '\n');
                    });
                }
            } catch (SocketException ex) {
                System.out.println("Client Disconnected");
            }catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}