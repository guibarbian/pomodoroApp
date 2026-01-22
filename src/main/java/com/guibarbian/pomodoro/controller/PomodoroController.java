package com.guibarbian.pomodoro.controller;

import com.guibarbian.pomodoro.service.PomodoroService;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PomodoroController {
    
    @FXML
    private TextField relogio;

    private final PomodoroService pomodoroService = new PomodoroService();
    

    public void recebeDados(Integer tempoDeFoco){
        pomodoroService.calculaTempoRestante(tempoDeFoco);

        String tempoDeFocoProcessado = tempoDeFoco.toString() + ":00";

        relogio.setText(tempoDeFocoProcessado);
    }
}
