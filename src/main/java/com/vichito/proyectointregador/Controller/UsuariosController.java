package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.vichito.proyectointregador.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class UsuariosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button EditarButton;

    @FXML
    private Button EliminarButton;

    @FXML
    private Button NuevoButton;

    @FXML
    private Button VerUsuarios;

    @FXML
    private Button SalirButton;

    @FXML
    private AnchorPane background;

    @FXML
    void OnClickEditarButton(MouseEvent event) throws IOException{
     HelloApplication escena = new HelloApplication();
     escena.changeScene("EditarUsuario-view.fxml");
    }

    @FXML
    void OnClickEliminarButton(MouseEvent event) throws IOException{
        HelloApplication escena = new HelloApplication();
        escena.changeScene("EliminarUsuario-view.fxml");
    }

    @FXML
    void OnClickNuevoButton(MouseEvent event) throws IOException{
      HelloApplication escena = new HelloApplication();
      escena.changeScene("AddUsuario-view.fxml");
    }

    @FXML
    void OnClickVerUsuariosButton(MouseEvent event) throws IOException{
     HelloApplication escena = new HelloApplication();
     escena.changeScene("VerUsuarios-view.fxml");
    }

    @FXML
    void OnClickSalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("jefe-view.fxml");
    }

    @FXML
    void initialize() {
        background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");

    }

}
