package world.ucode.controller;

import javafx.stage.Stage;

public abstract class ControllerObject {
    protected Stage primaryStage;
    protected String style = "-fx-background-color:#fcdb00; -fx-text-fill: #040404;";
    protected String styleHover = "-fx-background-color:#beae7d; -fx-text-fill: #ffffff;";

    ControllerObject(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}