package world.ucode.scene;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene ;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public abstract class SceneObject {
    private Scene scene;

    public SceneObject(Stage primaryStage, String fxmlName, Object Controller) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(fxmlName));
            loader.setController(Controller);
            Parent PaneRoot = loader.load();
            this.scene = new Scene(PaneRoot);
            this.scene.getStylesheets().add("https://fonts.googleapis.com/css2?family=Rock+Salt&display=swap");
            this.scene.getStylesheets().add("css/main.css");
            primaryStage.getIcons().add(new Image("images/icon.png"));
            primaryStage.setScene(this.scene);
            primaryStage.centerOnScreen();
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Scene getScene() {
        return scene;
    }
}