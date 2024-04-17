package com.vichito.proyectointregador.Controller;

import com.vichito.proyectointregador.HelloApplication;
import com.vichito.proyectointregador.Models.Usuarios;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class VerUsuariosController implements Initializable {

    @FXML
    private TableColumn<Usuarios, String> ApellidoUsuarioColumna;

    @FXML
    private TableColumn<Usuarios, String> IdUsuarioColumna;

    @FXML
    private TableColumn<Usuarios, String> NombreUsuariosColumna;

    @FXML
    private Button SalirButton;

    @FXML
    private TableColumn<Usuarios, String> UsuarioUsuarioColumna;

    @FXML
    private AnchorPane background;

    @FXML
    private TableView<Usuarios> tablaUsuariosTable;


    @FXML
    void OnclickSalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("Usuarios-view.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.NombreUsuariosColumna.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        this.ApellidoUsuarioColumna.setCellValueFactory(new PropertyValueFactory<>("Apellido"));
        this.IdUsuarioColumna.setCellValueFactory(new PropertyValueFactory<>("ID"));
        this.UsuarioUsuarioColumna.setCellValueFactory(new PropertyValueFactory<>("Usuario"));

        this.tablaUsuariosTable.setItems(HelloApplication.getUsuariosComs());

        background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");
    }
}
