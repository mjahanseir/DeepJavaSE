package COSC60220220214_Chapter16;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

public class C5TextAreaDemo extends Application {
  // Override the start method in the Application class
  @Override
  public void start(Stage primaryStage) {

    // Declare and create a description pane
    C4DescriptionPane descriptionPane = new C4DescriptionPane();

    // Set title, text and image in the description pane
    descriptionPane.setTitle("Canada");
    String description = "The Canadian national flag ...";
    descriptionPane.setImageView(new ImageView("image/ca.gif"));
    descriptionPane.setDescription(description);

    // Create a scene and place it in the stage
    Scene scene = new Scene(descriptionPane, 450, 300);
    // Set the stage title
    primaryStage.setTitle("TextAreaDemo");
    // Place the scene in the stage
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
