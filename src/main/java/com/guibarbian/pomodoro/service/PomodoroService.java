package com.guibarbian.pomodoro.service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PomodoroService {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm:ss");
    
    public String reduzUmSegundo(String tempo){
        LocalTime tempoLocalTime = LocalTime.parse(tempo, dtf);
        return tempoLocalTime.minusSeconds(1).format(dtf);
    }
 
}
