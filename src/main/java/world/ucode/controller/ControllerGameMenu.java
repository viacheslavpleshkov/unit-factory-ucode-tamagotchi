package world.ucode.controller;

import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import world.ucode.scene.SceneLoadGame;
import world.ucode.scene.SceneNewGame;

public class ControllerGameMenu extends ControllerObject {
    @FXML
    Button NewGameButton;
    @FXML
    Button LoadGameButton;
    @FXML
    Button ClickedExitButton;

    public ControllerGameMenu(Stage primaryStage) {
        super(primaryStage);
    }

    @FXML
    private void ClickedNewGame() {
        new SceneNewGame(primaryStage);
    }

    @FXML
    private void EnteredNewGame() {
        NewGameButton.setStyle(styleHover);
    }

    @FXML
    private void ExitedNewGame() {
        NewGameButton.setStyle(style);
    }

    @FXML
    private void ClickedLoadGame() {
        new SceneLoadGame(primaryStage);
    }

    @FXML
    private void EnteredLoadGame() {
        LoadGameButton.setStyle(styleHover);
    }

    @FXML
    private void ExitedLoadGame() {
        LoadGameButton.setStyle(style);
    }

    @FXML
    private void ClickedExit() {
        System.exit(0);
    }

    @FXML
    private void EnteredExit() {
        ClickedExitButton.setStyle(styleHover);
    }

    @FXML
    private void ExitedExit() {
        ClickedExitButton.setStyle(style);
    }
}