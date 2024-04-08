package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.vichito.proyectointregador.HelloApplication;
import com.vichito.proyectointregador.Models.EquiposComputo;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class EliminarEquiposUserController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button EliminarButton;

    @FXML
    private TextField LabelNumeroSerie;

    @FXML
    private Button SalirButton;

    @FXML
    private AnchorPane background;

    @FXML
    void OnClickEliminarButton(MouseEvent event) {
        int numeroSerie = Integer.parseInt(LabelNumeroSerie.getText());

        ArrayList<EquiposComputo> listaEquipos = HelloApplication.getEquiposComputo().getlistaEquipos();

        EquiposComputo equipoEliminar = null;
        for (EquiposComputo equiposComputo : listaEquipos) {
            if (equiposComputo.getNumeroSerie() == numeroSerie) {
                equipoEliminar  = equiposComputo;
                break;
            }
        }

        if (equipoEliminar != null) {
            listaEquipos.remove(equipoEliminar);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Eliminar");
            alert.setContentText("Se ha eliminado correctamente.");
            alert.showAndWait();
        } else {
            listaEquipos.remove(equipoEliminar);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("No se encontró nigún equipo con ese número de serie.");
            alert.showAndWait();
        }

    }

    @FXML
    void OnClickSalirButton(MouseEvent event) throws IOException {
        HelloApplication escena =new HelloApplication();
        escena.changeScene("pov-noble-view.fxml");
    }

    @FXML
    void initialize() {
        background.setStyle("-fx-background-color:linear-gradient(to right,black,#00008B);");
    }

}
