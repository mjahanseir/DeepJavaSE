package JavaFX;


import javafx.geometry.Insets;
        import javafx.geometry.Pos;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextField;
        import javafx.scene.layout.BorderPane;

public class TextFieldDemo extends RadioButtonDemo {
    @Override
    protected BorderPane getPane() {
        // we have 2 border pane one for All
        BorderPane pane = super.getPane();
        // second for lable and textfield  in line 25
        BorderPane paneForTextField = new BorderPane();


        paneForTextField.setPadding(new Insets(5, 5, 5, 5));
        paneForTextField.setStyle("-fx-border-color: green");
        paneForTextField.setLeft(new Label("Enter a new message: "));


        // create text field
        TextField tf = new TextField();
        tf.setAlignment(Pos.BOTTOM_RIGHT);
        // Create new Border pane and set to this
        paneForTextField.setCenter(tf);
        pane.setTop(paneForTextField);

        tf.setOnAction(e -> text.setText(tf.getText()));

        return pane;
    }

}