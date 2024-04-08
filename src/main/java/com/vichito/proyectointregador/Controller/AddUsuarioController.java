package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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

    protected static Personal empresa = new Personal();

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
     try {

         String nombre =LabelNombre.getText();
         String apellido =LabelApellido.getText();
         int ID = Integer.parseInt(LabelId.getText());
         String Usuario = LabelUser.getText();
         Usuarios nuevoUsuario = new Usuarios(nombre,apellido,ID,Usuario);
         if (empresa.addUsuarios(nuevoUsuario)){
             Alert alert = new Alert(Alert.AlertType.INFORMATION);
             alert.setTitle("Hecho");
             alert.setContentText("Agregado con exito");
             alert.showAndWait();
         }
     }
     catch (Exception e){
     Alert alert = new Alert(Alert.AlertType.INFORMATION);
     alert.setTitle("Error");
     alert.setContentText("Ha habido un error al agregar los datos" + e.getMessage());
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
