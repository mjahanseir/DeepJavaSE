package COSC60220220216;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class C1ListViewDemo extends Application {

    private String[] flagTitles = {"Canada", "China", "Denmark", "France", "Germany", "India", "Norway", "United Kingdom", "United States"};

    private ImageView[] flagImage = {new ImageView("image/ca.gif"),
            new ImageView("image/china.gif"),
            new ImageView("image/denmark.gif"),
            new ImageView("image/fr.gif"),
            new ImageView("image/germany.gif"),
            new ImageView("image/india.gif"),
            new ImageView("image/norway.gif"),
            new ImageView("image/uk.gif"),
            new ImageView("image/us.gif")};

    @Override
    public void start(Stage primaryStage){

        ListView<String> lv = new ListView<>();
        ObservableList<String> items= FXCollections.observableArrayList(flagTitles);
        lv.getItems().addAll(items);

        lv.setPrefSize(200, 400);
        lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


        // Create a pane to hold image views
        FlowPane imagePane = new FlowPane(10,10);
        BorderPane pane = new BorderPane();
        pane.setLeft(new ScrollPane(lv));
        pane.setCenter(imagePane);


        lv.getSelectionModel().selectedItemProperty().addListener(
                e -> {
                    imagePane.getChildren().clear();
                    // getSelectedIndices get index of each selected list and attach each flag to the imagePane
                    for (Integer i: lv.getSelectionModel().getSelectedIndices()) {
                        imagePane.getChildren().add(flagImage[i]);
                    }
                });



                Scene scene = new Scene(pane,450, 170);
        primaryStage.setTitle("ListView Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
