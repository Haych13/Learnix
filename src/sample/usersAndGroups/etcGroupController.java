package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class etcGroupController
{
    public Button backBtn;

    public void backBtnClick() throws IOException {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) backBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("lessons.fxml"));
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
        Parent newRoot = FXMLLoader.load(getClass().getResource("usersAndGroups/etcShadow.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

    public Button nextBtn;
    public void nextBtnClick() throws IOException
    {
        System.out.println("You are now in usersAndGroupsCont");
        Stage primaryStage = (Stage) nextBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("lessons.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }
}
