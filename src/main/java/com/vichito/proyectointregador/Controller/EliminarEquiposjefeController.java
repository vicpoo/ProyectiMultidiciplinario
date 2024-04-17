package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.vichito.proyectointregador.HelloApplication;
import com.vichito.proyectointregador.Models.EquiposComputo;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class EliminarEquiposjefeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BuscarButton;

    @FXML
    private TextField LabelBuscarNumeroSerie;

    @FXML
    private Button SalirButton;

    @FXML
    private AnchorPane background;

    @FXML
    void OnClickBuscarButton(MouseEvent event) {
        String numeroSerie = this.LabelBuscarNumeroSerie.getText();

       // ArrayList<EquiposComputo> listaEquipos = HelloApplication.getEquiposComputo().getlistaEquipos();
        ObservableList<EquiposComputo> listajefe = HelloApplication.getEquiposComsjefe();

        EquiposComputo equipoEliminar = null;
        for (EquiposComputo equiposComputo : listajefe) {
            if (equiposComputo.getNumeroSerie().equals(numeroSerie)) {
                equipoEliminar  = equiposComputo;
                break;
            }
        }

        if (equipoEliminar != null) {
            listajefe.remove(equipoEliminar);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Eliminar");
            alert.setContentText("Se ha eliminado correctamente.");
            alert.showAndWait();
        } else {
            listajefe.remove(equipoEliminar);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("No se encontró nigún equipo con ese número de serie.");
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
