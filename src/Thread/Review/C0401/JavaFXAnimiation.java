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
        StackPane pane = new StackPane();
        Label lblText= new Label("Programming is fun");
        pane.getChildren().add(lblText);


        //The program creates a Runnable object in an anonymous inner class (below).
        // This object is started in line 61 (.start();) and runs continuously to change the text
        // in the label. It sets a text in the label if the label is blank
        // (text = "Welcome";) and sets its text blank (text = "";) if the label has a text. The
        //text is set and unset to simulate a flashing effect.
        //JavaFX GUI is run from the JavaFX application thread. The flashing control is run from a
        //separate thread.
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (lblText.getText().trim().length() == 0)
                            text = "Welcome";
                        else
                            text = "";

                        //The code in a non-application thread cannot update GUI in the application
                        //thread. To update the text in the label,
                        // a new Runnable object is created in below.
                        // Invoking :
                        //         Platform.runLater(Runnable r)
                        //tells the system to run this Runnable object in the
                        //application thread

                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                lblText.setText(text);
                            }
                        });

                        Thread.sleep(200);
                    }
                }
                catch (InterruptedException ex) {

                }
            }
        }).start();


        Scene scene= new Scene(pane, 200,50);
        stage.setTitle("Flashing Text");
        stage.setScene(scene);
        stage.show();
    }
}
