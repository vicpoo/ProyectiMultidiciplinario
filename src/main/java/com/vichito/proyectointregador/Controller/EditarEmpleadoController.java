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
    private TextField IDingresarTxt;

    @FXML
    private Label IdAbc;

    @FXML
    private Label IngreseIDABC;

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
    void OnClickGuardarButton(MouseEvent event) {
      String nombre = NombreLabel.getText();
      String apellido = ApellidoLabel.getText();
      String area = AreaLabel.getText();
      String correoElectronico = EmailLabel.getText();
      String direccion = DireccionLabel.getText();
      int Id = Integer.parseInt(IDLabel.getText());

      if (!nombre.isEmpty() && apellido.isEmpty() && area.isEmpty() && correoElectronico.isEmpty() && direccion.isEmpty() && (Id != 0)){
          ArrayList<Empleados> listaempleados = HelloApplication.getPersona().getListaEmpleados();

          for (int i = 0; i<listaempleados.size(); i ++){
              Empleados empleados = listaempleados.get(i);
              if (empleados.getID() == Id){

                  empleados.setNombre(nombre);
                  empleados.setApellido(apellido);
                  empleados.setArea(area);
                  empleados.setEmail(correoElectronico);
                  empleados.setDireccion(direccion);

                  listaempleados.set(i, empleados );

                  Alert alert = new Alert(Alert.AlertType.INFORMATION);
                  alert.setTitle("Hecho");
                  alert.setContentText("Se actualizo con exito");
                  alert.showAndWait();
                  System.out.println(" se agrego"+ " " +nombre + apellido);

                  limpiar();
                  return;
              }


          }
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

    public void limpiar(){
        AreaLabel.clear();
        ApellidoLabel.clear();
        NombreLabel.clear();
        IDLabel.clear();
        EmailLabel.clear();
        DireccionLabel.clear();
    }
}
