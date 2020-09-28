package world.ucode.controller;

import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerGameMenu extends ControllerObject {
    @FXML
    Button NewGameButton;
    public ControllerGameMenu(Stage primaryStage) {
        super(primaryStage);
    }

    @FXML
    private void ClickedNewGame() {
        System.out.println("NewGame");
    }
    @FXML
    private void EnteredNewGame() {
        System.out.println("ssss");
//        NewGameButton.setStyle(styleHover);
    }
    @FXML
    private void ExitedNewGame() {
        System.out.println("lllll");
//        NewGameButton.setStyle(style);
    }
    @FXML
    private void ClickedLoadGame() {
        System.out.println("LoadGame");
    }
    @FXML
    private void ClickedExit() {
        System.exit(0);
    }
}