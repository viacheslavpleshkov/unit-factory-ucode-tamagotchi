package world.ucode.controller;

import javafx.stage.Stage;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public abstract class ControllerObject implements Initializable {
    protected Stage primaryStage;
    protected String style = "-fx-background-color:#fcdb00; -fx-text-fill: #040404;";
    protected String styleHover = "-fx-background-color:#beae7d; -fx-text-fill: #ffffff;";

    ControllerObject(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}