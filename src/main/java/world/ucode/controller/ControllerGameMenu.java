package world.ucode.controller;

import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

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
        System.out.println("NewGame");
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
        System.out.println("LoadGame");
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