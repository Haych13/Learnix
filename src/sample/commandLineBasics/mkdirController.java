package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class mkdirController
{
    public Button backBtn;
    public void backBtnClick() throws IOException
    {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) backBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("lessons.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }


    public Button mkdirBackBtn;
    public void mkdirBackBtnClick() throws IOException {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) mkdirBackBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("commandLineBasics/cpAndMv.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

    public Button nextBtn;
    public void nextBtnClick() throws IOException
    {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) nextBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("commandLineBasics/reMove.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

    public MenuItem HelpBtn;
    public void HelpBtnClick()
    {
        System.out.println("You have clicked HelpBtn");
        try {
            Desktop.getDesktop().browse(new URL("https://haych13.github.io/Learnix").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    } //This opens a link to the Learnix website

    public MenuItem CloseBtn;
    public void CloseBtnClick()
    {
        System.out.println("You have clicked CloseBtn");
        System.exit(0);
    } //This closes the application
}
