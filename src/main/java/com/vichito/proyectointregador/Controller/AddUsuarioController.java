package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.vichito.proyectointregador.Models.Empleados;
import com.vichito.proyectointregador.Models.Empresa;
import com.vichito.proyectointregador.Models.Personal;
import com.vichito.proyectointregador.Models.Usuarios;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import com.vichito.proyectointregador.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


public class AddUsuarioController {


    @FXML
    private Button GuardarButton;

    @FXML
    private TextField LabelApellido;

    @FXML
    private TextField LabelId;

    @FXML
    private TextField LabelNombre;

    @FXML
    private TextField LabelUser;

    @FXML
    private Button SalirButton;

    @FXML
    private AnchorPane background;

    @FXML
    void OnClickGuardarButton(MouseEvent event) {
        ArrayList<Usuarios> usuarios = HelloApplication.getPersona().getListaUsuario();

        String nombre = this.LabelNombre.getText();
        String apellido = this.LabelApellido.getText();
        String user = this.LabelUser.getText();
        int Id = Integer.parseInt(LabelId.getText());

        Usuarios usuario = new Usuarios(nombre,apellido,Id,user);

        if (usuarios.add(usuario)){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Hecho");
            alert.setContentText("Agregado con exito" + System.lineSeparator() + " nombre del usuario" + nombre + System.lineSeparator() + "Apellido del usuario:" + apellido + System.lineSeparator() + "Usuario del usuario: " + user + System.lineSeparator() + " ID del usuario :" + Id );
            alert.showAndWait();
            System.out.println("Se agrego correctamente" + user);
        }
        limpiar();
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
        LabelApellido.clear();
        LabelId.clear();
        LabelNombre.clear();
        LabelUser.clear();
    }

}
