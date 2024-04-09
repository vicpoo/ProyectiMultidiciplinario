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

public class EditarUsuarioController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private TextField ApellidosLabel;

    @FXML
    private TextField IdLabel;

    @FXML
    private Button GuardarButton;

    @FXML
    private TextField NombreLabel;

    @FXML
    private Button SalirButton;

    @FXML
    private TextField UsuarioLabel;

    @FXML
    private AnchorPane background;

    @FXML
    void OnClickGuardarButton(MouseEvent event) {
        String nombre = NombreLabel.getText();
        String apellido = ApellidosLabel.getText();
        int Id = Integer.parseInt(IdLabel.getText());
        String user = UsuarioLabel.getText();

        if (!user.isEmpty() && !(Id !=0) && apellido.isEmpty() && nombre.isEmpty()){

            ArrayList<Usuarios> listaUsuario = HelloApplication.getPersona().getListaUsuario();

            Usuarios usuarioActualizado = null;
            for (int i = 0; i< listaUsuario.size(); i++){
                Usuarios usuarios = listaUsuario.get(i);
                if (usuarios.getUsuario().equals(user)){
                    usuarios.setNombre(nombre);
                    usuarios.setApellido(apellido);
                    usuarios.setID(Id);

                    listaUsuario.set(i, usuarios);

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Hecho");
                    alert.setContentText("Se actualizo con exito");
                    alert.showAndWait();

                    limpiar();
                    return;
                }
            }
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

    public void limpiar(){
        UsuarioLabel.clear();
        NombreLabel.clear();
        IdLabel.clear();
        ApellidosLabel.clear();
    }

}
