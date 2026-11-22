package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;


public class SaludoController {
    @FXML 
    private TextField campoNombre;

    @FXML
    private Label etiquetaSaludo;

    @FXML 
    private Button buttonSaludar;

    @FXML 
    private void saludar(){
        String nombre = campoNombre.getText();

        etiquetaSaludo.setText("Hola: "+ nombre);
    }
}
