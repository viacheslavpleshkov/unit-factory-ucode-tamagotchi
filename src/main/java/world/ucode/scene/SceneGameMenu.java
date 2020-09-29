package world.ucode.scene;

import javafx.stage.Stage;
import world.ucode.controller.ControllerGameMenu;

public class SceneGameMenu extends SceneObject {
    public SceneGameMenu(Stage primaryStage) {
        super(primaryStage,
                "/view/GameMenu.fxml",
                new ControllerGameMenu(primaryStage)
        );
    }
}