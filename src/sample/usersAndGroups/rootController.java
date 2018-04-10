package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class rootController
{
    public Button backBtn;

    public void backBtnClick() throws IOException {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) backBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("lessons.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

    public Label rootCorrectLbl;
    public Label rootTryAgainLbl;
    public Label root2CorrectLbl;
    public Label root2TryAgainLbl;
    public Text root2Question;
    public HBox rHBox;

    public void initialize() //Sets the labels and button to be hidden on the start of the scene so only a right answer makes it appear
    {
        rootCorrectLbl.setVisible(false);
        rootTryAgainLbl.setVisible(false);
        root2CorrectLbl.setVisible(false);
        root2TryAgainLbl.setVisible(false);
        root2Question.setVisible(false);
        root2AnswerBox.setVisible(false);
        root2AnswerBtn.setVisible(false);
        rHBox.setVisible(false);
        nextBtn.setVisible(false);
    }

    public TextField rootAnswerBox;
    public TextField root2AnswerBox;

    public Button rootAnswerBtn;
    public void rootAnswerBtnClick() throws IOException
    {
        System.out.println("rootAnswerBtnClick has been clicked");
        if (rootAnswerBox.getText().equals("sudo adduser james"))
        {

            rootCorrectLbl.setVisible(true);
            rootTryAgainLbl.setVisible(false);
            root2Question.setVisible(true);
            root2AnswerBox.setVisible(true);
            root2AnswerBtn.setVisible(true);
            rHBox.setVisible(true);
            System.out.println("Correct");
        }
        else
        {

            rootCorrectLbl.setVisible(false);
            rootTryAgainLbl.setVisible(true);
            root2Question.setVisible(false);
            root2AnswerBox.setVisible(false);
            root2AnswerBtn.setVisible(false);
            rHBox.setVisible(false);
            nextBtn.setVisible(false);

        }
    }

    public Button root2AnswerBtn;
    public void root2AnswerBtnClick() throws IOException
    {
        System.out.println("root2AnswerBtnClick has been clicked");
        if (root2AnswerBox.getText().equals("sudo adduser james sudo"))
        {
            System.out.println("Correct");
            root2CorrectLbl.setVisible(true);
            root2TryAgainLbl.setVisible(false);
            nextBtn.setVisible(true);
        }
        else
        {
            System.out.println("Try again");
            root2CorrectLbl.setVisible(false);
            root2TryAgainLbl.setVisible(true);
            nextBtn.setVisible(false);
        }
    }

    public Button rootBackBtn;
    public void rootBackBtnClick() throws IOException {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) rootBackBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("usersAndGroups/usersAndGroupsCont.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }
    public Button nextBtn;
    public void nextBtnClick() throws IOException
    {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) nextBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("usersAndGroups/etcPasswd.fxml"));
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
