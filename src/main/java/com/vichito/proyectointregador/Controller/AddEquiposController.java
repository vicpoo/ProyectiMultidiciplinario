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

public class AddEquiposController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField MarcaLabel;

    @FXML
    private TextField ModeloLabel;

    @FXML
    private TextField NumerSerieLabel;

    @FXML
    private Button SalirButton;

    @FXML
    private TextField TipoEquipoLabel;

    @FXML
    private Button addButton;

    @FXML
    private AnchorPane background;

    @FXML
    void OnClickAddButton(MouseEvent event) {

    }

    @FXML
    void OnClickSalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("pov-noble-view.fxml");
    }

    @FXML
    void initialize() {
        background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");

    }

}
