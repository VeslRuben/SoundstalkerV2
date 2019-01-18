package gui.Controllers;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class StatusSceneController implements Initializable {



    @FXML
    public Text coreTempText;

    @FXML
    public Text batteryTempText;

    @FXML
    public Text ambientTempText;

    @FXML
    public Text sonicSensorValueText;

    @FXML
    public Text motor1LoadText;

    @FXML
    public Text motor2LoadText;

    @FXML
    public Text cpuLoadText;

    @FXML
    public Text ramLoadText;

    @FXML
    public Text currentTimeActiveText;

    @FXML
    public Text totalDistanceText;

    @FXML
    public Text remainingLifeText;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        @SuppressWarnings("Duplicates")
        HashMap<String, Double> sytemValues = getRamAndCpuUsage();
        ramLoadText.setText(String.format("%.0f%s", sytemValues.get("RAM"), "%"));
        cpuLoadText.setText(String.format("%.0f%s", sytemValues.get("CPU"), "%"));

        // Updates every 5 seconds
        Timeline everyFive = new Timeline(new KeyFrame(Duration.seconds(5), event -> {
            HashMap<String, Double> sytemValues1 = getRamAndCpuUsage();
            ramLoadText.setText(String.format("%.0f%s", sytemValues1.get("RAM"), "%"));
            cpuLoadText.setText(String.format("%.0f%s", sytemValues1.get("CPU"), "%"));
        }));
        everyFive.setCycleCount(Timeline.INDEFINITE);
        everyFive.play();
    }

    private HashMap<String, Double> getRamAndCpuUsage() {
        HashMap<String, Long> systemData = new HashMap<>();
        double cpuLoad = 0;
        OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
        for (Method method : operatingSystemMXBean.getClass().getDeclaredMethods()) {
            method.setAccessible(true);
            if (method.getName().startsWith("get") && Modifier.isPublic(method.getModifiers())) {
                Object value;
                try {

                    value = method.invoke(operatingSystemMXBean);
                } catch (Exception e) {
                    value = e;
                }
                if(value instanceof Double && method.getName().contains("getSystemCpuLoad")){
                    cpuLoad = (double) value *100;
                } else if(value instanceof Long) {
                    systemData.put(method.getName(), (Long) value);
                }
            }
        }
        double ramUsage =  ((1 - ((double) systemData.get("getFreePhysicalMemorySize") / systemData.get("getTotalPhysicalMemorySize")))*100);
        HashMap<String, Double> returneValue = new HashMap<>();
        returneValue.put("RAM", ramUsage);
        returneValue.put("CPU", cpuLoad);
        return returneValue;
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
    public void clickStatusBtn() {
    }


}
