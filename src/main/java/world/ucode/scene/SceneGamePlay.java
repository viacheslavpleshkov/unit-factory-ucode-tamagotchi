package world.ucode.scene;

import javafx.stage.Stage;
import world.ucode.controller.ControllerGamePlay;

public class SceneGamePlay extends SceneObject {

    public SceneGamePlay(Stage primaryStage, int idModel) {
        super(primaryStage,
                "/view/GamePlay.fxml",
                new ControllerGamePlay(primaryStage, idModel)
        );

    }
}