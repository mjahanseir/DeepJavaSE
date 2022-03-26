package COSC60220220211.Start;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEventDemo extends Application {

    @Override
    public void start(Stage keyStage){

        Pane pane = new Pane();
        Text text = new Text(20,20,"A");

        pane.getChildren().add(text);



        Scene scene = new Scene(pane, 300, 300);
        keyStage.setTitle("KeyEvent Demo");
        keyStage.setScene(scene);
        keyStage.show();
        // object must have focus to recognize events
        text.requestFocus();
    }
}
