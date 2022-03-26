package COSC60220220211.Start;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo extends Application {

    @Override
    public void start(Stage primaryStage){

        Pane pane = new Pane();
        Text text = new Text(20,20,"Programming is fun!");

        pane.getChildren().addAll(text);





        Scene scene = new Scene(pane,300, 200);
        primaryStage.setTitle("Mouse Dragging");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
