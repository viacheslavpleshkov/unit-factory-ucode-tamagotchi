package world.ucode.scene;

import javafx.stage.Stage;

public class SceneGameMenu extends Scene {
    public SceneGameMenu(Stage primaryStage) {
        super(primaryStage, "view/GameMenu.fxml", new ControllerGameMenu(primaryStage));
    }
}