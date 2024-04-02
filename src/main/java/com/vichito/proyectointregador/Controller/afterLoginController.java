package com.vichito.proyectointregador.Controller;

import com.vichito.proyectointregador.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class afterLoginController {

    @FXML
    private Button RegresarButton;

    @FXML
    void OnClickRegresaButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("hello-view.fxml");
    }

}
