package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.scene.control.Alert;
import com.vichito.proyectointregador.HelloApplication;
import com.vichito.proyectointregador.Models.EquiposComputo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
public class BuscarEquiposjefeController {

    private EquiposComputo equipoComputo = new EquiposComputo();
    @FXML
    private ResourceBundle resources;

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
    private AnchorPane background;

    @FXML
    void OnClickBuscarButton(MouseEvent event) {
        try {
            int numeroSerie = Integer.parseInt(NumeroSerieLabel.getText());
            EquiposComputo equipoEncontrado = equipoComputo.buscarPorNumeroSerie(numeroSerie);
            if (equipoEncontrado != null) {
                mostrarAlerta(AlertType.INFORMATION, "Equipo encontrado", equipoEncontrado.toString());
            } else {
                mostrarAlerta(AlertType.WARNING, "Equipo no encontrado", "No se encontró ningún equipo con el número de serie " + numeroSerie);
            }
        } catch (NumberFormatException e) {
            mostrarAlerta(AlertType.ERROR, "Error", "Por favor, introduce un número válido en el campo de número de serie.");
        }
    }

    private void mostrarAlerta(AlertType tipoAlerta, String titulo, String mensaje) {
        Alert alerta = new Alert(tipoAlerta);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

    @FXML
    void OnClickSalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("Equipos-view.fxml");
    }

    @FXML
    void initialize() {
            background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");
    }

}
