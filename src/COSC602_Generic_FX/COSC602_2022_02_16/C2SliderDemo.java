package COSC60220220216;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class C2SliderDemo extends Application {

    // Override the start method in the Application class
    @Override
    public void start(Stage primaryStage) {

        Text text = new Text(20, 20, "JavaFX Programming");

        // set slider
        // 1- Horiz. Slider
        Slider slHorizontal = new Slider();
        slHorizontal.setShowTickLabels(true);
        slHorizontal.setShowTickMarks(true);
        // 2- Vert. Slider
        Slider slVertical = new Slider();
        // Set orientation in vertical or horizontal
        slVertical.setOrientation(Orientation.VERTICAL);
        slVertical.setShowTickLabels(true);
        slVertical.setShowTickMarks(true);
       //default value shows
        slVertical.setValue(100);

        // Create a text in a pane
        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);

        // Create a border pane to hold text and scroll bars
        BorderPane pane = new BorderPane();
        pane.setCenter(paneForText);
        pane.setBottom(slHorizontal);
        pane.setRight(slVertical);


        // BIND THE SLIDER AND OBJECT AS WE WANT TO HANDLE
        // WITHOUT THIS SECTION ONLY WE HAVE 2 SEPERATED OBJECTS
        //  name.    value          . listener
        slHorizontal.valueProperty().addListener(ov ->
                text.setX(slHorizontal.getValue() * paneForText.getWidth() / slHorizontal.getMax()));

        // OR   text.setX(slHorizontal.getValue() / slHorizontal.getMax() * paneForText.getWidth());

        slVertical.valueProperty().addListener(ov ->
                text.setY((slVertical.getMax() - slVertical.getValue()) * paneForText.getHeight() / slVertical.getMax()));
        // OR   text.setY( slVertical.getValue() /  slVertical.getMax() * paneForText.getHeight()));



        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 450, 170);
        primaryStage.setTitle("SliderDemo"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}