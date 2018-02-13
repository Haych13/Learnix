package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class lessonsController
{
    public Button backBtn;
    public void backBtnClick() throws IOException
    {
        System.out.println("You are back to the login screen");
        Stage primaryStage = (Stage) backBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

    public Button practiceTestBtn;
    public void practiceTestBtnClick() throws IOException
    {
        System.out.println("You have clicked practiceTestBtn");
        Stage primaryStage = (Stage) practiceTestBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("practiceTest.fxml"));
        primaryStage.getScene().setRoot(newRoot);

    }

    public Button whatIsGnuBtn;
    public void whatIsGnuBtnClick() throws IOException
    {
        System.out.println("You have clicked whatIsGnuBtn");
        Stage primaryStage = (Stage) whatIsGnuBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("gnuAndLinux.fxml"));
        primaryStage.getScene().setRoot(newRoot);

    }

    public Button commandLineBasicsBtn;
    public void commandLineBasicsBtnClick() throws IOException
    {
        System.out.println("You have clicked commandLineBasics");
        Stage primaryStage = (Stage) commandLineBasicsBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("commandLineBasics.fxml"));
        primaryStage.getScene().setRoot(newRoot);

    }

    //Attempted to get the "About" in the "help" menu to paste to the console when clicked but it just crashed instead.
   /*public Button aboutLearnix;
    public void aboutLearnixClicked() throws IOException
    {
        System.out.println("You have clicked aboutLearnix");
    }*/


}
