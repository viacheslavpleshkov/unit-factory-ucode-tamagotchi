package world.ucode;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {
    public static void main(String[] args) {
        TamagotchiModel connectDatabase = new TamagotchiModel();
        connectDatabase.createNewTable();
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("tamagotchi");
        new SceneGameMenu(primaryStage);
        primaryStage.show();
    }
}