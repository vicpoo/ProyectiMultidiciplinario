package com.vichito.proyectointregador.Controller;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import com.vichito.proyectointregador.HelloApplication;
import com.vichito.proyectointregador.Models.Empleados;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Alert;

public class EliminarEmpleadoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button EliminarButton;

    @FXML
    private TextField IdLabel;

    @FXML
    private Button SalirButton;

    @FXML
    private AnchorPane background;

    @FXML
    void OnClickEliminarButton(MouseEvent event) {
     String Id = this.IdLabel.getText();

     //ArrayList<Empleados> listaEmpleado = HelloApplication.getPersona().getListaEmpleados();
        ObservableList<Empleados> listaEmpleado = HelloApplication.getEmpleadosComs();

     Empleados empleadoEliminar = null;
     for (Empleados empleados : listaEmpleado){
         if (empleados.getID().equals(Id)){
             empleadoEliminar = empleados;
             break;
         }
     }

     if (empleadoEliminar != null){
         listaEmpleado.remove(empleadoEliminar);
         Alert alert = new Alert(Alert.AlertType.INFORMATION);
         alert.setTitle("Hecho");
         alert.setContentText("Se elimino con exito");
         alert.showAndWait();
     }else {
         Alert alert = new Alert(Alert.AlertType.INFORMATION);
         alert.setTitle("Error");
         alert.setContentText("No se encontro ningun empleado con ese ID");
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
