package sample.usersAndGroups;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class etcGroupController
{
    public Button backBtn;

    public void backBtnClick() throws IOException {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) backBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("../lessons.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

    public Label CorrectLbl;
    public Label TryAgainLbl;
    public Label remSudo;

    public void initialize() //Sets the labels and button to be hidden on the start of the scene so only a right answer makes it appear
    {
        CorrectLbl.setVisible(false);
        TryAgainLbl.setVisible(false);
        remSudo.setVisible(false);
        nextBtn.setVisible(false);
    }

    public TextField AnswerBox;

    public Button AnswerBtn;
    public void AnswerBttnClick()
    {
        System.out.println("AnswerBtnClick has been clicked");
        if (AnswerBox.getText().equals("sudo cat /etc/group"))
        {
            System.out.println("Correct");
            CorrectLbl.setVisible(true);
            TryAgainLbl.setVisible(false);
            remSudo.setVisible(false);
            nextBtn.setVisible(true);
        }
        else if (AnswerBox.getText().equals("cat /etc/group"))
        {
            System.out.println("Try again");
            CorrectLbl.setVisible(false);
            TryAgainLbl.setVisible(true);
            remSudo.setVisible(true);
            nextBtn.setVisible(false);
        }
        else
        {
            System.out.println("Try again");
            CorrectLbl.setVisible(false);
            TryAgainLbl.setVisible(true);
            remSudo.setVisible(false);
            nextBtn.setVisible(false);
        }

    }

    public Button cdBackBtn;
    public void cdBackBtnClick() throws IOException
    {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) cdBackBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("etcShadow.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

    public Button nextBtn;
    public void nextBtnClick() throws IOException
    {
        System.out.println("You are now in usersAndGroupsCont");
        Stage primaryStage = (Stage) nextBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("../lessons.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

    public MenuItem HelpBtn;
    public void HelpBtnClick()
    {
        System.out.println("You have clicked HelpBtn");
        try {
            Desktop.getDesktop().browse(new URL("https://haych13.github.io/Learnix").toURI());
        } catch (IOException | URISyntaxException e) {
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
