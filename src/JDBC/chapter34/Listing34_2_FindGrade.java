package JDBC.chapter34;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.sql.*;

public class Listing34_2_FindGrade extends Application {
  // Statement for executing queries
  private Statement stmt;
  private TextField tfSSN = new TextField();
  private TextField tfCourseId = new TextField();
  private Label lblStatus = new Label();
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Initialize database connection and create a Statement object
    initializeDB();

    Button btShowGrade = new Button("Show Grade");
    HBox hBox = new HBox(5);
    hBox.getChildren().addAll(new Label("SSN"), tfSSN, new Label("Course ID"), tfCourseId, (btShowGrade));

    VBox vBox = new VBox(10);
    vBox.getChildren().addAll(hBox, lblStatus);
    
    tfSSN.setPrefColumnCount(6);
    tfCourseId.setPrefColumnCount(6);
    btShowGrade.setOnAction(e -> showGrade());
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(vBox, 420, 80);
    primaryStage.setTitle("FindGrade"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage   
  }

  private void initializeDB() {
    try {
      // Establish a connection
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javabook", "scott", "tiger");
      System.out.println("Database connected");

      // Create a statement
      stmt = connection.createStatement();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  private void showGrade() {
    String ssn = tfSSN.getText();
    String courseId = tfCourseId.getText();
    try {
      String queryString = "SELECT firstName, mi, lastName, title, grade" +
                            " FROM Student, Enrollment, Course  " +
                            " WHERE Student.ssn = '" + ssn + "' and Enrollment.courseId = '" + courseId +
                            "' and Enrollment.courseId = Course.courseId " +
                            " and Enrollment.ssn = Student.ssn";

      ResultSet resultSet = stmt.executeQuery(queryString);

      if (resultSet.next()) {
        String lastName = resultSet.getString(1);
        String mi = resultSet.getString(2);
        String firstName = resultSet.getString(3);
        String title = resultSet.getString(4);
        String grade = resultSet.getString(5);

        // Display result in a label
        lblStatus.setText(firstName + " " + mi +  " " + lastName + "'s grade on course " + title + " is " + grade);
      } else {
        lblStatus.setText("Not found");
      }
    }
    catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
}
