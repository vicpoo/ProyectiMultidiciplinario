package com.vichito.proyectointregador.Controller;

import com.vichito.proyectointregador.HelloApplication;
import com.vichito.proyectointregador.Models.Empleados;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class VerEmpleadosController implements Initializable {

    @FXML
    private TableColumn<Empleados, String> ApellidoColumna;

    @FXML
    private TableColumn<Empleados, String> AreaColumna;

    @FXML
    private TableColumn<Empleados, String> DirrecionColumna;

    @FXML
    private TableColumn<Empleados, String> EmailColumna;

    @FXML
    private TableColumn<Empleados, String> IDColumna;

    @FXML
    private TableColumn<Empleados, String> NombreColumna;

    @FXML
    private TableView<Empleados> EmpleadosTabla;

    @FXML
    private Button SalirButton;

    @FXML
    private AnchorPane background;

    @FXML
    void OnClickSalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("Empleados-view.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.NombreColumna.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        this.ApellidoColumna.setCellValueFactory(new PropertyValueFactory<>("Apellido"));
        this.AreaColumna.setCellValueFactory(new PropertyValueFactory<>("Area"));
        this.DirrecionColumna.setCellValueFactory(new PropertyValueFactory<>("Direccion"));
        this.EmailColumna.setCellValueFactory(new PropertyValueFactory<>("Email"));
        this.IDColumna.setCellValueFactory(new PropertyValueFactory<>("ID"));

        this.EmpleadosTabla.setItems(HelloApplication.getEmpleadosComs());


        background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");
    }
}
