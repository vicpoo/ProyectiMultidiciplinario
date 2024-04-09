package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.vichito.proyectointregador.HelloApplication;
import com.vichito.proyectointregador.Models.Usuarios;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class EliminarUsuarioController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button EliminarButton;

    @FXML
    private TextField NombreUsuarioLabel;

    @FXML
    private Button SalirButton;

    @FXML
    private AnchorPane background;

    @FXML
    void OnClickEliminarButton(MouseEvent event) {
     String user = NombreUsuarioLabel.getText();

        ArrayList<Usuarios> listaUsuario = HelloApplication.getPersona().getListaUsuario();

        Usuarios eliminarUsuario = null;
        for (Usuarios usuarios : listaUsuario){
            if (usuarios.getUsuario().equals(user)){
                eliminarUsuario = usuarios;
                break;
            }
        }
if (eliminarUsuario != null){
    listaUsuario.remove(eliminarUsuario);
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Hecho");
    alert.setContentText("Se elimino con exito");
    alert.showAndWait();
}
else {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Error");
    alert.setContentText("No se encontro ningun empleado con ese ID");
    alert.showAndWait();
}

    }

    @FXML
    void OnClickSalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("Usuarios-view.fxml");
    }

    @FXML
    void initialize() {
        background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");

    }

}
