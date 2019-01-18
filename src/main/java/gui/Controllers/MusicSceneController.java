package gui.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MusicSceneController implements Initializable {

    public void initialize(URL loc, ResourceBundle resource) {
        
    }

    @SuppressWarnings("Duplicates")
    public void clickControlsBtn(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/FXML/ControlsScreen.fxml"));
            stage.setScene(new Scene(root, 800, 480));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("Duplicates")
    public void clickMainBtn(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/FXML/MainScreen.fxml"));
            stage.setScene(new Scene(root, 800, 480));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("Duplicates")
    public void clickMusicBtn() {
    }

    @SuppressWarnings("Duplicates")
    public void clickControlPanelBtn(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/FXML/CPanelScreen.fxml"));
            stage.setScene(new Scene(root, 800, 480));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("Duplicates")
    public void clickStatusBtn(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/FXML/StatusScreen.fxml"));
            stage.setScene(new Scene(root, 800, 480));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
