package world.ucode;

import javafx.application.Application;
import javafx.stage.Stage;
import world.ucode.scene.SceneGameMenu;
import world.ucode.model.TamagotchiModel;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("unit-factory-ucode-tamagotchi");
        new SceneGameMenu(primaryStage);
        primaryStage.show();
    }

    public static void main(String[] args) {
        TamagotchiModel connectDatabase = new TamagotchiModel();
        connectDatabase.createNewTable();
        Application.launch(args);
    }
}