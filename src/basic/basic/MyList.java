package basic;

import javafx.stage.Stage;

// Basic Imports
import javafx.scene.Scene;

// Button Imports
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

// Text Imports

// Layout Imports
import javafx.scene.layout.VBox;

public class MyList {
    public static void MyListScreen (Stage primaryStage) {
        Button HomeMenu = new Button();
        HomeMenu.setText("Back");
        HomeMenu.setMaxSize(100, 50);
        HomeMenu.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                Main.mainMenu(primaryStage);
            }
        });
        VBox MyListVBox = new VBox(HomeMenu);
        primaryStage.setScene(new Scene(MyListVBox));
    }
}
