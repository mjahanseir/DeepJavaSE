package Thread.Review.C0401;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class JavaFXAnimiation extends Application {
    private String text="";
    @Override
    public void start(Stage stage) throws Exception {
        /* GUI*/    StackPane pane = new StackPane(); Label lblText= new Label("Programming is fun"); pane.getChildren().add(lblText); Scene scene= new Scene(pane, 200,50);  stage.setTitle("Flashing Text");   stage.setScene(scene);  stage.show();

        new Thread(()->{
                try {
                    while (true) {
                        if (lblText.getText().trim().length() == 0)
                            text = "Welcome";
                        else
                            text = "";
                        Platform.runLater(()-> lblText.setText(text));
                        Thread.sleep(200);
                    }
                }
                catch (InterruptedException ex) {
                }
        }).start();
    }
}
