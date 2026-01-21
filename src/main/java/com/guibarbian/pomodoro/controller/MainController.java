package com.guibarbian.pomodoro.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {
    
    @FXML
    private Stage stage;

    public void handleSair(ActionEvent e){
        System.out.println("Saiu");
        stage = (Stage) ((Button)e.getSource()).getScene().getWindow();
        stage.close(); 
    }

}
