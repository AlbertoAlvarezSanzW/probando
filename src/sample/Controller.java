package sample;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Controller {


    @FXML
    public Button botonW;

    @FXML
    public Button botonD;

    @FXML
    public ImageView ImageD;

    @FXML
    public ImageView ImageW;

    @FXML
    public void mostrarImagenDead(){
        Image image = new Image(getClass().getResourceAsStream("/winter.jpg"));
        ImageD.setImage(image);
    }

    @FXML
    public void mostrarImagenWinter(){
        Image image = new Image(getClass().getResourceAsStream("/dead.jpg"));
        ImageD.setImage(image);
    }
}
