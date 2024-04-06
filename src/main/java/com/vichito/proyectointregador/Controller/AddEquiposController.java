package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.vichito.proyectointregador.HelloApplication;
import com.vichito.proyectointregador.Models.EquiposComputo;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import static com.vichito.proyectointregador.Controller.AddEquiposjefe.equiposComputo;

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
    try{
     String TipoModelo = TipoEquipoLabel.getText();
     String modelo = ModeloLabel.getText();
     String marca = MarcaLabel.getText();
     int NumeroSerie = Integer.parseInt(NumerSerieLabel.getText());
        EquiposComputo nuevoEquipo = new EquiposComputo(TipoModelo,modelo,marca,NumeroSerie);
        if (equiposComputo.addEquiposComputo(nuevoEquipo)){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Hecho");
            alert.setContentText("Agregado con éxito");
            alert.showAndWait();
        }
    }
    catch (Exception e){
        Alert alert= new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Error");
        alert.setContentText("Ha habido un error al guardar datos" + e.getMessage());
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
        background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");

    }

}
