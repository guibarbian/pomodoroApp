package com.guibarbian.pomodoro.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.util.Duration;

public class PomodoroController {
    
    @FXML
    private TextField relogio;

    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm:ss");
    private LocalTime tempoLocalTime;
    private Timeline timeline;

    public void recebeDados(String tempoDeFoco){

        tempoLocalTime = LocalTime.of(0, Integer.parseInt(tempoDeFoco), 0);

        timeline = new Timeline(
            new KeyFrame(Duration.seconds(1), e -> {
                tempoLocalTime = tempoLocalTime.minusSeconds(1);
                relogio.setText(tempoLocalTime.format(dtf));

                if(tempoLocalTime.format(dtf).equals("00:00")){
                    relogio.setText("Hora do descanso!");
                    timeline.stop();
                }
            })
        );

        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }
}
