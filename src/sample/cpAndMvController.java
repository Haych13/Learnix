package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class cpAndMvController
{

    public Label correctLbl;
    public Label tryAgainLbl;

    public void initialize() //Sets the labels and button to be hidden on the start of the scene so only a right answer makes it appear
    {
        correctLbl.setVisible(true);
        tryAgainLbl.setVisible(false);
        nextBtn.setVisible(false);
    }

    public TextField cpmvAnswerBox;
    public Button cpmvAnswerBtn;
    public void cpmvAnswerBtnClick() throws IOException
    {
        System.out.println("cpmvAnswerBtn has been clicked");
        if (cpmvAnswerBox.getText().equals("cp banana /home/jeff/Documents/Food/banana"))
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
        Parent newRoot = FXMLLoader.load(getClass().getResource("lessons.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

    public Button nextBtn;
    public void nextBtnClick() throws IOException
    {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) nextBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("lessons.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }
}
