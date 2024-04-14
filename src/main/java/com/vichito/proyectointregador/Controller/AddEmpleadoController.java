package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.util.ArrayList;

import com.vichito.proyectointregador.HelloApplication;
import com.vichito.proyectointregador.Models.Empleados;
import com.vichito.proyectointregador.Models.EquiposComputo;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

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
        ArrayList<Empleados> empleados = HelloApplication.getPersona().getListaEmpleados();
        String Nombre = NombreLabel.getText();
        String Apellido = LabelApellidos.getText();
        String Area = AreaLabel.getText();
        String Direccion = DireccionLabel.getText();
        String CorreoElectronico = LabelEmail.getText();
        int ID = Integer.parseInt(IdLabel.getText());

        Empleados empleado = new Empleados(Nombre,Apellido,ID,Direccion,Area,CorreoElectronico);

        if (empleados.add(empleado)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Hecho");
            alert.setContentText("Agregado con exito" + System.lineSeparator() + " Nombre del empleado :" + Nombre + System.lineSeparator() + "Apellido del empleado :" + Apellido + System.lineSeparator() + "Area del empleado : "+ Area + System.lineSeparator() + "Dirreccion del empleado :" + Direccion + System.lineSeparator() + "Correo Electronico del empleado :"+CorreoElectronico +System.lineSeparator()+ "Id del empleado" + ID);
            alert.showAndWait();
            System.out.println("Se agrego correctamente: " + Nombre);
        }
        limpiar();
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

        private void limpiar(){
        LabelApellidos.clear();
        NombreLabel.clear();
        DireccionLabel.clear();
        AreaLabel.clear();
        LabelEmail.clear();
        IdLabel.clear();
    }

}
