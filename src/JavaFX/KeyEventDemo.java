package JavaFX;

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

        /////////////////////////////  2.  SETTING KEY EVENT WITH ARROW KEYS in KeyEventDemo.java
        text.setOnKeyPressed( e -> {
            switch(e.getCode()){
                case UP:
                    text.setY(text.getY()-10);
                    break;
                case DOWN:
                    text.setY(text.getY()+10);
                    break;
                case LEFT:
                    text.setX(text.getX()-10);
                    break;
                case RIGHT:
                    text.setX(text.getX()+10);
                    break;
                default:
                    if (e.getText().length()>0)
                        text.setText(e.getText());
            }
        });



        Scene scene = new Scene(pane, 300, 300);
        keyStage.setTitle("KeyEvent Demo");
        keyStage.setScene(scene);
        keyStage.show();
        // object must have focus to recognize events
        ///////////////////////////////////// 3. We have to focus to active to response to the event
        text.requestFocus();
    }
}
