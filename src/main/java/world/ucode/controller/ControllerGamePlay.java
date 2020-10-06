package world.ucode.controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.fxml.FXML;
import world.ucode.model.TamagotchiModel;
import javafx.util.Duration;
import world.ucode.scene.SceneGameOver;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerGamePlay extends ControllerObject {
    @FXML
    private ProgressBar ProgressBarHealth;
    @FXML
    private ProgressBar ProgressBarHappiness;
    @FXML
    private ProgressBar ProgressBarHunger;
    @FXML
    private ProgressBar ProgressBarThirst;
    @FXML
    private ProgressBar ProgressBarCleanliness;
    @FXML
    private ImageView ImageViewFon;

    private TamagotchiModel tamagotchiModel;
    protected boolean one = true;
    public ControllerGamePlay(Stage primaryStage) {
        super(primaryStage);
        this.tamagotchiModel = new TamagotchiModel();
        this.GameOver();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ImageViewFon.setVisible(false);
    }

    @FXML
    public void ClickedPlay() {
        ImageViewFon.setImage(new Image("/images/person1/person-sleep.gif"));
        ImageViewFon.setVisible(true);
        double health = this.tamagotchiModel.getHealth() - 0.1;
        tamagotchiModel.setHealth(health);
        ProgressBarHealth.setProgress(health);
        this.animationRun();
    }

    @FXML
    public void ClickedFeed() {
    }

    @FXML
    public void ClickedGiveWater() {
        System.out.print("ClickedGiveWater");
    }

    @FXML
    public void ClickedGiveMedicine() {
        System.out.print("ClickedGiveMedicine");
    }

    @FXML
    public void ClickedCleanUp() {
        System.out.print("ClickedCleanUp");
    }

    @FXML
    public void exitApplication(WindowEvent windowEvent) {
        System.out.print("Exit");
    }
    /**
     * Animation Dino Run
     */
    public void animationRun() {
        Timeline t = new Timeline(
                new KeyFrame(Duration.seconds(3), new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent t) {
                        ImageViewFon.setVisible(false);
                    }
                })
        );
        t.setCycleCount(Timeline.INDEFINITE);
        t.play();
    }
    /**
     * Collision
     */
    private void GameOver() {
        Timeline t = new Timeline(
                new KeyFrame(Duration.millis(1), new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent t) {
                            if (tamagotchiModel.getHealth() <= 0 && one) {
                                one = false;
                                new SceneGameOver(primaryStage);
                        }
                    }
                })
        );
        t.setCycleCount(Timeline.INDEFINITE);
        t.play();
    }
}
