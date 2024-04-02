package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.vichito.proyectointregador.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class jefeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button EmpleadosButton;

    @FXML
    private Button EquipoButton;

    @FXML
    private Button SalirButton;

    @FXML
    private Button UsuarioButton;

    @FXML
    private BorderPane background;

    @FXML
    void OnClickEmpleadosButton(MouseEvent event) throws IOException{
        HelloApplication escena = new HelloApplication();
        escena.changeScene("Empleados-view.fxml");
    }

    @FXML
    void OnClickEquipoButton(MouseEvent event) throws IOException{
        HelloApplication escena = new HelloApplication();
        escena.changeScene("Equipos-view.fxml");
    }

    @FXML
    void OnClickSalirButton(MouseEvent event) throws IOException{
        HelloApplication escena = new HelloApplication();
        escena.changeScene("hello-view.fxml");
    }

    @FXML
    void OnClickUsuarioButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("Usuarios-view.fxml");
    }

    @FXML
    void initialize() {
        background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");
    }

}
