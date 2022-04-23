package Thread.Review;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class C2_RunlaterMethod extends Application {
    private String txt="";

    @Override
    public void start(Stage stage){

        StackPane sp= new StackPane();
        Label lbl=new Label("Hi");
        sp.getChildren().add(lbl);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (lbl.getText().trim().length() == 0)
                            txt = "Bye";
                        else
                            txt = "";
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                lbl.setText(txt);
                            }
                        });
                        Thread.sleep(200);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Scene scene= new Scene(sp , 200,50);
        stage.setScene(scene);
        stage.show();

    }
}
