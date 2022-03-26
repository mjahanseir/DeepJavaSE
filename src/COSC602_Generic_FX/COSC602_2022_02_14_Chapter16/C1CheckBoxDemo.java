package COSC60220220214_Chapter16;

import COSC60220220211.C5ButtonDemo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;


public class C1CheckBoxDemo extends C5ButtonDemo {
    @Override
    protected BorderPane getPane() {

        BorderPane pane = super.getPane();

        Font fontBoldItalic = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20);
        Font fontBold       = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20);
        Font fontItalic     = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.ITALIC, 20);
        Font fontNormal     = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 20);

        text.setFont(fontNormal);

        VBox paneForCheckBoxes = new VBox(20);
        paneForCheckBoxes.setPadding(new Insets(5, 5, 5, 5));
        paneForCheckBoxes.setStyle("-fx-border-color: green");

        CheckBox chkBold = new CheckBox("Bold");
        CheckBox chkItalic = new CheckBox("Italic");

        paneForCheckBoxes.getChildren().addAll(chkBold, chkItalic);

        pane.setRight(paneForCheckBoxes);

        /////////////////////////////  SET EVENT HANDLER
        ////// Lambda Notation

        EventHandler<ActionEvent> handler = e -> {
            // we started by checking which checkbox is selected
            //if both checked
            // Both check boxes checked

            if (chkBold.isSelected() && chkItalic.isSelected()) {
                text.setFont(fontBoldItalic);
            }

            // The Bold check box checked

            else if (chkBold.isSelected()) {
                text.setFont(fontBold);
            }

            // The Italic check box checked

            else if (chkItalic.isSelected()) {
                text.setFont(fontItalic);
            }

            // Both check boxes unchecked

            else {
                text.setFont(fontNormal);
            }
        };

        //checking each checkbox is checked
        //registration for both
        chkBold.setOnAction(handler);
        chkItalic.setOnAction(handler);

        return pane;
    }
}