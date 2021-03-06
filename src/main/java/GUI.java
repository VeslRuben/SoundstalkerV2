import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class GUI extends Application implements Runnable {
    public void run() {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/GUI.fxml"));
        stage.setTitle("SoundStalker");
        stage.getIcons().add(new Image("https://i.redd.it/mvilmzrjn1921.jpg"));
        stage.setScene(new Scene(root));
        stage.setResizable(true);
        stage.show();
    }
}
