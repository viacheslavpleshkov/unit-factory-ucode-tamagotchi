package world.ucode.controller;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import world.ucode.model.TamagotchiModel;

import java.util.ArrayList;

public class ControllerNewGame extends ControllerObject {
    @FXML
    ImageView ImageViewPerson;
    @FXML
    Button ButtonNext;
    @FXML
    Button ButtonPrevious;
    @FXML
    Button ButtonPlay;
    @FXML
    TextField TextFieldName;
    protected Image personOne = new Image("images/person1/person.png");
    protected Image personTwo = new Image("images/person2/person.png");
    protected Image personTree = new Image("images/person3/person.png");
    protected Image personFore = new Image("images/person4/person.png");
    protected ArrayList<Image> listImage = new ArrayList<Image>();

    public int counter = 0;
    public ControllerNewGame(Stage primaryStage) {
        super(primaryStage);
        this.setListImage();
    }
    /**
     * Set ListImage
     */
    protected void setListImage() {
        listImage.add(personOne);
        listImage.add(personTwo);
        listImage.add(personTree);
        listImage.add(personFore);
    }
    @FXML
    private void ClickedNext() {
        counter++;
        if (counter == 4)
            counter = 0;
        ImageViewPerson.setImage(listImage.get(counter));
    }
    @FXML
    private void ClickedPrevious() {
        counter--;
        if (counter == -1)
            counter = 3;
        ImageViewPerson.setImage(listImage.get(counter));
    }

    @FXML
    private void EnteredNext() {
        ButtonNext.setStyle(styleHover);
    }

    @FXML
    private void ExitedNext() {
        ButtonNext.setStyle(style);
    }
    @FXML
    private void EnteredPrevious() {
        ButtonPrevious.setStyle(styleHover);
    }

    @FXML
    private void ExitedPrevious() {
        ButtonPrevious.setStyle(style);
    }
    @FXML
    private void ClickedPlay() {
        if(TextFieldName.getText().matches("[a-zA-Z]+")
                && !TextFieldName.getText().trim().isEmpty()) {
//            TamagotchiModel tamagotchiModel = new TamagotchiModel();
//            tamagotchiModel.createNewCharacter(TextFieldName.getText().trim(), counter);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText("Required Fields Empty");
            alert.setContentText("text");
            alert.showAndWait();
        }
    }
    @FXML
    private void EnteredPlay() {
        ButtonPlay.setStyle(styleHover);
    }

    @FXML
    private void ExitedPlay() {
        ButtonPlay.setStyle(style);
    }
}
