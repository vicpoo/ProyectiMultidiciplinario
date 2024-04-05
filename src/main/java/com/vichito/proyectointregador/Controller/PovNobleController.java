package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.vichito.proyectointregador.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class PovNobleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button AddEquiposButton;

    @FXML
    private Button BuscarButton;

    @FXML
    private Button EliminarButton;

    @FXML
    private Button SalirButton;

    @FXML
    private Button VerCargoButton;

    @FXML
    private AnchorPane background;

    @FXML
    void OnClickAddEmpleadosButton(MouseEvent event) throws IOException{
        HelloApplication escena = new HelloApplication();
        escena.changeScene("addEquipos-view.fxml");
    }

    @FXML
    void OnClickBuscarButton(MouseEvent event) throws IOException{
       HelloApplication escena = new HelloApplication();
       escena.changeScene("BuscarEquipos-view.fxml");
    }

    @FXML
    void OnClickEliminarButton(MouseEvent event) throws IOException{
      HelloApplication escena = new HelloApplication();
      escena.changeScene("EliminarEquiposUser-view.fxml");
    }

    @FXML
    void OnClickSalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("hello-view.fxml");
    }

    @FXML
    void OnClickVerCargoButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");

    }

}
