package com.guibarbian.pomodoro.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {
    
    @FXML
    private Stage stage;
    private Scene scene;

    public void handleIniciar(ActionEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/com/guibarbian/pomodoro/fxml/PomodoroSettings.fxml"));
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void handleSair(ActionEvent e){
        System.out.println("Saiu");
        stage = (Stage) ((Button)e.getSource()).getScene().getWindow();
        stage.close(); 
    }

}
