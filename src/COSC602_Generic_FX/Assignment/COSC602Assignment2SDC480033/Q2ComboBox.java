package Assign2;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
public class Q2ComboBox extends Q2MainPage {
    @Override
    public BorderPane getPane() {
        BorderPane pane = super.getPane();
        ComboBox<String> combo = new ComboBox<>();
        String[] lists = {"Player1", "Player2", "Player3", "Player4", "Player5", "Player6", "Player7", "Player8", "Player9", "Player10"};
        Label lblName = new Label("Testing...");
        lblName.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        textTop.setText("Combo Box");
        VBox paneForCombo = new VBox(10);
        paneForCombo.getChildren().addAll(combo, lblName);
        paneForCombo.setAlignment(Pos.TOP_CENTER);
        ObservableList<String> items = FXCollections.observableArrayList(lists);
        combo.getItems().addAll(items);
        combo.setOnAction(e -> lblName.setText(combo.getValue()));
        pane.setCenter(paneForCombo);
        return pane;
    }
}