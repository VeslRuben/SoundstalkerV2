package gui.Controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControlsSceneController implements Initializable {


    @FXML
    public ComboBox<Double> distanceDropDown;

    @FXML
    public ComboBox<Integer> speedDropDown;

    @FXML
    public TextField pValuePID;

    @FXML
    public TextField iValuePID;

    @FXML
    public TextField dValuePID;

    @FXML
    public Button controlsBtn;

    @FXML
    public Button mainBtn;

    @SuppressWarnings("Duplicates")
    public void initialize(URL loc, ResourceBundle resource) {
        for(double x = 0.5; x <= 5; x += 0.5) {
            distanceDropDown.getItems().add(x);
        }
        distanceDropDown.setValue(3.0);

        for(int speed = 1; speed <= 10; speed++){
            speedDropDown.getItems().add(speed);
        }
        speedDropDown.setValue(5);

        pValuePID.setOnMouseClicked(event -> {
            if(event.getButton() == MouseButton.PRIMARY) {
                try {
                    Stage stage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("/FXML/NumpadScreen.fxml"));
                    stage.initModality(Modality.APPLICATION_MODAL);
                    stage.setTitle("Numpad");
                    stage.getIcons().add(new Image("https://i.redd.it/mvilmzrjn1921.jpg"));
                    stage.setScene(new Scene(root));
                    stage.setResizable(false);
                    stage.setMaxHeight(200);
                    stage.setMaxWidth(200);
                    stage.showAndWait();
                    if(!stage.isShowing()) {
                        pValuePID.setText(NumpadController.numpadValue);
                        //TODO: Notify the PIDController
                        //TODO: Retain information in case of misclick, and closing the window without editing
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        iValuePID.setOnMouseClicked(event -> {
            if(event.getButton() == MouseButton.PRIMARY) {
                try {
                    Stage stage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("/FXML/NumpadScreen.fxml"));
                    stage.initModality(Modality.APPLICATION_MODAL);
                    stage.setTitle("Numpad");
                    stage.getIcons().add(new Image("https://i.redd.it/mvilmzrjn1921.jpg"));
                    stage.setScene(new Scene(root));
                    stage.setResizable(false);
                    stage.setMaxHeight(200);
                    stage.setMaxWidth(200);
                    stage.showAndWait();
                    if(!stage.isShowing()) {
                        iValuePID.setText(NumpadController.numpadValue);
                        //TODO: Notify the PIDController
                        //TODO: Retain information in case of misclick, and closing the window without editing
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        dValuePID.setOnMouseClicked(event -> {
            if(event.getButton() == MouseButton.PRIMARY) {
                try {
                    Stage stage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("/FXML/NumpadScreen.fxml"));
                    stage.initModality(Modality.APPLICATION_MODAL);
                    stage.setTitle("Numpad");
                    stage.getIcons().add(new Image("https://i.redd.it/mvilmzrjn1921.jpg"));
                    stage.setScene(new Scene(root));
                    stage.setResizable(false);
                    stage.setMaxHeight(200);
                    stage.setMaxWidth(200);
                    stage.showAndWait();
                    if(!stage.isShowing()) {
                        dValuePID.setText(NumpadController.numpadValue);
                        //TODO: Notify the PIDController
                        //TODO: Retain information in case of misclick, and closing the window without editing
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }


    @SuppressWarnings("Duplicates")
    public void clickControlsBtn(ActionEvent actionEvent) {
    }

    @SuppressWarnings("Duplicates")
    public void clickMainBtn(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/FXML/MainScreen.fxml"));
            stage.setScene(new Scene(root, 800, 480));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("Duplicates")
    public void clickMusicBtn(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/FXML/MusicScreen.fxml"));
            stage.setScene(new Scene(root, 800, 480));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("Duplicates")
    public void clickControlPanelBtn(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Parent root = null;
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
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/FXML/StatusScreen.fxml"));
            stage.setScene(new Scene(root, 800, 480));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clickWarmRestartBtn(ActionEvent actionEvent) {
        //TODO: Make functionality for warm restart-button
    }

    public void clickRettFramBtn(ActionEvent actionEvent) {
        //TODO: Make functionality for Rett Fram-button
    }

    public void clickSpaceAgeBtn(ActionEvent actionEvent) {
        //TODO: Make functionality for Space Age-button

    }


}
