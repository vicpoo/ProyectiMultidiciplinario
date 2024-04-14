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
import javafx.scene.control.Alert.AlertType;
public class BuscarEquiposjefeController {

    @FXML
    private Button BuscarButton;

    @FXML
    private TextField numeroSerieTxt;

    @FXML
    private Button SalirButton;

    @FXML
    private AnchorPane background;

    @FXML
    void OnClickBuscarButton(MouseEvent event) {
        int numeroSerie = Integer.parseInt(numeroSerieTxt.getText());
        ArrayList<EquiposComputo> listaEquipos = HelloApplication.getEquiposComputo().getlistaEquipos();

        EquiposComputo equipoEncontrado = null;
        for (EquiposComputo equipos : listaEquipos) {
            if (equipos.getNumeroSerie() == numeroSerie) {
                equipoEncontrado = equipos;
                break;
            }
        }

        if (equipoEncontrado != null) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Búsqueda Exitosa");
            alert.setContentText("Se encontró el equipo." + System.lineSeparator()+ "Numero de serie con el que se encontro"+numeroSerie + System.lineSeparator());
            alert.showAndWait();
        } else {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Búsqueda Fallida");
            alert.setContentText("No se encontró el equipo.  :C");
            alert.showAndWait();
        }
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
