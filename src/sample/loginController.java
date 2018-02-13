package sample;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class loginController
{

    public Button loginBtn;
    public void loginBtnClick() throws IOException
    {
        System.out.println("You are logged in");
        Stage primaryStage = (Stage) loginBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("lessons.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

}
