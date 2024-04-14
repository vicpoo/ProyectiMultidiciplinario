package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.vichito.proyectointregador.HelloApplication;
import com.vichito.proyectointregador.Models.Empleados;
import com.vichito.proyectointregador.Models.Usuarios;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class EditarEmpleadoController {

    @FXML
    private TextField ApellidoLabel;

    @FXML
    private Label ApellidosAbc;

    @FXML
    private Label AreaAbc;

    @FXML
    private TextField AreaLabel;

    @FXML
    private Button BuscarButton;


    @FXML
    private TextField DireccionLabel;

    @FXML
    private TextField EmailLabel;

    @FXML
    private Label EmailTxt;

    @FXML
    private Button GuardarButton;

    @FXML
    private TextField IDLabel;

    @FXML
    private Label IdAbc;

    @FXML
    private Label ingreseINombreLabel;

    @FXML
    private TextField ingreseNombreText;


    @FXML
    private Label NombreAbc;

    @FXML
    private TextField NombreLabel;

    @FXML
    private Button SalirButton;

    @FXML
    private AnchorPane background;

    @FXML
    private Label direccionAbc;

    @FXML
    void OnClickBuscarButton(MouseEvent event) {
        String idBuscar = ingreseNombreText.getText();
        ArrayList<Empleados> listaEmpleados = HelloApplication.getPersona().getListaEmpleados();

        Empleados empleadoEncontrado = null;
        for (Empleados empleados : listaEmpleados) {
            if (empleados.getNombre().equals(idBuscar)) {
                empleadoEncontrado = empleados;
                break;
            }
        }

        if (empleadoEncontrado != null) {
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Búsqueda Exitosa");
            alert.setContentText("Se encontró el empleado buscado.");
            alert.showAndWait();

            NombreAbc.setVisible(true);
            NombreLabel.setVisible(true);
            direccionAbc.setVisible(true);
            ApellidoLabel.setVisible(true);
            ApellidosAbc.setVisible(true);
            AreaAbc.setVisible(true);
            AreaLabel.setVisible(true);
            DireccionLabel.setVisible(true);
            EmailLabel.setVisible(true);
            EmailTxt.setVisible(true);
            IDLabel.setVisible(true);
            IdAbc.setVisible(true);
            GuardarButton.setVisible(true);

            IDLabel.setText(String.valueOf(empleadoEncontrado.getID()));
            NombreLabel.setText(empleadoEncontrado.getNombre());
            ApellidoLabel.setText(empleadoEncontrado.getApellido());
            DireccionLabel.setText(empleadoEncontrado.getDireccion());
            EmailLabel.setText(empleadoEncontrado.getEmail());
            AreaLabel.setText(empleadoEncontrado.getArea());

            ingreseNombreText.setVisible(false);
            ingreseINombreLabel.setVisible(false);
            BuscarButton.setVisible(false);
        } else {
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("No se encontró el empleado buscado.");
            alert.showAndWait();
        }
        limpiar();
    }

    @FXML
    void OnClickGuardarButton(MouseEvent event) {
        String id = IDLabel.getText();
        String nombre = NombreLabel.getText();
        String apellido = ApellidoLabel.getText();
        String direccion = DireccionLabel.getText();
        String email = EmailLabel.getText();
        String area = AreaLabel.getText();

        if (!id.isEmpty() && !nombre.isEmpty() && !apellido.isEmpty() && !direccion.isEmpty() && !email.isEmpty() && !area.isEmpty()) {
            ArrayList<Empleados> listaEmpleados = HelloApplication.getPersona().getListaEmpleados();
            int idBuscado = Integer.parseInt(id);

            for (int i=0; i<listaEmpleados.size();i++) {
                Empleados empleado = listaEmpleados.get(i);
                if (empleado.getID() == idBuscado) {
                empleado.setID(Integer.parseInt(id));
                empleado.setNombre(nombre);
                empleado.setApellido(apellido);
                empleado.setDireccion(direccion);
                empleado.setEmail(email);
                empleado.setArea(area);

                listaEmpleados.set(i, empleado);

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
        alert.setContentText("No se encontró ningún empleado con ese nombre");
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
        escena.changeScene("Empleados-view.fxml");
    }

    public void limpiar(){
        AreaLabel.clear();
        ApellidoLabel.clear();
        NombreLabel.clear();
        IDLabel.clear();
        EmailLabel.clear();
        DireccionLabel.clear();
    }

    @FXML
    void initialize() {
        background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");
    }
}
