package sample;

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

public class cpAndMvController
{

    public Label correctLbl;
    public Label tryAgainLbl;

    public void initialize() //Sets the labels and button to be hidden on the start of the scene so only a right answer makes it appear
    {
        correctLbl.setVisible(false);
        tryAgainLbl.setVisible(false);
        nextBtn.setVisible(false);
    }

    public TextField cpmvAnswerBox;
    public Button cpmvAnswerBtn;
    public void cpmvAnswerBtnClick()
    {
        System.out.println("cpmvAnswerBtn has been clicked");
        if (cpmvAnswerBox.getText().equals("cp banana /home/jeff/Documents/Food/banana") || (cpmvAnswerBox.getText().equals("cp banana /home/jeff/Documents/Food")) || (cpmvAnswerBox.getText().equals("cp banana /home/jeff/Documents/Food/")))
        {
            System.out.println("Correct");
            correctLbl.setVisible(true);
            tryAgainLbl.setVisible(false);
            nextBtn.setVisible(true);
        }
        else
        {
            System.out.println("Try again");
            correctLbl.setVisible(false);
            tryAgainLbl.setVisible(true);
            nextBtn.setVisible(false);
        }
    }

    public Button backBtn;
    public void backBtnClick() throws IOException {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) backBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("commandLineBasics/cdCont.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

    public Button nextBtn;
    public void nextBtnClick() throws IOException
    {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) nextBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("commandLineBasics/mkdir.fxml"));
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
