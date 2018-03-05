package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class rmController
{
    public Button backBtn;
    public void backBtnClick() throws IOException
    {
        System.out.println("You are back to the lessons screen");
        Stage primaryStage = (Stage) backBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("lessons.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

  /*  public Button nextBtn;
    public void backBtnClick() throws IOException
    {
      System.out.println("You clicked the Next button");
      Stage primaryStage = (Stage) nextBtn.getScene().getWindow();
      Parent newRoot = FXMLLoader.load(getClass().getResource("lessons.fxml"));
      primaryStage.getScene().setRoot(newRoot);
    }
*/
}
