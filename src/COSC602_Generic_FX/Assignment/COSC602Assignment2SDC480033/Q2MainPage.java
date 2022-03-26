package Assign2;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Q2MainPage extends Application {
    Text textTop = new Text( "Welcome!");
    Text textBot = new Text( " ");
    public BorderPane getPane() {
        VBox paneForTop = new VBox(10);
        MenuBar menu = new MenuBar();
        Menu basics = new Menu("Basics");
        Menu lists = new Menu("Lists etc");
        menu.getMenus().addAll(basics, lists);
        MenuItem checkMenu = new MenuItem("Check Box");
        MenuItem radioMenu = new MenuItem("Radio Button");
        MenuItem comboMenu = new MenuItem("ComboBox");
        MenuItem sliderMenu = new MenuItem("Slider");
        basics.getItems().addAll(checkMenu, radioMenu);
        lists.getItems().addAll(comboMenu, sliderMenu);
        FlowPane textPaneTop = new FlowPane();
        textPaneTop.getChildren().add(textTop);
        textPaneTop.setAlignment(Pos.CENTER);
        paneForTop.getChildren().addAll(menu , textPaneTop);
        BorderPane pane = new BorderPane();
        pane.setTop(paneForTop);
        FlowPane paneBot = new FlowPane();
        paneBot.getChildren().add(textBot);
        paneBot.setAlignment(Pos.CENTER);
        pane.setCenter(paneBot);
        Q2_checkbox checkbox= new Q2_checkbox();
        Q2Radio radio= new Q2Radio();
        Q2ComboBox comboBox= new Q2ComboBox();
        Q2Slider slider= new Q2Slider();
        checkMenu.setOnAction(e-> System.out.println("checkbox"));
        radioMenu.setOnAction(e-> System.out.println("radi"));
        comboMenu.setOnAction(e-> System.out.println("combo"));
        sliderMenu.setOnAction(e-> System.out.println("slider"));
        return pane;
    }
    @Override
    public void start(Stage stage){
        Scene scene= new Scene(getPane(), 400,400);
        stage.setTitle("In Class Exercise 3");
        stage.setScene(scene);
        stage.show();
    }
}
