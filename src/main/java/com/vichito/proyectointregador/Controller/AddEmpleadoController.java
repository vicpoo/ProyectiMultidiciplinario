package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.vichito.proyectointregador.HelloApplication;
import com.vichito.proyectointregador.Models.Empleados;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;


import static com.vichito.proyectointregador.Controller.AddUsuarioController.empresa;
public class AddEmpleadoController {

    @FXML
    private TextField AreaLabel;

    @FXML
    private TextField DireccionLabel;

    @FXML
    private Button GuardarButton;

    @FXML
    private TextField IdLabel;

    @FXML
    private TextField LabelApellidos;

    @FXML
    private TextField LabelEmail;

    @FXML
    private TextField NombreLabel;

    @FXML
    private Button SalirButton;

    @FXML
    private AnchorPane background;

    @FXML
    void OnClickGuardarButton(MouseEvent event) {

        try {
            String nombre = NombreLabel.getText();
            String apellidos = LabelApellidos.getText();
            String Email = LabelEmail.getText();
            int ID = Integer.parseInt(IdLabel.getText());
            String Direccion = DireccionLabel.getText();
            String Area = AreaLabel.getText();
            Empleados nuevoEmpleado = new Empleados(nombre,apellidos,ID,Email,Direccion,Area);
            if (empresa.addEmpleados(nuevoEmpleado)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Hecho");
                alert.setContentText("Agregado con éxito");
                alert.showAndWait();
                System.out.println("se agrego" + nombre);
            }
        }
        catch (Exception e){
            Alert alert= new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("Ha habido un error al guardar datos" + e.getMessage());
            alert.showAndWait();
        }
    }

    @FXML
    void OnClickSalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("Empleados-view.fxml");
    }

    @FXML
        void initialize() {
            background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");
        }

}
