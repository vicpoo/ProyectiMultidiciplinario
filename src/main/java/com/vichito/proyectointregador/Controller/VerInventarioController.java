package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.vichito.proyectointregador.HelloApplication;
import com.vichito.proyectointregador.Models.EquiposComputo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class VerInventarioController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<EquiposComputo> InventarioEquiposTable;

    @FXML
    private TableColumn<EquiposComputo, String> MarcaEquipoColumna;

    @FXML
    private TableColumn<EquiposComputo, String> ModeloEquipoColumna;

    @FXML
    private TableColumn<EquiposComputo, String> NumeroSerieEquiposColumna;

    @FXML
    private Button SalirButton;

    @FXML
    private TableColumn<EquiposComputo, String> TipoEquipoColumna;

    @FXML
    private AnchorPane background;

    @FXML
    void OnClickSalirButton(MouseEvent event) throws IOException{
        HelloApplication escena = new HelloApplication();
        escena.changeScene("pov-noble-view.fxml");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.ModeloEquipoColumna.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        this.MarcaEquipoColumna.setCellValueFactory(new PropertyValueFactory<>("marca"));
        this.NumeroSerieEquiposColumna.setCellValueFactory(new PropertyValueFactory<>("NumeroSerie"));
        this.TipoEquipoColumna.setCellValueFactory(new PropertyValueFactory<>("TipoEquipo"));

        this.InventarioEquiposTable.setItems(HelloApplication.getEquiposComs());

        background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");
    }
}
