package COSC60220220216;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class C3MenuDemo extends Application {

    /**             Step 1 :        CREATE A MENU BAR           **/
    /**             Step 2 :        CREATE MENUs                **/
    /**             Step 3 :        Add the MENUs  To MENUBAR   **/
    /**             Step 4 :        Create  MenuItems           **/
    /**             Step 5 :        Add  MenuItems  that created to the menu          **/



    // GLOBAL and out of menu because we need to access
    private TextField tfNumber1 = new TextField();
    private TextField tfNumber2 = new TextField();
    private TextField tfResult = new TextField();

    @Override // Override the start method in the Application class
    public void start(Stage stage) {

        /**             Step 1 :        CREATE A MENU BAR           **/

        MenuBar menuBar = new MenuBar();


        /**             Step 2 :        CREATE MENUs           **/

        Menu menuOperation = new Menu("Operation");
        Menu menuExit = new Menu("Exit");


        /**             Step 3 :        Add the MENUs  To MENUBAR   **/

        menuBar.getMenus().addAll(menuOperation, menuExit);


        /**             Step 4 :        Create  MenuItems           **/

        MenuItem menuItemAdd = new MenuItem("Add");
        MenuItem menuItemSubtract = new MenuItem("Subtract");
        MenuItem menuItemMultiply = new MenuItem("Multiply");
        MenuItem menuItemDivide = new MenuItem("Divide");


        /**             Step 5 :        Add  MenuItems  that created to the menu          **/

        menuOperation.getItems().addAll(menuItemAdd, menuItemSubtract,  menuItemMultiply, menuItemDivide);


        /**             Step 6 :       Creat and Add  Exit menu          **/

        MenuItem menuItemClose = new MenuItem("Close");
        menuExit.getItems().add(menuItemClose);



//      NAME .set Accelerator ( KeyCombination . keyCombination ( "SHORT CUT KEY" )  );
        menuItemAdd.setAccelerator( KeyCombination.keyCombination("Ctrl+A"));
        menuItemSubtract.setAccelerator( KeyCombination.keyCombination("Ctrl+S"));
        menuItemMultiply.setAccelerator( KeyCombination.keyCombination("Ctrl+M"));
        menuItemDivide.setAccelerator( KeyCombination.keyCombination("Ctrl+D"));



//      CREATE 2 text filed as input and one text field as result
        HBox hBox1 = new HBox(5);
        tfNumber1.setPrefColumnCount(2);
        tfNumber2.setPrefColumnCount(2);
        tfResult.setPrefColumnCount(2);


//      Add all three above text field to HBox as created
        hBox1.getChildren().addAll(new Label("Number 1:"), tfNumber1,
                                    new Label("Number 2:"), tfNumber2,
                                    new Label("Result:"), tfResult);
        hBox1.setAlignment(Pos.CENTER);

//      create  button foreach
        HBox hBox2 = new HBox(5);
        Button btAdd = new Button("Add");
        Button btSubtract = new Button("Subtract");
        Button btMultiply = new Button("Multiply");
        Button btDivide = new Button("Divide");
        hBox2.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide);
        hBox2.setAlignment(Pos.CENTER);


        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(menuBar, hBox1, hBox2);


        Scene scene = new Scene(vBox, 300, 250);
        stage.setTitle("MenuDemo"); // Set the window title
        stage.setScene(scene); // Place the scene in the window
        stage.show(); // Display the window



        /**                    Menu EVENT HANDLER                    */

        // Handle menu actions
        menuItemAdd.setOnAction       ( e  ->  perform('+'));
        menuItemSubtract.setOnAction  ( e  ->  perform('-'));
        menuItemMultiply.setOnAction  ( e  ->  perform('*'));
        menuItemDivide.setOnAction    ( e  ->  perform('/'));
        menuItemClose.setOnAction     ( e  ->  System.exit(0));   // System.exit(0) is closing


        /**
         *   menuItemAdd.setOnAction       ( e  ->  perform('+'));  LAMBDA exp.
         *  is EQUIVALENT :
         *   class MenuHandler implements EventHandler<ActionEvent>{
         *             public void handle(ActionEvent){
         *                 perform("+");
         *             }
         *         }
         */


        // Handle button actions
        btAdd.setOnAction(e -> perform('+'));
        btSubtract.setOnAction(e -> perform('-'));
        btMultiply.setOnAction(e -> perform('*'));
        btDivide.setOnAction(e -> perform('/'));
    }



    /**                       CREATE A CALCULATION METHOD FOR FORM                          **/

    private void perform(char operator) {
        double number1 = Double.parseDouble(tfNumber1.getText());
        double number2 = Double.parseDouble(tfNumber2.getText());

        double result = 0;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
        }
        tfResult.setText(result + "");
    }
}