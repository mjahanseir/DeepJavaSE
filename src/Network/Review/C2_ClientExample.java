package Network.Review;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

public class C2_ClientExample extends Application {

    DataInputStream dataInputStream = null;
    DataOutputStream dataOutputStream=null;

    @Override
    public void start(Stage stage) {
        BorderPane paneForTextField = new BorderPane();
        paneForTextField.setPadding(new Insets(5, 5, 5, 5));
        paneForTextField.setStyle("-fx-border-color: green");
        paneForTextField.setLeft(new Label("Enter a radius: "));
        TextField tf = new TextField();
        tf.setAlignment(Pos.BOTTOM_RIGHT);
        paneForTextField.setCenter(tf);
        BorderPane mainPane = new BorderPane();
        TextArea ta = new TextArea();
        mainPane.setCenter(new ScrollPane(ta));
        mainPane.setTop(paneForTextField);
        Scene scene = new Scene(mainPane, 450, 200);
        stage.setScene(scene);
        stage.show();
        /////////////////////////////////////////////////////
        tf.setOnAction(e-> {
            try {
                //                      1
                double radius = Double.parseDouble(tf.getText());
                //                      2
                dataOutputStream.writeDouble(radius);
                //                      3
                double ar= dataInputStream.readDouble();
                //                      4
                ta.appendText("radius : " + radius + " \n");
                ta.appendText("  Area is : " + ar +"\n");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        /////////////////////////////////////////////////////
        try {
            //                      1
            Socket socket = new Socket("localhost", 8002);
            //                      2
            dataInputStream = new DataInputStream(socket.getInputStream());
            //                      3
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        /////////////////////////////////////////////////////
    }
}
