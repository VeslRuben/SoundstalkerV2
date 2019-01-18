package gui.Controllers;

import javafx.event.ActionEvent;
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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControlsSceneController implements Initializable {


    @FXML
    public ComboBox<Double> distanceDropDown;

    @FXML
    public ComboBox<Integer> speedDropDown;

    @FXML
    public TextField vPValuePID;

    @FXML
    public TextField vIValuePID;

    @FXML
    public TextField vDValuePID;

    @FXML
    public TextField hPValuePID;

    @FXML
    public TextField hIValuePID;

    @FXML
    public TextField hDValuePID;

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

        vPValuePID.setOnMouseClicked(event -> {
            if(event.getButton() == MouseButton.PRIMARY) {
                try {
                    NumpadController.oldValue = vPValuePID.getText();
                    Stage stage = new Stage();
                    NumpadController.stage = stage;
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
                        vPValuePID.setText(NumpadController.numpadValue);
                        //TODO: Notify the PIDController
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        vIValuePID.setOnMouseClicked(event -> {
            if(event.getButton() == MouseButton.PRIMARY) {
                try {
                    NumpadController.oldValue = vIValuePID.getText();
                    Stage stage = new Stage();
                    NumpadController.stage = stage;
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
                        vIValuePID.setText(NumpadController.numpadValue);
                        //TODO: Notify the PIDController
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        vDValuePID.setOnMouseClicked(event -> {
            if(event.getButton() == MouseButton.PRIMARY) {
                try {
                    NumpadController.oldValue = vDValuePID.getText();
                    Stage stage = new Stage();
                    NumpadController.stage = stage;
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
                        vDValuePID.setText(NumpadController.numpadValue);
                        //TODO: Notify the PIDController
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        hPValuePID.setOnMouseClicked(event -> {
            if(event.getButton() == MouseButton.PRIMARY) {
                try {
                    NumpadController.oldValue = hPValuePID.getText();
                    Stage stage = new Stage();
                    NumpadController.stage = stage;
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
                        hPValuePID.setText(NumpadController.numpadValue);
                        //TODO: Notify the PIDController
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        hIValuePID.setOnMouseClicked(event -> {
            if(event.getButton() == MouseButton.PRIMARY) {
                try {
                    NumpadController.oldValue = hIValuePID.getText();
                    Stage stage = new Stage();
                    NumpadController.stage = stage;
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
                        hIValuePID.setText(NumpadController.numpadValue);
                        //TODO: Notify the PIDController
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        hDValuePID.setOnMouseClicked(event -> {
            if(event.getButton() == MouseButton.PRIMARY) {
                try {
                    NumpadController.oldValue = hDValuePID.getText();
                    Stage stage = new Stage();
                    NumpadController.stage = stage;
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
                        hDValuePID.setText(NumpadController.numpadValue);
                        //TODO: Notify the PIDController
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }


    @SuppressWarnings("Duplicates")
    public void clickControlsBtn() {
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
    public void clickMusicBtn(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Parent root;
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

    public void clickWarmRestartBtn() {
        //TODO: Make functionality for warm restart-button
    }

    public void clickRettFramBtn() {
        //TODO: Make functionality for Rett Fram-button
    }

    public void clickSpaceAgeBtn() {
        //TODO: Make functionality for Space Age-button

    }


}
