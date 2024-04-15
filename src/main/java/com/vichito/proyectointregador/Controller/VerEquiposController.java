package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import com.vichito.proyectointregador.Models.Inventario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import com.vichito.proyectointregador.HelloApplication;
import com.vichito.proyectointregador.Models.Empleados;
import com.vichito.proyectointregador.Models.EquiposComputo;
import javafx.fxml.FXML;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class VerEquiposController implements Initializable {

    @FXML
    private Button EncargarButton;

    @FXML
    private TextField IdEquipoTxt;

    @FXML
    private Label IngreseModeloEquipoABC;

    @FXML
    private Label IngreseNombreEmpleadoABC;

    @FXML
    private TextField NombreEmpleadoTxt;

    @FXML
    private Button SalirButton;

    @FXML
    private Button VerTablaButton;

    @FXML
    private Button VolverButton;

    @FXML
    private AnchorPane background;

    @FXML
        void OnClickEncargarButton(MouseEvent event) {
        String idBuscar = IdEquipoTxt.getText();
        String nombreBuscar = NombreEmpleadoTxt.getText();

        Inventario inventario = new Inventario(idBuscar, nombreBuscar);

        if (!HelloApplication.getInventarios().contains(inventario)) {
            HelloApplication.getInventarios().add(inventario);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Éxito");
            alert.setContentText("Se asigno un nuevo equipo");//Aquí si quieres pones que equipo y a quien
            alert.showAndWait();

            System.out.println("Empleado: "+inventario.getEmpleados());
            System.out.println("Equipo: "+inventario.getEquiposComputo());
        }
        Limpiar();
    }

    @FXML
    void OnClickSalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("Empleados-view.fxml");
    }


    @FXML
    void OnClickVerTablaButton(MouseEvent event) throws IOException{
     HelloApplication escena = new HelloApplication();
     escena.changeScene("tabla-view.fxml");
    }

    private void Limpiar(){
        NombreEmpleadoTxt.clear();
        IdEquipoTxt.clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");
    }
}

