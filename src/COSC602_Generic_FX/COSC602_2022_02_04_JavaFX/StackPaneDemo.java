package COSC60220220204JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class StackPaneDemo extends Application {
    @Override
    public void start(Stage primaryStage) {

        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("Button 1"));
        pane.getChildren().add(new Button("Button 2 Is Quite Large"));
        pane.getChildren().add(new Button("Button 3"));

        Scene scene= new Scene(pane, 200 , 200);
        primaryStage.setTitle("Stack Pane Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
