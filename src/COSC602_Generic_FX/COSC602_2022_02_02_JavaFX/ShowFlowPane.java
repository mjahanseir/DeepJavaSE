package COSC60220220202JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {
    @Override
    public void start(Stage stage)  {
        // Create a pane and set its properties
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(10, 50, 10, 50));
        pane.setHgap(25);
        pane.setVgap(10);


        // Place nodes in the pane
        pane.getChildren().addAll(new Label("First Name:"),
                new TextField(), //javafx.scene.control choose this not other one
                new Label("MI:")
        );

        TextField textMI = new TextField();

        pane.getChildren().addAll(textMI, new Label("Last Name:"), new TextField());
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 250);

        stage.setTitle("FlowPane Demo"); // Set the stage title
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

}
