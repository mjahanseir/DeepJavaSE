package JavaFX;

import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class RadioButtonDemo extends CheckBoxDemo {
    @Override
    protected BorderPane getPane() {
        BorderPane pane = super.getPane();

        VBox paneForRadioButtons = new VBox(20);

        paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
        paneForRadioButtons.setStyle("-fx-border-color: green");
        paneForRadioButtons.setStyle("-fx-border-width: 2px; -fx-border-color: green");

        // create 3 radio button for each of Red and green and blue
        // for radio button because it works as group we need toggle to grouping all together
        RadioButton rbRed = new RadioButton("Red");

        RadioButton rbGreen = new RadioButton("Green");

        RadioButton rbBlue = new RadioButton("Blue");

        paneForRadioButtons.getChildren().addAll(rbRed, rbGreen, rbBlue);

        pane.setLeft(paneForRadioButtons);

        /////////////////////  TOGGLE GROUP for radio because for each time we have one selected radio
        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbBlue.setToggleGroup(group);

        /// EVENT HAndler for each and use Lambda notation

        rbRed.setOnAction(e -> {
            if (rbRed.isSelected()) {
                text.setFill(Color.RED);
            }
        });

        rbGreen.setOnAction(e -> {
            if (rbGreen.isSelected()) {
                text.setFill(Color.GREEN);
            }
        });

        rbBlue.setOnAction(e -> {
            if (rbBlue.isSelected()) {
                text.setFill(Color.BLUE);
            }
        });

        return pane;
    }
}
