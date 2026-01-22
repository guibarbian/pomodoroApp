package com.guibarbian.pomodoro.service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class PomodoroService {

    public void calculaTempoRestante(Integer tempo){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm:ss");
        LocalTime zero = LocalTime.of(0,0,0);
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            LocalTime time = LocalTime.of(0, tempo, 0);

            @Override
            public void run(){
                System.out.println(time.format(dtf));
                System.out.println(zero.format(dtf));
                System.out.println("");
                time = time.minusSeconds(1);
                if(time.toString().equals(zero.toString())){
                    System.out.println("Hora do descanso!");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
    
}
