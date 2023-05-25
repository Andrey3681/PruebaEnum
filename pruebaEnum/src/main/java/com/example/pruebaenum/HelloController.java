package com.example.pruebaenum;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

// trate de importar la Instancia pero no da
import com.example.pruebaenum.ListasController.INSTANCE;


public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    protected void onHelloButtonClick() {

       // INSTANCE.getStringList().añadirString(welcomeText.getText());


        welcomeText.setText("Welcome to JavaFX Application!");
    }
}