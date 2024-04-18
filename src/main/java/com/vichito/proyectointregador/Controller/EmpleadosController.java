package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.vichito.proyectointregador.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class EmpleadosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button EditarButton;

    @FXML
    private Button EliminarButton;

    @FXML
    private Button VerEmpleadosButton;

    @FXML
    private Button EquipoCargoButton;

    @FXML
    private Button NuevoButton;

    @FXML
    private Button SalirButton;

    @FXML
    private Button VerEquiposButton;

    @FXML
    private AnchorPane background;

    @FXML
    void OnClickEditarButton(MouseEvent event) throws IOException{
     HelloApplication escena = new HelloApplication();
     escena.changeScene("EditarEmpleado-view.fxml");
    }

    @FXML
    void OnClickEliminarButton(MouseEvent event) throws IOException{
      HelloApplication escena = new HelloApplication();
      escena.changeScene("EliminarEmpleado-view.fxml");
    }


    @FXML
    void OnClickNuevoButton(MouseEvent event) throws IOException{
       HelloApplication escena = new HelloApplication();
       escena.changeScene("AddEmpleado-view.fxml");
    }

    @FXML
    void OnClickVerEmpleadosButton(MouseEvent event) throws IOException{
     HelloApplication escena = new HelloApplication();
     escena.changeScene("VerEmpleados-view.fxml");
    }

    @FXML
    void OnclickVerEquiposButton(MouseEvent event) throws IOException{
     HelloApplication escena = new HelloApplication();
     escena.changeScene("VerEquipos-view.fxml");
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
