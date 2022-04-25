package JDBC.Assign_Threading_Network_DB;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.*;
import java.net.Socket;
public class Client extends Application{
    DataOutputStream toServer = null;
    DataInputStream fromServer = null;
    TextArea txtResults = null;
    String fname;
    String lname;
    public void start(Stage mainStage) {
        //region GUI
        BorderPane mainWindowLayout = new BorderPane();
        Label lblHeading = new Label("Film Database Search");
        lblHeading.setFont(new Font("Arial", 30));
        mainWindowLayout.setTop(lblHeading);
        mainWindowLayout.setAlignment(lblHeading, Pos.CENTER);
        mainWindowLayout.setPadding(new Insets(20, 20, 20, 20));
        Label lblFirstName = new Label("First Name : ");
        Label lblLastName = new Label("Last Name : ");
        Label lblResult = new Label("Results : ");
        TextField txtFirstName = new TextField();
        TextField txtLastName = new TextField();
        txtResults = new TextArea();
        txtResults.setPrefWidth(400);
        Button btnSearch = new Button("Search");
        btnSearch.setPrefWidth(100);
        GridPane fieldsPane = new GridPane();
        GridPane fieldSubPane1 = new GridPane();
        GridPane fieldSubPane2 = new GridPane();
        HBox fieldSubPane3 = new HBox();
        fieldsPane.setPadding(new Insets(20, 20, 20, 20));
        fieldSubPane1.setHgap(10);
        fieldSubPane2.setHgap(10);
        fieldsPane.setVgap(15);
        fieldSubPane1.addRow(0,lblFirstName,txtFirstName,lblLastName,txtLastName);
        fieldSubPane2.addRow(0,lblResult,txtResults);
        fieldSubPane3.getChildren().add(0,btnSearch);
        fieldsPane.addRow(0,fieldSubPane1);
        fieldsPane.addRow(1,fieldSubPane2);
        GridPane.setValignment(lblResult, VPos.TOP);
        fieldsPane.setAlignment(Pos.CENTER);
        mainWindowLayout.setCenter(fieldsPane);
        mainWindowLayout.setBottom(fieldSubPane3);
        fieldSubPane3.setAlignment(Pos.CENTER);
        //endregion

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        btnSearch.setOnAction(e->{
            try {
                 fname= txtFirstName.getText().trim();
                 lname= txtLastName.getText().trim();
                for(int i=1 ; i<fname.length()-1; i++){
                    if(fname.charAt(i)=='%') {
                        alert.setHeaderText("This is not allowed");
                        alert.showAndWait();
                    }
                }
                if(  !(fname.isEmpty())  ){
                    toServer.writeUTF(lname);
                }else if(  !(lname.isEmpty()) ){
                    toServer.writeUTF(fname);
                }else{
                    alert.setHeaderText("Please Enter first and Last name");
                    alert.showAndWait();
                }
                toServer.writeUTF(fname + "," + lname);
                toServer.flush();
                String resultFromServer=fromServer.readUTF();
                txtResults.appendText("Movie Name: " + resultFromServer);
            } catch (IOException ex) {
            }
        });
        Scene mainScene = new Scene(mainWindowLayout, 600, 400);
        mainStage.setTitle("Film Actor Search Form");
        mainStage.setScene(mainScene);
        mainStage.show();
        try{
            Socket socket = new Socket("localhost", 8001);
            fromServer = new DataInputStream(socket.getInputStream());
            toServer = new DataOutputStream(socket.getOutputStream());
        }catch (IOException ioe){
        }
    }
    public static void main(String[] args) {
        launch(args);
    }

}
