package com.guibarbian.pomodoro.controller;

import java.io.IOException;

import com.guibarbian.pomodoro.service.PomodoroService;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PomodoroSettingsController {
    
    @FXML
    private TextField tempoDeFoco;

    @FXML
    private TextField tempoDeDescanso;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void handleComecar(ActionEvent e) throws IOException{
        String tempoDeFocoStr = tempoDeFoco.getText();
        Integer tempoDeDescansoInt = transformaTempoParaInteger(tempoDeDescanso.getText());

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/guibarbian/pomodoro/fxml/PomodoroPage.fxml"));
        root = loader.load();

        PomodoroController pomodoroController = loader.getController();
        pomodoroController.recebeDados(tempoDeFocoStr);

        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private Integer transformaTempoParaInteger(String tempo){
        try{
            return Integer.parseInt(tempo);
        } catch(Exception e){
            throw new IllegalArgumentException("tempo não é número");
        }
    }

}
