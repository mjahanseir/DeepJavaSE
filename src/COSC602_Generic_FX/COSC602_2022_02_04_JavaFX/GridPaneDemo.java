package COSC60220220204JavaFX;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage aStage) {
        // CREATE GRID PANE
        // Create a pane and set its properties
        GridPane pane = new GridPane();


        // Place nodes in the pane
        //        This menu we want to create
        //         lable1   textbox1
        //         lable2   textbox2
        //         lable3   textbook3
        //                   Botton

        //////////////////   lable1   textbox1
        pane.add(new Label("First Name:"), 0, 0);
        pane.add(new TextField(), 1, 0);

        //////////////////   lable2   textbox2
        pane.add(new Label("MI:"), 0, 1);
        pane.add(new TextField(), 1, 1);

        //////////////////   lable3   textbox3
        pane.add(new Label("Last Name:"), 0, 2);
        pane.add(new TextField(), 1, 2);

        //                   Botton
        Button btnAdd = new Button("Add Name");
        pane.add(btnAdd, 1, 3);



        //Align staff as template
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5);
        pane.setVgap(15);

        //     SET button         horizontal position RIGHT
        GridPane.setHalignment(btnAdd, HPos.RIGHT);


        pane.addRow(4, new Label("Password: "), new TextField(), new Label("Some Text to show result change and fit add stuff"));
        ///////////////////////////////////////////////////////////


        // Create a scene and place it in the stage
        Scene scene = new Scene(pane,500,300 );
        aStage.setTitle("GridPane Demo"); // Set the stage title
        aStage.setScene(scene); // Place the scene in the stage
        aStage.show(); // Display the stage
    }

}