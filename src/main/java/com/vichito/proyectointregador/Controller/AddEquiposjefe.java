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


public class AddEquiposjefe {

protected static EquiposComputo equiposComputo = new EquiposComputo();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button AgregarButton;

    @FXML
    private TextField MarcaLabel;

    @FXML
    private TextField ModeloLabel;

    @FXML
    private TextField NumeroSerieLabel;

    @FXML
    private Button SalirButton;

    @FXML
    private AnchorPane background;

    @FXML
    private TextField tipoEquipoLabel;

    @FXML
    void OnClickAgregarButton(MouseEvent event) {
      //  ArrayList<EquiposComputo> equiposComputos = HelloApplication.getEquiposComputo().getlistaEquipos();

        String TipoEquipo = tipoEquipoLabel.getText();
        String modelo = ModeloLabel.getText();
        String marca = MarcaLabel.getText();
        String NumeroSerie =NumeroSerieLabel.getText();

        EquiposComputo equipo = new EquiposComputo(TipoEquipo,modelo,marca,NumeroSerie);

        if (!HelloApplication.getEquiposComsjefe().contains(equipo)){
            HelloApplication.getEquiposComsjefe().add(equipo);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Hecho");
            alert.setContentText("Agregado con exito" + System.lineSeparator() +"Tipo de Equipo: " + TipoEquipo + System.lineSeparator() + "Modelo del equipo: " + modelo + System.lineSeparator() + "Marca del equipo: " + marca + System.lineSeparator()+ "Numero de serie del equipo: "+ NumeroSerie);
            alert.showAndWait();
            System.out.println("Se agrego correctamente" + NumeroSerie);
        }
        limpiar();
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

    private void limpiar() {
        MarcaLabel.clear();
        ModeloLabel.clear();
        tipoEquipoLabel.clear();
        NumeroSerieLabel.clear();
    }

}
