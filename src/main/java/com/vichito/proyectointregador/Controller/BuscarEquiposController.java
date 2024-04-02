package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.layout.AnchorPane;
import com.vichito.proyectointregador.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class BuscarEquiposController {

    @FXML
    private ResourceBundle resources;


    @FXML
    private AnchorPane Background;

    @FXML
    private URL location;

    @FXML
    private Button BuscarButton;

    @FXML
    private TextField EquipoLabel;

    @FXML
    private TextField NumeroSerieLabel;

    @FXML
    private Button SalirButton;

    @FXML
    void OnClickBuscarButton(MouseEvent event) {

    }

    @FXML
    void OnClickSalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("pov-noble-view.fxml");
    }

    @FXML
    void initialize() {
        Background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");

    }

}
