package Network.ClientServerComputingFX2.Server;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.*;
import java.net.*;
import java.util.Date;

public class ServerFX2 extends Application {
    @Override
    public void start(Stage stage) {
        // Text area for displaying contents
        TextArea ta = new TextArea();

        // Create a scene and place it in the stage
        Scene scene = new Scene(new ScrollPane(ta), 450, 200);
        stage.setTitle("Server");
        stage.setScene(scene);
        stage.show();
        new Thread(()-> {
            try {
                ServerSocket serverSocket = new ServerSocket(8000);
                Socket socket = serverSocket.accept();
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                while (true) {
                    double radius= in.readDouble();
                    double area= radius*radius*Math.PI;

                    out.writeDouble(area);
                    Platform.runLater(()->{
                        ta.appendText("\n Radius : " + radius);
                        ta.appendText("\n area : " + area);
                    });
                }

            } catch (IOException e) {
            }
        }).start();
    }
}
