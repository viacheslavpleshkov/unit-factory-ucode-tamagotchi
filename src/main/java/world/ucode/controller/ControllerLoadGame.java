package world.ucode.controller;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import world.ucode.scene.SceneGameMenu;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerLoadGame extends ControllerObject {

    public ControllerLoadGame(Stage primaryStage) {
        super(primaryStage);
    }

    @FXML
    private void ClickedGotoManu() {
        new SceneGameMenu(primaryStage);
    }

}