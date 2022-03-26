package COSC60220220202JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;

public class ShowImage extends Application {
    @Override
    public void start(Stage stage)  {

        Pane pane=new HBox(10);                       //////// Space That shows between objects
        pane.setPadding(new Insets(5,5,5,5)); ///////  padding around the object
        // / INSETS 5 px around of each  TOP,LEFT BOTTOM RIGHT all of tfbr all things not for one or betwwen objects
        Image image= new Image("COSC60220220202JavaFX/images/ca.gif");
        pane.getChildren().add(new ImageView(image));

        ImageView imageView2= new ImageView(image);
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(100);
        pane.getChildren().add(imageView2);


        ImageView imageView3= new ImageView(image);
        imageView3.setRotate(90);
        pane.getChildren().add(imageView3);

        Scene scene = new Scene(pane);
        stage.setTitle("Show an Image");
        stage.setScene(scene);

        stage.show();

    }
}
