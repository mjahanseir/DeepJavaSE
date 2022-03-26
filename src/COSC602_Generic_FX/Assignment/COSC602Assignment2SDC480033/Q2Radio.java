package Assign2;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
public class Q2Radio extends Q2MainPage {
    @Override
    public BorderPane getPane(){
        BorderPane pane = super.getPane();
        VBox paneForRadio= new VBox(5);
        paneForRadio.setAlignment(Pos.TOP_CENTER);
        paneForRadio.setPadding(new Insets(5, 5, 5, 5));
        VBox paneForImage= new VBox(5);
        paneForImage.setAlignment(Pos.TOP_CENTER);
        paneForImage.setPadding(new Insets(5, 5, 5, 5));
        Image red= new Image("Assign2/images/redlight.jpg");
        Image yellow= new Image("Assign2/images/yellowlight.jpg");
        Image green= new Image("Assign2/images/greenlight.jpg");
        ImageView image= new ImageView(red);
        image.setFitWidth(150);
        image.setFitHeight(150);
        textTop.setText("Radio Button");
        Text text= new Text("Testing...");
        RadioButton radioRed = new RadioButton("Red");
        RadioButton radioYellow = new RadioButton("Yellow");
        RadioButton radioGreen = new RadioButton("Green");
        paneForRadio.getChildren().addAll(radioRed, radioYellow, radioGreen);
        ToggleGroup group = new ToggleGroup();
        radioRed.setToggleGroup(group);
        radioYellow.setToggleGroup(group);
        radioGreen.setToggleGroup(group);
        paneForImage.getChildren().add(image);
        VBox img= new VBox(10);
        img.setPadding(new Insets(50, 5, 5, 5));
        img.setAlignment(Pos.TOP_CENTER);
        img.getChildren().addAll( text, image);
        pane.setLeft(paneForRadio);
        pane.setCenter(img);
        radioRed.setOnAction(e -> {
            if (radioRed.isSelected()) {
                image.setImage(red);
                text.setText("STOP – Red Light");
            }
        });
        radioYellow.setOnAction(e -> {
            if (radioYellow.isSelected()){
                image.setImage(yellow);
                text.setText("CAUTION – Yellow");
            }
        });
        radioGreen.setOnAction(e -> {
            if (radioGreen.isSelected()){
                image.setImage(green);
                text.setText("GET GOING!! – Green");
            }
        });
        return pane;
    }
}
