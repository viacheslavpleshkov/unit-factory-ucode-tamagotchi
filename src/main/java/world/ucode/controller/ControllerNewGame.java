package world.ucode.controller;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ControllerNewGame extends ControllerObject {
    @FXML
    ImageView ImageViewPerson;
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

}
