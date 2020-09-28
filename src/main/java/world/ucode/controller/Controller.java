package world.ucode.controller;

import javafx.stage.Stage;

public abstract class Controller {
    protected Stage primaryStage;

    public Controller(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}