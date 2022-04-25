package Network.Review;
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
import java.util.Date;

public class C4_MultiThread extends Application {
    private TextArea ta = new TextArea();
    private int clientNo = 0;
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a scene and place it in the stage
        Scene scene = new Scene(new ScrollPane(ta), 450, 200);
        primaryStage.setTitle("MultiThreadServer"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        new Thread(()->{

            try {
                //                          1
                ServerSocket serverSocket= new ServerSocket(8002);

//                          2
                ta.appendText("Server Started at: " + new Date() + "\n");
//                          3
                while(true) {
//                          4
                    Socket socket = serverSocket.accept();
//                          5
                    clientNo++;
//                          6
                    Platform.runLater(() -> {
                        ta.appendText("Client ( " + clientNo + " )");
                        ta.appendText(" at " + new Date() + "\n");
                    });
//                          7
                    InetAddress inetAddress = socket.getInetAddress();

                    ta.appendText("Client ( " + clientNo);
                    ta.appendText(" ) with host #: " + inetAddress.getHostName());
                    ta.appendText(", IP: " + inetAddress.getHostAddress());


//                          8
                    new Thread(new HandleClient(socket)).start();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }).start();
    }
    private class HandleClient implements Runnable {
        //                          1
        private Socket socket;
        //                          2
        public HandleClient(Socket socket) {
            this.socket = socket;
        }
        //                          3
        @Override
        public void run() {
            try {
//                          4
                DataInputStream dataInputStream= new DataInputStream(socket.getInputStream());
                DataOutputStream dataOutputStream= new DataOutputStream(socket.getOutputStream());
//                          5
                while(true) {
//                          6
                    double radius= dataInputStream.readDouble();
//                          7
                    double area= radius * radius * Math.PI;
//                          8
                    dataOutputStream.writeDouble(area);
//                          9
                    Platform.runLater(()->{
                        ta.appendText("Client Send radius : " + radius + "\n");
                        ta.appendText("Server return area : " + area + "\n");
                    });
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}