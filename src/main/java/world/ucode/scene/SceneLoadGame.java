package world.ucode.scene;

import javafx.stage.Stage;
import world.ucode.controller.ControllerLoadGame;

public class SceneLoadGame extends SceneObject {
    public SceneLoadGame(Stage primaryStage) {
        super(primaryStage,
                "/view/LoadGame.fxml",
                new ControllerLoadGame(primaryStage)
        );

    }
}
