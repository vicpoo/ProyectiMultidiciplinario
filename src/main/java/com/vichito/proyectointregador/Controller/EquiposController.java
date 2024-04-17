package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.vichito.proyectointregador.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class EquiposController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BuscarButton;

    @FXML
    private Button EliminarButton;

    @FXML
    private Button InventaryButton;

    @FXML
    private Button NewEquipoButton;

    @FXML
    private AnchorPane background;

    @FXML
    private Button SalirButton;

    @FXML
    void OnClickBuscarButton(MouseEvent event) throws IOException{
        HelloApplication escena = new HelloApplication();
        escena.changeScene("BuscarEquiposjefe-view.fxml");
    }

    @FXML
    void OnClickEliminarButton(MouseEvent event) throws IOException{
     HelloApplication escena = new HelloApplication();
     escena.changeScene("EliminarEquiposjefe-view.fxml");
    }

    @FXML
    void OnClickVerInventarioButton(MouseEvent event) throws IOException{
     HelloApplication escena = new HelloApplication();
     escena.changeScene("VerInventarioJefe-view.fxml");
    }

    @FXML
    void OnClickNewEquipoButton(MouseEvent event) throws IOException{
        HelloApplication escena = new HelloApplication();
        escena.changeScene("AddEquiposjefe-view.fxml");
    }

    @FXML
    void OnClickSalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("jefe-view.fxml");
    }

    @FXML
    void initialize() {
        background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");
    }

}
