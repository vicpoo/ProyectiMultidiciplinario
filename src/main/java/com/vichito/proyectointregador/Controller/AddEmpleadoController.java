package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.vichito.proyectointregador.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class AddEmpleadoController {

    @FXML
    private TextField AreaLabel;

    @FXML
    private TextField DireccionLabel;

    @FXML
    private Button GuardarButton;

    @FXML
    private TextField IdLabel;

    @FXML
    private TextField LabelApellidos;

    @FXML
    private TextField LabelEmail;

    @FXML
    private TextField NombreLabel;

    @FXML
    private Button SalirButton;

    @FXML
    private AnchorPane background;

    @FXML
    void OnClickGuardarButton(MouseEvent event) {

    }

    @FXML
    void OnClickSalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("Empleados-view.fxml");
    }

    @FXML
    void initialize() {
        background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");

    }

}
