package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class commandLineBasicsController {
    public Button backBtn;

    public void backBtnClick() throws IOException {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) backBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("lessons.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

    public Label correctLbl;
    public Label tryAgainLbl;
    public Label answerCorrectLbl;
    public void initialize() //Sets the labels and button to be hidden on the start of the scene so only a right answer makes it appear
    {
       correctLbl.setVisible(false);
       tryAgainLbl.setVisible(false);
       nextBtn.setVisible(false);
        answerCorrectLbl.setVisible(true);
    }

    public TextField helloWorldAnswerBox; // Name of the answer box for the echo Hello World check

    public Button helloWorldAnswerBtn; // Button to check the Hello World text
    public void helloWorldAnswerBtnClick()
    {
        System.out.println("helloWorldAnswerBtnClick has been clicked");
        if (helloWorldAnswerBox.getText().equals("hello world"))
        {
            System.out.println("Correct");
            correctLbl.setVisible(true);
            tryAgainLbl.setVisible(false);
            answerCorrectLbl.setVisible(false);
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

    public Button CLBBackBtn;
    public void CLBBackBtnClick() throws IOException {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) CLBBackBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("commandLineBasics/terminalIntro.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

    public Button nextBtn;
    public void nextBtnClick() throws IOException
    {
        System.out.println("You are now in pwd");
        Stage primaryStage = (Stage) nextBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("commandLineBasics/pwd.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }
}
