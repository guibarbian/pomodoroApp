package com.guibarbian.pomodoro.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Arc;

public class Controller {

    @FXML
    private Arc arc;
    private double circleX;
    private double circleY;
    
    public void Up(ActionEvent e){
        arc.setCenterY(circleY-=1);
    }

     public void Right(ActionEvent e){
        arc.setCenterX(circleX+=1);
    }

     public void Down(ActionEvent e){
        arc.setCenterY(circleY+=1);
    }

     public void Left(ActionEvent e){
        arc.setCenterX(circleX-=1);
    }
}
