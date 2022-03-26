package COSC60220220209JavaFXevent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class C2AnotherClassHandlerChangeToLambd extends Application {
    @Override
    public void start(Stage stage) {


        //1- create text
        Text text = new Text(40,40,"Programming is Fun!!!");
        Pane pane= new Pane(text);

        Button btnUp = new Button("Up");
        Button btnDown = new Button("Down");
        Button btnLeft = new Button("Left");
        Button btnRight = new Button("Right");

        HBox hBox= new HBox(btnUp,btnDown,btnLeft,btnRight);

        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        BorderPane borderPane= new BorderPane(pane);
        borderPane.setBottom(hBox);

        ///////////////////////////  EVENT HANDLER  CODE  /////  END step

//        btnUp.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                text.setY(  text.getY()>10 ? text.getY()-5 : 10);
//            }
//        });
        ///////LAMBDA

        btnUp.setOnAction((ActionEvent e) ->  text.setY(  text.getY()>10 ? text.getY()-5 : 10) );


//  LIKE C1 Code but here as ANONYMOUSE
//        //    this is for button -> action event
//        class OKHandlerClass implements EventHandler<ActionEvent> {
//            @Override
//            public void handle(ActionEvent e) {
//                //// WHICH code come here to control or do something else( here only have a simple console
//                System.out.println("OK button was clicked");
//            }
//        }


//        btnDown.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                text.setY (  text.getY()<pane.getHeight() ? text.getY()+5 : pane.getHeight()   );
//            }
//        });
        //LAMBDA:

        btnDown.setOnAction((ActionEvent e) -> text.setY (  text.getY()<pane.getHeight() ? text.getY()+5 : pane.getHeight()   )  );




//
//        btnLeft.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                text.setX (  text.getX()>10 ? text.getX()-5 : 10  );
//            }
//        });
//
        //LAMBDA:

        btnRight.setOnAction((ActionEvent e) -> text.setX (  text.getX()< pane.getWidth()-100? text.getX()+5 :pane.getWidth()-120  ));




//        private void btnUpHandler(){
//            text.setX (  text.getX()< pane.getWidth()-100? text.getX()+5 :pane.getWidth()-120  );
//
        /////////////////////////////////////////////////////////////////////////////////////


        Scene scene= new Scene(borderPane, 400,350);
        stage.setTitle("Anonymous Handler");
        stage.setScene(scene);
        stage.show();

    }


}
