package com.mycompany.robustezpersistenciadedatos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {
 @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LogUsuario.fxml"));
        stage.setTitle("Registro Estudiantes");
        stage.setScene(new Scene(root, 400, 300));
        stage.show();
    
    }

}