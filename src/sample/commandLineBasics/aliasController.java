package sample.commandLineBasics;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class aliasController
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
        System.out.println("You are now in cd");
        Stage primaryStage = (Stage) nextBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("commandLineBasics/exit.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }
}
