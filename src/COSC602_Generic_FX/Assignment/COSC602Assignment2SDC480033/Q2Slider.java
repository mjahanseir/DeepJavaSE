package Assign2;
import javafx.geometry.Pos;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
public class Q2Slider extends Q2MainPage {
    @Override
    public BorderPane getPane() {
        BorderPane pane = super.getPane();
        Slider slider = new Slider();
        Text text = new Text( "test");
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        textTop.setText("Slider");
        slider.valueProperty().addListener(ov->
                text.setText(String.valueOf((int)slider.getValue()))
        );
        VBox paneForSlider= new VBox(10);
        paneForSlider.setAlignment(Pos.TOP_CENTER);
        paneForSlider.getChildren().addAll(slider, text);
        pane.setCenter(paneForSlider);
        return pane;
    }
}