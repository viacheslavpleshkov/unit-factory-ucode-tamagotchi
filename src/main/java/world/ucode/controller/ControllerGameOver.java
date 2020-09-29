package world.ucode.controller;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import world.ucode.scene.SceneGameMenu;

public class ControllerGameOver extends ControllerObject {

    public ControllerGameOver(Stage primaryStage) {
        super(primaryStage);
    }

    @FXML
    private void ClickedGotoManu() {
        new SceneGameMenu(primaryStage);
    }

}