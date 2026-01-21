package com.guibarbian.pomodoro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainApp extends Application{

    @Override
    public void start(Stage stage) throws Exception{

        try{
            Parent root = FXMLLoader.load(getClass().getResource("/com/guibarbian/pomodoro/fxml/Main.fxml"));
            Scene scene = new Scene(root);

            Image image = new Image("/com/guibarbian/pomodoro/images/icon.png");

            stage.getIcons().add(image);
            stage.setTitle("Pomodoro by GuiBarbian");
            stage.setScene(scene);
            stage.show();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    
}
