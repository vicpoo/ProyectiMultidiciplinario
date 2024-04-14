package com.vichito.proyectointregador.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.vichito.proyectointregador.Models.Inventario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import com.vichito.proyectointregador.HelloApplication;
import com.vichito.proyectointregador.Models.Empleados;
import com.vichito.proyectointregador.Models.EquiposComputo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class VerEquiposController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button EncargarButton;

    @FXML
    private TextField IdEquipoTxt;

    @FXML
    private TextField NombreEmpleadoTxt;

    @FXML
    private Button SalirButton;

    @FXML
    private AnchorPane background;

    @FXML
    void OnClickEncargarButton(MouseEvent event) {
        String idBuscar = IdEquipoTxt.getText();
        String nombreBuscar = NombreEmpleadoTxt.getText();

        ArrayList<Empleados> listaEmpleados = HelloApplication.getPersona().getListaEmpleados();
        ArrayList<EquiposComputo> listaEquipos = HelloApplication.getEquiposComputo().getlistaEquipos();

        ArrayList<Inventario> listaIventario = new ArrayList<>();

        for (Empleados empleados : listaEmpleados){
            if (empleados.getNombre().equals(nombreBuscar)){
                for (EquiposComputo equiposComputo : listaEquipos){
                    if (equiposComputo.getModelo().equals(idBuscar)){
                        listaIventario.add(new Inventario(equiposComputo,empleados));
                    }
                }
            }
        }
        for (Inventario inventario: listaIventario){
            System.out.println("El empleado: " + inventario.getEmpleados().getNombre() +
                    " tiene a su cargo el equipo: " + inventario.getEquiposComputo().getModelo());
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
