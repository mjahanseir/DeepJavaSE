package COSC60220220214_Chapter16;

import javafx.application.Application;
        import javafx.stage.Stage;
        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.scene.Scene;
        import javafx.scene.control.ComboBox;
        import javafx.scene.control.Label;
        import javafx.scene.image.ImageView;
        import javafx.scene.layout.BorderPane;

public class C6ComboBoxDemo extends Application {
    // Declare an array of Strings for flag titles
    private String[] flagTitles = {"Canada", "China", "Denmark",
                                    "France", "Germany", "India", "Norway", "United Kingdom",
                                    "United States of America"
                                    };

    // Declare an ImageView array for the national flags of 9 countries
    private ImageView[] flagImage = {   new ImageView("image/ca.gif"),
                                        new ImageView("image/china.gif"),
                                        new ImageView("image/denmark.gif"),
                                        new ImageView("image/fr.gif"),
                                        new ImageView("image/germany.gif"),
                                        new ImageView("image/india.gif"),
                                        new ImageView("image/norway.gif"),
                                        new ImageView("image/uk.gif"),
                                        new ImageView("image/us.gif")
                                    };

    // Declare an array of strings for flag descriptions
    private String[] flagDescription = new String[9];

    // Declare and create a description pane
    private C4DescriptionPane descriptionPane = new C4DescriptionPane();

    // Create a combo box for selecting countries
    // like generic we use ComboBox<> here -> Look like list
    private ComboBox<String> cbo = new ComboBox<>(); // flagTitles);

    // Override the start method in the Application class
    @Override
    public void start(Stage primaryStage) {
        // Set text description
        flagDescription[0] = "The Canadian national flag ...";
        flagDescription[1] = "Description for China ... ";
        flagDescription[2] = "Description for Denmark ... ";
        flagDescription[3] = "Description for France ... ";
        flagDescription[4] = "Description for Germany ... ";
        flagDescription[5] = "Description for India ... ";
        flagDescription[6] = "Description for Norway ... ";
        flagDescription[7] = "Description for UK ... ";
        flagDescription[8] = "Description for US ... ";

        // Set the first country (Canada) for display
        setDisplay(0);

        // Add combo box and description pane to the border pane
        BorderPane pane = new BorderPane();

        //Another Borderpane
        BorderPane paneForComboBox = new BorderPane();

        paneForComboBox.setLeft(new Label("Select a country: "));
        paneForComboBox.setCenter(cbo);
        pane.setTop(paneForComboBox);
        cbo.setPrefWidth(400);
        cbo.setValue("Canada");

        //OBSERVABLE LIST ub class of LIST (GENERIC)
        ObservableList<String> items =  FXCollections.observableArrayList(flagTitles);
        cbo.getItems().addAll(items);
        pane.setCenter(descriptionPane);

        // Display the selected country
        cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 450, 170);
        // Set the stage title
        primaryStage.setTitle("ComboBoxDemo");
        // Place the scene in the stage
        primaryStage.setScene(scene);
        // Display the stage
        primaryStage.show();
    }

    /** Set display information on the description pane */
    public void setDisplay(int index) {
        descriptionPane.setTitle(flagTitles[index]);
        descriptionPane.setImageView(flagImage[index]);
        descriptionPane.setDescription(flagDescription[index]);
    }

}
