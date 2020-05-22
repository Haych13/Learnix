package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class Main extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml")); //This is the first FXML file that will open
        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("icon.png"))); //loads image as the program's icon
        primaryStage.setTitle("Learnix"); // Names the program Learnix
        primaryStage.setScene(new Scene(root, 1000, 700));  //default size for the program to load into
        //primaryStage.initStyle(StageStyle.UNDECORATED); //Removes the Window bar completely, will need to implement for MacOS only as it still allows fullscreen whereas Windows doesn't.
        primaryStage.setResizable(false); // Stops the resizing and maximising of the program
        primaryStage.show();
    }

}