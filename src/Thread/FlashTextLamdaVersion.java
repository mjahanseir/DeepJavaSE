package Thread;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FlashTextLamdaVersion extends Application {
    private String text = "";
    @Override
    public void start(Stage stage) throws Exception {
        StackPane pane= new StackPane();
        Label lblText = new Label("Programming is fun");
        pane.getChildren().add(lblText);
        new Thread(()-> {
            try {
                while(true) {
                    if (lblText.getText().trim().length() == 0)  text = "welcome";
                    else  text = "";
                    Platform.runLater(()->  lblText.setText(text));
                    Thread.sleep(50);
                }  } catch (InterruptedException e) {
                e.printStackTrace();
            }}).start();
        Scene scene= new Scene(pane, 200,50);
        stage.setScene(scene);
        stage.setTitle("FlashText");
        stage.show();
    }
}
