package Network.Review;
import Network.ClientServerComputingFX.Server.Server;
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
import java.util.Date;

public class C2_ServerExample  extends Application {
    @Override
    public void start(Stage stage) {
        TextArea ta= new TextArea();
        Scene scene= new Scene(new ScrollPane(ta), 500, 250);
        stage.setScene(scene);
        stage.show();
        new Thread(()-> {
            try {
                //                      1
                ServerSocket serverSocket = new ServerSocket(8002);
                //                      2
                Platform.runLater(() ->   ta.appendText("Server strated at " + new Date() + "\n"));
                //                      3
                Socket socket = serverSocket.accept();
                //                      4
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                //                      5
                while(true){
                //                      6
                    double rad=dataInputStream.readDouble();
                //                      7
                    double area= rad*rad*Math.PI;
                //                      8
                    dataOutputStream.writeDouble(area);
                //                      9
                    Platform.runLater(() -> {
                        ta.appendText("Radius :" + rad + "\n");
                        ta.appendText("Area : " + area + "\n");
                    });
                }//END of While
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
