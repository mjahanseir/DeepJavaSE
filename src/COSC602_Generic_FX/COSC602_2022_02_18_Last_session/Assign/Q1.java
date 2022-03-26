package Assign;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import javax.sound.sampled.Line;

public class Q1 extends Application {
    @Override
    public void start(Stage stage) {

        GridPane pane= new GridPane();
        pane.setAlignment(Pos.TOP_RIGHT);
        pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
        pane.setHgap(5);
        pane.setVgap(5);
///top

//TOP Lable

        Label lblTitle=new Label("Registration/Login");
        lblTitle.setFont(Font.font(20));
        lblTitle.setAlignment(Pos.TOP_CENTER);
        // page.add(Node, colIndex, rowIndex, colSpan, rowSpan):
        pane.add(lblTitle,0,0,2,1);
        GridPane.setHalignment(lblTitle,HPos.CENTER);

        Label lblSubTitle= new Label("Enter an email address and password");
        pane.add(lblSubTitle,0,1,1,1);
//Lable  Email
        Label lblEmail= new Label("Email to use:");
        pane.add(lblEmail,0, 2,1,1);
        GridPane.setHalignment(lblEmail,HPos.RIGHT);

        TextField txtEmail= new TextField();
        pane.add(txtEmail, 1, 2,2,1);

// Lable password
        Label lblPassword= new Label("Enter a password:");
        pane.add(lblPassword,0, 3,1,1);

        TextField txtPassword= new TextField();
        pane.add(txtPassword,1, 3,2,1);

//Lable Confirm
        Label lblConfirm= new Label("Confirm your password:");
        pane.add(lblConfirm, 0, 4,1,1);

        TextField txtConfirm= new TextField();
        pane.add(txtConfirm, 1, 4,2,1);




//Line
      //  Line line = new Line(0,400);


//Buttom
        Button btnRegister = new Button("Register");
        pane.add(btnRegister, 1, 5,1,1);
       // GridPane.setHalignment(btnRegister, HPos.RIGHT);



/// //////////   bottom


//Top Lable
        Label lblRegistered=new Label("Already Registered to the"+ "\n " +" Amazing COSC603 Program ");
        pane.add(lblRegistered, 0, 7);
        lblRegistered.setFont(Font.font(20));
        pane.add(new Label("Enter an email address and password"), 0, 1);
        lblRegistered.setStyle("-fx-text-alignment: CENTER");

        Label lblLogin= new Label("Go ahead and login then");
        pane.add(lblLogin,0,9,1,1);


//Lable User name
        Label lblUserName= new Label("User name:");
        pane.add(lblUserName,0, 10,1,1);

        TextField txtUserName= new TextField();
        pane.add(txtUserName, 1, 10,2,1);

//Lable Password
        Label lblPassword2= new Label("Password:");
        pane.add(lblPassword2,0, 11,1,1);

        TextField txtPassword2= new TextField();
        pane.add(txtPassword2,1, 11,2,1);

//Buttom
        Button btnLogin = new Button("login");
        pane.add(btnLogin, 1, 12,1,1);
       GridPane.setHalignment(btnLogin,HPos.RIGHT);

        Scene scene= new Scene(pane, 400,425);
        stage.setScene(scene);
        stage.setTitle("The Amazing COSC603 Registration/Login");
        stage.show();
    }

}
