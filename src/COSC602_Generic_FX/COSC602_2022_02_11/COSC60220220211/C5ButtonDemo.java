package COSC60220220211;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;


public class C5ButtonDemo extends Application {

    Text text = new Text(50, 50, "JavaFX Programming");

    protected BorderPane getPane() {

        HBox paneForButtons = new HBox(20);
        Button btnLeft = new Button("Left", new ImageView("image/left.gif"));
        Button btnRight = new Button("Right", new ImageView("image/right.gif"));
//     Button btnLeft = new Button("Left", new ImageView("src/COSC60220220211/image/left.gif"));
//        Button btnRight = new Button("Right", new ImageView("src/COSC60220220211/image/right.gif"));

        paneForButtons.getChildren().addAll(btnLeft, btnRight);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setStyle("-fx-border-color: green");


        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);

        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);

        pane.setCenter(paneForText);

        btnLeft.setOnAction(e -> text.setX(text.getX() - 10));
        btnRight.setOnAction(e -> text.setX(text.getX() + 10));

        return pane;
    }

    @Override
    public void start(Stage mainStage) {
       Scene scene = new Scene(getPane(), 450, 200);
        mainStage.setTitle("ButtonDemo");
        mainStage.setScene(scene);
        mainStage.show();
    }
}