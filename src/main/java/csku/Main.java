package csku;
/**
 * Thun Rutthanawin 5810401015
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../expense.fxml"));
//        Pane pane = (Pane)root;

     //   Parent root = FXMLLoader.load(Main.class.getResource("../expense.fxml"));
        primaryStage.setTitle("Expense Lab");

        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
