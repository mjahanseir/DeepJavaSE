package COSC60220220218;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
public class C2DisplayClock  extends Application {
    @Override
    public void start(Stage stage)  {

        C1ClockDemo clock = new C1ClockDemo();
       String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
       Label lblCurrentTime = new Label(timeString);
        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane. setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
        Scene scene = new Scene(pane,  250,  250);
        stage.setTitle("Clock");
        stage.setScene(scene);
        stage.show();
    }
}
