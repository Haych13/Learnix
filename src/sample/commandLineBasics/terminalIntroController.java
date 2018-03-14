package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class terminalIntroController
{
    public Button backBtn;

    public void backBtnClick() throws IOException {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) backBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("lessons.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

    public Button nextBtn;
    public void nextBtnClick() throws IOException
    {
        System.out.println("You are now in pwd");
        Stage primaryStage = (Stage) nextBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("commandLineBasics/commandLineBasics.fxml"));
        //Parent newRoot = FXMLLoader.load(getClass().getResource("commandLineBasics/touch.fxml")); //Second line for easily changing next page to test newer pages without going through the entire list and can easily comment out the original line. Just saves time.
        primaryStage.getScene().setRoot(newRoot);
    }
}