package Assign2.Q3;

import COSC60220220218.C1ClockDemo;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.time.ZoneId;
import java.util.TimeZone;

public class Main extends Application {
    Clock clock = new Clock();
    BorderPane pane= new BorderPane();
    @Override
    public void start(Stage stage) {
        ComboBox<String> combo = new ComboBox<>();
        String[] names = {"Beijing, China","Hanoi, Vietnam","New Delhi, India","Abuja, Nigeria",
                "Mexico City, Mexico","Saskatoon, Canada"};
        ObservableList<String> cities = FXCollections.observableArrayList(names);
        combo.getItems().addAll(cities);
        combo.getSelectionModel().select(5);
        BorderPane.setAlignment(combo,Pos.CENTER);
        pane.setTop(combo);

        Label lblTime = new Label(digitalCalc(clock.getHour(),clock.getMinute(), clock.getSecond()));
        lblTime.setFont(Font.font("Verdana", FontWeight.BOLD, 44));
        //pane.setCenter(clock);

        VBox clockType= new VBox(5);
        clockType.setPadding(new Insets(5,15,5,5));
        RadioButton analog = new RadioButton("Analog");
        RadioButton digital = new RadioButton("Digital");
        clockType.getChildren().addAll(analog, digital);
        ToggleGroup group = new ToggleGroup();
        analog.setToggleGroup(group);
        digital.setToggleGroup(group);
        pane.setRight(clockType);
        combo.setOnAction(e -> clockShow(cities.indexOf(combo.getValue())));
        analog.setOnAction(e -> {
            if (analog.isSelected()){
                pane.setCenter(clock);
            }
        });
        digital.setOnAction(e -> {
            if (digital.isSelected()){
                pane.setCenter(lblTime);
            }
        });
        Scene scene = new Scene(pane, 400,400);
        stage.setScene(scene);
        stage.show();
    }
    public void clockShow(int index) {
        ZoneId beijing = ZoneId.of( "Asia/Beijing" ) ;
        ZoneId hanoi = ZoneId.of( "Asia/Hanoi" ) ;
        ZoneId newDelhi = ZoneId.of( "Asia/New Delhi" ) ;
        ZoneId abuja = ZoneId.of( "Africa/Abuja" ) ;
        ZoneId mexico = ZoneId.of( "America/Mexico" ) ;
        ZoneId saskatoon = ZoneId.of( "America/Saskatoon" ) ;

        switch(index){
            case 0 :
                clock.setCurrentTime(TimeZone.getTimeZone(beijing));
                break;
                case 1 :
                clock.setCurrentTime(TimeZone.getTimeZone(hanoi));
                break;
            case 2 :
                clock.setCurrentTime(TimeZone.getTimeZone(newDelhi));
                break;
                case 3 :
                clock.setCurrentTime(TimeZone.getTimeZone(abuja));
                break;
                case 4 :
                clock.setCurrentTime(TimeZone.getTimeZone(mexico));
                break;
            case 5 :
                clock.setCurrentTime(TimeZone.getTimeZone(saskatoon));
                break;


        }
    }

    public String digitalCalc(int hour, int min, int sec){
        String half="";
        if(hour>12 && hour<24){
            hour-=12;
            half="PM";
        }else if(hour==12)
            half="PM";
        else if(hour==24)
            half="AM";
        else
            half="AM";
        return hour + ":" +min+ ":" +sec+ " " +half;
    }
}
