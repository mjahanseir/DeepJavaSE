package IO.AssignmentIO;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.*;
import java.util.ArrayList;

public class Form extends Application {

    File file = new File("src/IO/AssignmentIO/file.studat");
    static ArrayList<Student> std = new ArrayList<>();
    int count = 1;
    static int index = 0;
    static TextField txtStudentNum, txtProgram, txtLastName, txtEmail , txtFirstName;



    @Override
    public void start(Stage stage) throws Exception {
        //region  Header of Form
        VBox root = new VBox(5);
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setAlignment(Pos.CENTER);
        ///////////////////////////////////////////////////////////////
        Label lblTitle = new Label("Student Information");
        lblTitle.setFont(Font.font("Arial", 25));
        root.getChildren().addAll(lblTitle);
        //endregion
        //region  Main of Form
        GridPane mainGrid = new GridPane();
        mainGrid.setHgap(10);
        mainGrid.setVgap(10);
        mainGrid.setAlignment(Pos.CENTER);
        mainGrid.setPadding(new Insets(5, 10, 10, 10));
        ////////////////            Student#   0,0  1,0     ////////////////
        Label lblStudentNum = new Label("Student #:");
        mainGrid.add(lblStudentNum, 0, 0);
        GridPane.setHalignment(lblStudentNum, HPos.RIGHT);
        txtStudentNum = new TextField();
        mainGrid.add(txtStudentNum, 1, 0);
        ////////////////            Program    2,0 3,0   ////////////////
        Label lblProgram = new Label("Program:");
        mainGrid.add(lblProgram, 2, 0);
        GridPane.setHalignment(lblProgram, HPos.RIGHT);
        txtProgram = new TextField();
        mainGrid.add(txtProgram, 3, 0);
        ////////////////            First Name   0,1  1,1   ////////////////
        Label lblFirstName = new Label("FirstName:");
        mainGrid.add(lblFirstName, 0, 1);
        GridPane.setHalignment(lblFirstName, HPos.RIGHT);
        txtFirstName = new TextField();
        mainGrid.add(txtFirstName, 1, 1);
        ////////////////            Last Name    2,1  3,1  ////////////////
        Label lblLastName = new Label("FirstName:");
        mainGrid.add(lblLastName, 2, 1);
        GridPane.setHalignment(lblLastName, HPos.RIGHT);
        txtLastName = new TextField();
        mainGrid.add(txtLastName, 3, 1);
        ////////////////              Email    0,2   1,2   ////////////////
        Label lblEmail = new Label("Email:");
        mainGrid.add(lblEmail, 0, 2);
        GridPane.setHalignment(lblEmail, HPos.RIGHT);
        txtEmail = new TextField();
        mainGrid.add(txtEmail, 1, 2);
        ////////////////              Course    0,3  1,3    ////////////////
        Label lblCourse = new Label("Course:");
        mainGrid.add(lblCourse, 0, 3);
        GridPane.setValignment(lblCourse, VPos.TOP);
        GridPane.setHalignment(lblCourse, HPos.RIGHT);
        //mainGrid.add(txtCourse, 1, 3);
        ////////////////              Save       2,3    ////////////////
        CheckBox saveCourse = new CheckBox("Save with Course Listing");
        mainGrid.add(saveCourse, 2, 3, 3, 3);
        GridPane.setValignment(saveCourse, VPos.TOP);
        GridPane.setHalignment(saveCourse, HPos.LEFT);
        //endregion
        //region  Bottom of Form
        HBox footer = new HBox(10);
        footer.setAlignment(Pos.CENTER);
        Button loadData = new Button("Load Data");
        loadData.setPrefSize(100, 0);
        Button leftArrow = new Button("<");
        Button rightArrow = new Button(">");
        Button save = new Button("save");
        save.setPrefSize(100, 0);
        footer.getChildren().addAll(loadData, leftArrow, rightArrow, save);
        //endregion
        //////////////////////////////////////  Create a data file

        loadData.setOnAction(e -> {
            try {
                loadStudent(file);
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        });
//        rightArrow.setOnAction(e -> {
//            save.setDisable(false);
//            leftArrow.setDisable(false);
//            count++;
//            if (count <= 15) {
//                index += 8;
//                txtStundentNum.setText(std.get(0 + index));
//                txtProgram.setText(std.get(1 + index));
//                txtFirstName.setText(std.get(2 + index));
//                txtLastName.setText(std.get(3 + index));
//                txtEmail.setText(std.get(4 + index));
//                txtCourse.setText(std.get(5 + index) + "\n" + std.get(6 + index) + "\n" + std.get(7 + index));
//            } else {
//                index += 5;
//                txtStundentNum.setText(std.get(0 + index));
//                txtProgram.setText(std.get(1 + index));
//                txtFirstName.setText(std.get(2 + index));
//                txtLastName.setText(std.get(3 + index));
//                txtEmail.setText(std.get(4 + index));
//                txtCourse.setText("");
//            }
//            if (count == 20)
//                rightArrow.setDisable(true);
//        });
//        leftArrow.setOnAction(e -> {
//            save.setDisable(false);
//            count--;
//            if (count <= 15 && index >= 8) {
//                index -= 8;
//                txtStundentNum.setText(std.get(0 + index));
//                txtProgram.setText(std.get(1 + index));
//                txtFirstName.setText(std.get(2 + index));
//                txtLastName.setText(std.get(3 + index));
//                txtEmail.setText(std.get(4 + index));
//                txtCourse.setText(std.get(5 + index) + "\n" + std.get(6 + index) + "\n" + std.get(7 + index));
//            } else {
//                index -= 5;
//                txtStundentNum.setText(std.get(0 + index));
//                txtProgram.setText(std.get(1 + index));
//                txtFirstName.setText(std.get(2 + index));
//                txtLastName.setText(std.get(3 + index));
//                txtEmail.setText(std.get(4 + index));
//                txtCourse.setText("");
//            }
//            if (count == 1)
//                leftArrow.setDisable(true);
//        });
//        save.setOnAction(e -> {
//            save.setDisable(true);
//            try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
//                System.out.println("Current file length is " + raf.length());
//                for (int i = 0; i < 8; i++)
//                    raf.writeUTF(String.valueOf(i));
//                raf.setLength(0);
//                raf.seek(144);
//
//            } catch (FileNotFoundException fe) {
//                fe.printStackTrace();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        });


        root.getChildren().addAll(mainGrid, footer);
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Student Information Form");
        stage.show();
    }

    public static void loadStudent(File file) throws IOException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                std.add((Student) ois.readObject());
            }
        } catch (EOFException | ClassNotFoundException e){
            System.out.println("Done!");
        }
    }

    public static void display(){
        txtStudentNum.setText(String.valueOf(std.get(index).getStudentId()));
        txtProgram.setText(std.get(index).getProgram());
        txtFirstName.setText(std.get(index).getfName());
        txtLastName.setText(std.get(index).getlName());
        txtEmail.setText(std.get(index).getEmail());


    }
}