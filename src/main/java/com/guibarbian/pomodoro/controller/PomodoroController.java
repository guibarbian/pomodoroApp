package com.guibarbian.pomodoro.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PomodoroController {
    
    @FXML
    private TextField relogio;
    

    public void recebeDados(String tempoDeFoco){
        String tempoDeFocoProcessado = tempoDeFoco + ":00";

        relogio.setText(tempoDeFocoProcessado);
    }
}
