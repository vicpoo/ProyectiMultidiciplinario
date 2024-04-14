package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.vichito.proyectointregador.Models.Empleados;
import javafx.scene.control.Label;
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
    private Label ApellidosABc;

    @FXML
    private TextField ApellidosLabel;

    @FXML
    private Button BuscarButton;

    @FXML
    private Button GuardarButton;

    @FXML
    private Label IdABC;

    @FXML
    private TextField IdLabel;

    @FXML
    private Label IngreseUsuarioLabel;

    @FXML
    private TextField IngreseUsuarioText;

    @FXML
    private Label NombreABC;

    @FXML
    private TextField NombreLabel;

    @FXML
    private Button SalirButton;

    @FXML
    private Label UsuarioABC;

    @FXML
    private TextField UsuarioLabel;

    @FXML
    private AnchorPane background;


    @FXML
    void OnClickBuscarButton(MouseEvent event) {
        String idBuscar = IngreseUsuarioText.getText();
        ArrayList<Usuarios> listaUsuarios = HelloApplication.getPersona().getListaUsuario();

        Usuarios usuarioEncontrado = null;
        for (Usuarios usuarios : listaUsuarios){
            if (usuarios.getUsuario().equals(idBuscar)){
                usuarioEncontrado = usuarios;
                break;
            }
        }

        if (usuarioEncontrado != null){
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Búsqueda Exitosa");
            alert.setContentText("Se encontró el empleado buscado.");
            alert.showAndWait();

            IdABC.setVisible(true);
            IdLabel.setVisible(true);
            NombreLabel.setVisible(true);
            NombreABC.setVisible(true);
            GuardarButton.setVisible(true);
            ApellidosABc.setVisible(true);
            ApellidosLabel.setVisible(true);
            UsuarioLabel.setVisible(true);
            UsuarioABC.setVisible(true);

            IdLabel.setText(String.valueOf(usuarioEncontrado.getID()));
            NombreLabel.setText(String.valueOf(usuarioEncontrado.getNombre()));
            ApellidosLabel.setText(String.valueOf(usuarioEncontrado.getApellido()));
            UsuarioLabel.setText(String.valueOf(usuarioEncontrado.getUsuario()));

            BuscarButton.setVisible(false);
            IngreseUsuarioLabel.setVisible(false);
            IngreseUsuarioText.setVisible(false);
        } else {
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("No se encontró el usuario buscado.");
            alert.showAndWait();
        }
        limpiar();
    }
    @FXML
    void OnClickGuardarButton(MouseEvent event) {
        String Id = IdLabel.getText();
        String nombre = NombreLabel.getText();
        String apellido = ApellidosLabel.getText();
        String user = UsuarioLabel.getText();

        if (!Id.isEmpty() && !nombre.isEmpty() && !apellido.isEmpty() && !user.isEmpty()){
            ArrayList<Usuarios> listaUsuarios = HelloApplication.getPersona().getListaUsuario();
            int IdBuscado = Integer.parseInt(Id);

            for (int i = 0; i<listaUsuarios.size(); i++){
                Usuarios usuarios = listaUsuarios.get(i);
                if (usuarios.getID() == IdBuscado){
                    usuarios.setID(Integer.parseInt(Id));
                    usuarios.setUsuario(user);
                    usuarios.setNombre(nombre);
                    usuarios.setApellido(apellido);

                    listaUsuarios.set(i, usuarios);

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Actualizacion exitosa");
                    alert.setContentText("Se actualizo correctamente ");
                    alert.showAndWait();

                    limpiar();
                    return;
                }
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("No se encontró ningún usuario con ese nombre");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("Complete todos los campos");
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

    public void limpiar(){
        UsuarioLabel.clear();
        NombreLabel.clear();
        IdLabel.clear();
        ApellidosLabel.clear();
    }

}
