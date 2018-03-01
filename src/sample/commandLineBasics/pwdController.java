package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class pwdController
{
    public Button backBtn;

    public void backBtnClick() throws IOException {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) backBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("lessons.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }
    public Label correctLbl;
    public Label tryAgainLbl;
    public void initialize() //Sets the labels and button to be hidden on the start of the scene so only a right answer makes it appear
    {
        correctLbl.setVisible(false);
        tryAgainLbl.setVisible(false);
        nextBtn.setVisible(false);
    }

    public TextField pwdAnswerBox; // Name of the answer box for the echo Hello World check

    public Button pwdAnswerBtn; // Button to check the Hello World text
    public void pwdAnswerBtnClick() throws IOException
    {
        System.out.println("pwdAnswerButton has been clicked");
        if (pwdAnswerBox.getText().equals("pwd"))
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

    public Button nextBtn;
    public void nextBtnClick() throws IOException
    {
        System.out.println("You are now in cd");
        Stage primaryStage = (Stage) nextBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("commandLineBasics/cd.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

}
