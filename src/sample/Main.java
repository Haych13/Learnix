package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.image.Image;

public class Main extends Application
{
    //Stage window;

    public static void main(String[] args)
    {
        launch(args); 
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("icon.png"))); //loads image as the program's icon
        //primaryStage.getIcons().add(new Image("https://harrywhitter.ovh/wp-content/uploads/sharex/icon.png")); //Uploaded file to my own website, can load the Learnix icon from there instead if wanted
        primaryStage.setTitle("Learnix"); // Names the program Learnix
        primaryStage.setScene(new Scene(root, 800, 500));  //default size
        primaryStage.show();

    }
}



/*
Template code to swap scenes
public class <FXML NAME>Controller
{
    public Button <BUTTON NAME>;
    public void <BUTTON ACTION NAME>() throws IOException
    {
        System.out.println("<ANY TEXT YOU WANT IN THE TERMINAL>");
        Stage primaryStage = (Stage) <BUTTON ACTION NAME>.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("<FXML NAME>.fxml"));
        primaryStage.getScene().setRoot(newRoot);
 */