package com.vichito.proyectointregador.Controller;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import com.vichito.proyectointregador.Models.EquiposComputo;
import com.vichito.proyectointregador.Models.Inventario;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
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
        String numeroSerie = this.NumeroSerieLabel.getText();
        //ArrayList<EquiposComputo> listaEquipos = HelloApplication.getEquiposComputo().getlistaEquipos();
        ObservableList<EquiposComputo> lista = HelloApplication.getEquiposComs();

        EquiposComputo equipoEncontrado = null;
        for (EquiposComputo equiposComputo : lista) {
            if (equiposComputo.getNumeroSerie().equals(numeroSerie)) {
                equipoEncontrado = equiposComputo;
                break;
            }
        }

        if (equipoEncontrado != null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Búsqueda Exitosa");
            alert.setContentText("Se encontró el equipo." + System.lineSeparator()+ "Numero de serie con el que se encontro"+ numeroSerie + System.lineSeparator()+System.lineSeparator() + "Marca del equipo: "+ equipoEncontrado.getMarca() + System.lineSeparator() + " Modelo del equipo :" + equipoEncontrado.getModelo() + System.lineSeparator() + " Dispositivo :" + equipoEncontrado.getTipoEquipo());
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Búsqueda Fallida");
            alert.setContentText("No se encontró el equipo.  :C");
            alert.showAndWait();
        }
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
