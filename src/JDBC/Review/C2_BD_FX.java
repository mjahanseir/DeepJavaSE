package JDBC.Review;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;

public class C2_BD_FX extends Application {
    private Statement stmt;
    private TextField tfSSN = new TextField();
    private TextField tfCourseId = new TextField();
    private Label lblStatus = new Label();
    ResultSet resultSet;
    Statement st;
    Connection connection;
    @Override
    public void start(Stage primaryStage) {
        Button btShowGrade = new Button("Show Grade");
        HBox hBox = new HBox(5);
        hBox.getChildren().addAll(new Label("SSN"), tfSSN, new Label("Course ID"), tfCourseId, (btShowGrade));
        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(hBox, lblStatus);
        tfSSN.setPrefColumnCount(6);
        tfCourseId.setPrefColumnCount(6);
        btShowGrade.setOnAction(e -> {
            String ssn = tfSSN.getText();
            String courseId = tfCourseId.getText();
            try {
                ResultSet resultSet= st.executeQuery("SELECT firstName, mi, lastName, title, grade" +
                        " FROM Student, Enrollment, Course  " +
                        " WHERE Student.ssn = '" + ssn + "' and Enrollment.courseId = '" + courseId +
                        "' and Enrollment.courseId = Course.courseId " +
                        " and Enrollment.ssn = Student.ssn");

                while (resultSet.next()){
                    lblStatus.setText(
                            resultSet.getString(3)+"  "+
                            resultSet.getString(2)+ " "+
                            resultSet.getString(1)+ " course : "+
                            resultSet.getString(4)+ " grade : "+
                            resultSet.getString(5)
                    );
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        });
        Scene scene = new Scene(vBox, 420, 80);
        primaryStage.setScene(scene);
        primaryStage.show();
        try{
             connection= DriverManager.getConnection("jdbc:mysql://localhost/javabook", "scott", "tiger");
            System.out.println("Server Connected");
             st= connection.createStatement();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

}
