package Assign2;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Q2CheckBox extends Q2MainPage {
    @Override
    public BorderPane getPane() {
        BorderPane pane = super.getPane();
        Font fontBI = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 14);
        Font fontB = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14);
        Font fontI = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.ITALIC, 14);
        Font fontN = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 14);
        BorderPane borderPane = new BorderPane();
        textTop.setText("CheckBox");
        textBot.setText("Testing...");
        textBot.setFont(fontN);
        VBox chboxGrp = new VBox(10);
        chboxGrp.setPadding(new Insets(100, 5, 5, 5));
        CheckBox chkBold = new CheckBox("Bold");
        CheckBox chkItalic = new CheckBox("Italic");
        chboxGrp.getChildren().addAll(chkBold, chkItalic);
        borderPane.setLeft(chboxGrp);
        pane.getChildren().addAll(borderPane);
        EventHandler<ActionEvent> handler = e -> {
            if (chkBold.isSelected() && chkItalic.isSelected())
                textBot.setFont(fontBI);
            else if (chkBold.isSelected())
                textBot.setFont(fontB);
            else if (chkItalic.isSelected())
                textBot.setFont(fontI);
            else
                textBot.setFont(fontN);
        };
        chkBold.setOnAction(handler);
        chkItalic.setOnAction(handler);
        return pane;
    }

}
