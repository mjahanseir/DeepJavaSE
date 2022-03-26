package COSC60220220209JavaFXevent;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class C1HandleEvent  extends Application {
    @Override
    public void start(Stage stage) {

        // Create a pane and set its properties
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOK = new Button("OK");
        Button btCancel = new Button("Cancel");


        /////////////////////  2- Add Handler registration for each button /////////////////


        //// 2- 1- CREATE INSTANCE FOR EACH ONE
        OKHandlerClass     handler1 = new OKHandlerClass();
        CancelHandlerClass handler2 = new CancelHandlerClass();

        //// 2-2- CREATE BUTTON FOR EACH
        btOK.setOnAction(handler1);
        btCancel.setOnAction(handler2);



        pane.getChildren().addAll(btOK, btCancel);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        stage.setTitle("HandleEvent"); // Set the stage title
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }


    ////////////////////// 1-1- INNER CLASS for OK ///////////////////////////////

    //    this is for button -> action event
    class OKHandlerClass implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            //// WHICH code come here to control or do something else( here only have a simple console
            System.out.println("OK button was clicked");
        }
    }

    ////////////////////// 1-2-  INNER CLASS for Cancel ///////////////////////////////

    class CancelHandlerClass implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            //// Same WHICH code come here to control or do something else( here only have a simple console
            System.out.println("Cancel button was clicked");
        }
    }

}
