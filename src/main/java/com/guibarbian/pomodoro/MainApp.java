package com.guibarbian.pomodoro;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainApp extends Application{

    @Override
    public void start(Stage stage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image image = new Image("/com/guibarbian/pomodoro/images/icon.png");

        stage.getIcons().add(image);
        stage.setTitle("Pomodoro by GuiBarbian");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    
}
