package com.guibarbian.pomodoro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application{

    @Override
    public void start(Stage stage) {
        Label label = new Label("Pomodoro App rodando 🚀");

        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 400, 200);

        stage.setTitle("Pomodoro");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    
}
