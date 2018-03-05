package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class cdContController
{
    public Button backBtn;
    public void backBtnClick() throws IOException {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) backBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("lessons.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }


    public Label aCorrectLbl;
    public Label aTryAgainLbl;
    public Label rCorrectLbl;
    public Label rTryAgainLbl;
    public Text potatoQuestion;
    public HBox rHBox;

    public void initialize() //Sets the labels and button to be hidden on the start of the scene so only a right answer makes it appear
    {
        aCorrectLbl.setVisible(false);
        aTryAgainLbl.setVisible(false);
        rCorrectLbl.setVisible(false);
        rTryAgainLbl.setVisible(false);
        potatoQuestion.setVisible(false);
        rCDAnswerBox.setVisible(false);
        rCDAnswerBtn.setVisible(false);
        rHBox.setVisible(false);
        nextBtn.setVisible(false);
    }

    public TextField aCDAnswerBox; // Name of the answer box for the echo Absolute CD answer box
    public TextField rCDAnswerBox;

    public Button aCDAnswerBtn;
    public void aCDAnswerBtnClick() throws IOException
    {
        System.out.println("aCDAnswerBtnClick has been clicked");
        if (aCDAnswerBox.getText().equals("cd /home/jeff/Documents/Potato"))
        {
            System.out.println("Correct");
            aCorrectLbl.setVisible(true);
            aTryAgainLbl.setVisible(false);
            potatoQuestion.setVisible(true);
            rCDAnswerBox.setVisible(true);
            rCDAnswerBtn.setVisible(true);
            rHBox.setVisible(true);

        }
        else
        {
            System.out.println("Try again");
            aCorrectLbl.setVisible(false);
            aTryAgainLbl.setVisible(true);
            potatoQuestion.setVisible(false);
            rCDAnswerBox.setVisible(false);
            rCDAnswerBtn.setVisible(false);
            rHBox.setVisible(false);
            nextBtn.setVisible(false);
        }
    }

    public Button rCDAnswerBtn;
    public void rCDAnswerBtnClick() throws IOException
    {
        System.out.println("aCDAnswerBtnClick has been clicked");
        if (rCDAnswerBox.getText().equals("cd Cheese"))
        {
            System.out.println("Correct");
            rCorrectLbl.setVisible(true);
            rTryAgainLbl.setVisible(false);
            nextBtn.setVisible(true);
        }
        else
        {
            System.out.println("Try again");
            rCorrectLbl.setVisible(false);
            rTryAgainLbl.setVisible(true);
            nextBtn.setVisible(false);
        }
    }

    public Button cdBackBtn;
    public void cdBackBtnClick() throws IOException {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) cdBackBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("commandLineBasics/cd.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

    public Button nextBtn;
    public void nextBtnClick() throws IOException
    {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) nextBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("commandLineBasics/cpAndMv.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }
}
