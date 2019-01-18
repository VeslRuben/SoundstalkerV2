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

    public void clickButtonOne() {
        numpadText.setText(numpadText.getText() + "1");
    }

    public void clickButtonTwo() {
        numpadText.setText(numpadText.getText() + "2");
    }

    public void clickButtonThree() {
        numpadText.setText(numpadText.getText() + "3");
    }

    public void clickButtonFour() {
        numpadText.setText(numpadText.getText() + "4");
    }

    public void clickButtonFive() {
        numpadText.setText(numpadText.getText() + "5");
    }

    public void clickButtonSix() {
        numpadText.setText(numpadText.getText() + "6");
    }

    public void clickButtonSeven() {
        numpadText.setText(numpadText.getText() + "7");
    }

    public void clickButtonEight() {
        numpadText.setText(numpadText.getText() + "8");
    }

    public void clickButtonNine() {
        numpadText.setText(numpadText.getText() + "9");
    }

    public void clickButtonZero() {
        numpadText.setText(numpadText.getText() + "0");
    }

    public void clickButtonOk(ActionEvent actionEvent) {
        numpadValue = numpadText.getText();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }

    public void clickButtonClear() {
        numpadText.setText("");
    }

    public void clickCommaButton() {
        if(!(numpadText.getText().contains(".") || numpadText.getText().equals(""))) {
            numpadText.setText(numpadText.getText() + ".");
        }
    }

    public void clickBackSpaceButton() {
        if(numpadText.getText().length() > 0 && numpadText.getText() != null) {
            numpadText.setText(numpadText.getText().substring(0, numpadText.getText().length() - 1));
        }
    }
}
