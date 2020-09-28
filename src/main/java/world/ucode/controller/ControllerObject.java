package world.ucode.controller;

import javafx.stage.Stage;

public abstract class ControllerObject {
    protected Stage primaryStage;
    protected String style = "-fx-background-color:yellow;";
    protected String styleHover = "-fx-background-color:yellow;-fx-border-color: black; -fx-border-radius: 5px;";

    ControllerObject(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}