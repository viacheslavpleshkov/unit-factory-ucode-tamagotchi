package world.ucode.scene;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public abstract class Scene {
    private Scene scene;
    private int width = 1000;
    private int height = 500;

    public Scene(Stage primaryStage, String fxmlName, Object Controller) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(fxmlName));
            loader.setController(Controller);
            Parent PaneRoot = loader.load();
            this.scene = new Scene(PaneRoot, this.width, this.height);
            primaryStage.setScene(this.scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Scene getScene() {
        return scene;
    }
}