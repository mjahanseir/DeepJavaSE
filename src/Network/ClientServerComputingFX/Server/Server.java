package Network.ClientServerComputingFX.Server;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.*;
import java.net.*;
import java.util.Date;

public class Server extends Application {
    @Override
    public void start(Stage stage) {
        // Text area for displaying contents
        TextArea ta = new TextArea();

        // Create a scene and place it in the stage
        Scene scene = new Scene(new ScrollPane(ta), 450, 200);
        stage.setTitle("Server");
        stage.setScene(scene);
        stage.show();

        new Thread(()->{
            try {

                //The Server class creates a ServerSocket and attaches it to port 8000
                ServerSocket serverSocket = new ServerSocket(8000); //create server socket
           /*
                runLater. public static void runLater(Runnable runnable) Run the specified Runnable
                on the JavaFX Application Thread at some unspecified time in the future.
                This method,which may be called from any thread, will post the Runnable to an event
                queue and then return immediately to the caller.
                 */
                Platform.runLater(() -> {
                    ta.appendText("Server started at " + new Date() + '\n');
                });

                //The server then starts to listen for connection requests, using the following statement
                Socket socket= serverSocket.accept(); //listen for connection

                // Create data input and output streams
                DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
                DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());

                while (true) {
                    // Receive radius from the client
                    double radius = inputFromClient.readDouble();

                    // Compute area
                    double area = radius * radius * Math.PI;

                    // Send area back to the client
                    outputToClient.writeDouble(area);
                    ///////////////////////////////////////
                    Platform.runLater(() -> {
                        ta.appendText("Radius received from client: "+ radius + '\n');
                        ta.appendText("Area is: " + area + '\n');
                    });
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

