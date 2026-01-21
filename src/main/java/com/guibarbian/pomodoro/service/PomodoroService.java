package com.guibarbian.pomodoro.service;

import java.time.Duration;
import java.time.LocalTime;

public class PomodoroService {

    public String calculaTempoRestante(){
        LocalTime começo = LocalTime.now();
        LocalTime tempoTiro = LocalTime.of(0, 30);

        Duration tempoRestante = (Duration.between(começo, tempoTiro));

        long minutos = tempoRestante.toMinutes();
        long segundos = tempoRestante.toSecondsPart();

        return minutos + ":" + segundos;

    }
    
}
