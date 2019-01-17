package gui.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class NumpadController implements Initializable {


    @FXML
    public Text numpadText;

    @FXML
    public Button buttonOk;

    public static String numpadValue;

    public void initialize(URL loc, ResourceBundle resource) {
        numpadValue = "";
    }

    public void clickButtonOne(ActionEvent actionEvent) {
        numpadText.setText(numpadText.getText() + "1");
    }

    public void clickButtonTwo(ActionEvent actionEvent) {
        numpadText.setText(numpadText.getText() + "2");
    }

    public void clickButtonThree(ActionEvent actionEvent) {
        numpadText.setText(numpadText.getText() + "3");
    }

    public void clickButtonFour(ActionEvent actionEvent) {
        numpadText.setText(numpadText.getText() + "4");
    }

    public void clickButtonFive(ActionEvent actionEvent) {
        numpadText.setText(numpadText.getText() + "5");
    }

    public void clickButtonSix(ActionEvent actionEvent) {
        numpadText.setText(numpadText.getText() + "6");
    }

    public void clickButtonSeven(ActionEvent actionEvent) {
        numpadText.setText(numpadText.getText() + "7");
    }

    public void clickButtonEight(ActionEvent actionEvent) {
        numpadText.setText(numpadText.getText() + "8");
    }

    public void clickButtonNine(ActionEvent actionEvent) {
        numpadText.setText(numpadText.getText() + "9");
    }

    public void clickButtonZero(ActionEvent actionEvent) {
        numpadText.setText(numpadText.getText() + "0");
    }

    public void clickButtonOk(ActionEvent actionEvent) {
        numpadValue = numpadText.getText();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }

    public void clickButtonClear(ActionEvent actionEvent) {
        numpadText.setText("");
    }

    public void clickCommaButton(ActionEvent actionEvent) {
        if(numpadText.getText().contains(".") || numpadText.getText().equals("")) {
            //Do nothing
        } else {
            numpadText.setText(numpadText.getText() + ".");
        }
    }

    public void clickBackSpaceButton(ActionEvent actionEvent) {
        if(numpadText.getText().length() > 0 && numpadText.getText() != null) {
            numpadText.setText(numpadText.getText().substring(0, numpadText.getText().length() - 1));
        }
    }
}
