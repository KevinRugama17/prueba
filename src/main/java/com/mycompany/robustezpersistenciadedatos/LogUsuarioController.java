/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.robustezpersistenciadedatos;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author kevin
 */
public class LogUsuarioController  {

    @FXML private TextField txtNombre;
    @FXML private TextField txtEdad;
  
   
 

    @FXML
    private void guardarDatos() {
        String nombre = txtNombre.getText();
        String edadString = txtEdad.getText();

        try {
            int edad = Integer.parseInt(edadString);
            escribirEnArchivo(nombre, edad);
            
           
            mostrarAlerta("Éxito", "Datos guardados correctamente.", AlertType.INFORMATION);
            
            txtNombre.clear();
            txtEdad.clear();

        } catch (NumberFormatException e) {
          
            mostrarAlerta("Error de Formato", "La edad debe ser un número entero (ej: 25).", AlertType.ERROR);
        }
    }

    private void mostrarAlerta(String titulo, String mensaje, AlertType tipo) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

    private void escribirEnArchivo(String nombre, int edad) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", true))) {
            writer.write(nombre + " - " + edad);
            writer.newLine();
        } catch (IOException e) {
            mostrarAlerta("Error de Archivo", "No se pudo escribir en el log.", AlertType.ERROR);
        }
    }
    
}