package world.ucode.scene;

import javafx.stage.Stage;
import world.ucode.controller.ControllerNewGame;

public class SceneNewGame extends SceneObject {
    public SceneNewGame(Stage primaryStage) {
        super(primaryStage,
                "/view/NewGame.fxml",
                new ControllerNewGame(primaryStage)
        );

    }
}
