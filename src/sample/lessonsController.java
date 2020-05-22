package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

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

    public Button whatIsGnuBtn;
    public void whatIsGnuBtnClick() throws IOException
    {
        System.out.println("You have clicked whatIsGnuBtn");
        Stage primaryStage = (Stage) whatIsGnuBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("whatIsGnuAndLinux/gnuAndLinux.fxml"));
        primaryStage.getScene().setRoot(newRoot);

    }

    public Button commandLineBasicsBtn;
    public void commandLineBasicsBtnClick() throws IOException
    {
        System.out.println("You have clicked commandLineBasics");
        Stage primaryStage = (Stage) commandLineBasicsBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("commandLineBasics/terminalIntro.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

    public Button usersAndGroupsBtn;
    public void usersAndGroupsBtnClick() throws IOException
    {
        System.out.println("You have clicked usersAndGroupsBtn");
        Stage primaryStage = (Stage) usersAndGroupsBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("usersAndGroups/managingUsers.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

    public Button permissionsBtn;
    public void permissionsBtnClick() throws IOException
    {
        System.out.println("You have clicked permissionsBtn");
        Stage primaryStage = (Stage) permissionsBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("permissions/permissions.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }

    public Button systemPackagesBtn;
    public void systemPackagesBtnClick() throws IOException
    {
        System.out.println("You have clicked systemPackagesBtn");
        Stage primaryStage = (Stage) systemPackagesBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("systemPackages/systemPackages.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }


/*    public Menu FileBtn;
    public void FileBtnClick() throws IOException
    {
        System.out.println("You have clicked FileBtn");
    }
    // This (when clicking help or close) then prints the statement, but not on file alone.
*/

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

    public Button onlineCLIBtn;
    public void onlineCLIBtnClick()
    {
        System.out.println("You have clicked practiceTestBtn");
        {
            System.out.println("You have clicked HelpBtn");
            try {
                Desktop.getDesktop().browse(new URL("https://linuxcontainers.org/lxd/try-it/").toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        } //This opens a link to an online CLI for users to use if they can't use one on their current OS
    }
}
