package world.ucode.scene;

import javafx.stage.Stage;
import world.ucode.controller.ControllerGameOver;

public class SceneGameOver extends SceneObject {
    public SceneGameOver(Stage primaryStage) {
        super(primaryStage, "/view/GameOver.fxml", new ControllerGameOver(primaryStage));
    }
}