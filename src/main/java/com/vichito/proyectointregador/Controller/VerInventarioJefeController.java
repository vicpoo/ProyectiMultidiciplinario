package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.vichito.proyectointregador.HelloApplication;
import com.vichito.proyectointregador.Models.EquiposComputo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TableView;

public class VerInventarioJefeController implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<EquiposComputo, String> MarcaEquipoColumna;

    @FXML
    private TableColumn<EquiposComputo, String> ModeloEquipoColumna;

    @FXML
    private TableColumn<EquiposComputo, String> NumeroSerieEquipoColumna;

    @FXML
    private Button SalirButton;

    @FXML
    private TableColumn<EquiposComputo, String> TipoEquipoColumna;

    @FXML
    private TableView<EquiposComputo> tablaInventariotable;

    @FXML
    private AnchorPane background;

    @FXML
    void OnClickSalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("Equipos-view.fxml");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.ModeloEquipoColumna.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        this.MarcaEquipoColumna.setCellValueFactory(new PropertyValueFactory<>("marca"));
        this.NumeroSerieEquipoColumna.setCellValueFactory(new PropertyValueFactory<>("NumeroSerie"));
        this.TipoEquipoColumna.setCellValueFactory(new PropertyValueFactory<>("TipoEquipo"));

        this.tablaInventariotable.setItems(HelloApplication.getEquiposComsjefe());

        background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");

    }
}
