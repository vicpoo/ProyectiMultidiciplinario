package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.vichito.proyectointregador.HelloApplication;
import com.vichito.proyectointregador.Models.Inventario;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class TablaViewController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Inventario, String> ModeloEquipoColumna;

    @FXML
    private TableColumn<Inventario, String> NombreEmpleadoColumna;

    @FXML
    private Button RegresarButton;

    @FXML
    private TableView<Inventario> TableCargoView;

    @FXML
    private AnchorPane background;

    @FXML
    private Label textoLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.NombreEmpleadoColumna.setCellValueFactory(new PropertyValueFactory<>("empleados"));
        this.ModeloEquipoColumna.setCellValueFactory(new PropertyValueFactory<>("equiposComputo"));

        this.TableCargoView.setItems(HelloApplication.getInventarios());
        background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");
    }

    @FXML
    void OnClickRegresarButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("VerEquipos-view.fxml");
    }

}
