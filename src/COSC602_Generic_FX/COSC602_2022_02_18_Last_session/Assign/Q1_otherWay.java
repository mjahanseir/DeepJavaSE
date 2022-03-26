package Assign;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Q1_otherWay extends Application {
    @Override
    public void start(Stage stage) {

        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(15));
        ///////////TOP
        VBox top= new VBox(15);
        pane.setTop(top);
        top.setPadding(new Insets(15));
        top.setAlignment(Pos.CENTER_RIGHT);

        Label lblTitle=new Label("Registration/Login");
        lblTitle.setFont(Font.font(20));
        lblTitle.setAlignment(Pos.TOP_CENTER);

        Label lblSubTitle= new Label("Enter an email address and password");

        Label lblEmail= new Label("Email to use:");
        TextField txtEmail= new TextField();

        Label lblPassword= new Label("Enter a password:");
        TextField txtPassword= new TextField();

        Label lblConfirm= new Label("Confirm your password:");
       TextField txtConfirm= new TextField();

        Button btnRegister = new Button("Register");



        top.getChildren().addAll(lblTitle,lblSubTitle,
                lblEmail,txtEmail, lblPassword,txtPassword,lblConfirm,txtConfirm,btnRegister);




        ///////////BOTTOM
        HBox down= new HBox(15);
        pane.setCenter(createHbox());
        down.setPadding(new Insets(15));
        down.setAlignment(Pos.CENTER_RIGHT);



        //down.getChildren().addAll(search,text);




        Scene scene = new Scene(pane, 400, 425);
        stage.setScene(scene);
        stage.setTitle("The Amazing COSC603 Registration/Login");
        stage.show();
    }


    public Pane createHbox(){
        HBox hBox= new HBox(15);
        hBox.setPadding(new Insets(15));
        hBox.setAlignment(Pos.CENTER_RIGHT);
        Label lbl= new Label("some text");
        Button search= new Button("Search");
        TextField text=new TextField();
        hBox.getChildren().addAll(search,text);
        return hBox;
    }

}
