package gui.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class NumpadController implements Initializable {


    @FXML
    public Text numpadText;

    public static String numpadValue;

    public void initialize(URL loc, ResourceBundle resource) {
        numpadValue = "";
    }

    public void clickButtonOne(ActionEvent actionEvent) {
        //TODO: Add functionality to numpad buttons
        numpadValue = numpadValue + "1";
    }

    public void clickButtonTwo(ActionEvent actionEvent) {
        numpadValue = numpadValue + "2";
    }

    public void clickButtonThree(ActionEvent actionEvent) {
        numpadValue = numpadValue + "3";
    }

    public void clickButtonFour(ActionEvent actionEvent) {
        numpadValue = numpadValue + "4";
    }

    public void clickButtonFive(ActionEvent actionEvent) {
        numpadValue = numpadValue + "5";
    }

    public void clickButtonSix(ActionEvent actionEvent) {
        numpadValue = numpadValue + "6";
    }

    public void clickButtonSeven(ActionEvent actionEvent) {
        numpadValue = numpadValue + "7";
    }

    public void clickButtonEight(ActionEvent actionEvent) {
        numpadValue = numpadValue + "8";
    }

    public void clickButtonNine(ActionEvent actionEvent) {
        numpadValue = numpadValue + "9";
    }

    public void clickButtonZero(ActionEvent actionEvent) {
        numpadValue = numpadValue + "0";
    }

    public void clickButtonOk(ActionEvent actionEvent) {
        //TODO: Close stage
    }

    public void clickButtonClear(ActionEvent actionEvent) {
        numpadValue = "";
    }

    public void clickCommaButton(ActionEvent actionEvent) {
        if(numpadValue.contains(".")) {
            numpadValue = numpadValue;
        } else {
            numpadValue = numpadValue + ".";
        }
    }

    public void clickBackSpaceButton(ActionEvent actionEvent) {
        if(numpadValue.length() > 0 && numpadValue != null) {
            numpadValue = numpadValue.substring(0, numpadValue.length() - 1);
        }
    }
}
