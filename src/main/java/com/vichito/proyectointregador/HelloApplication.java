package com.vichito.proyectointregador;
import com.vichito.proyectointregador.Models.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Date;

public class HelloApplication extends Application {
    private  static Stage stg;
    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        stage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Administracion de Equipos");
        stage.setScene(scene);
        stage.show();
    }
    private static Personal persona = new Personal();

    private static EquiposComputo equiposComputo = new EquiposComputo();

    public static Personal getPersona(){ return persona;}

    public static EquiposComputo getEquiposComputo() { return equiposComputo;}

    private static Inventario inventario = new Inventario();

    private static ObservableList<Inventario> inventarios = FXCollections.observableArrayList();

    public static  Inventario getInventario() {
        return inventario;
    }

    public static  ObservableList<Inventario> getInventarios() {
        return inventarios;
    }

    private static ObservableList<EquiposComputo> equiposComs = FXCollections.observableArrayList();
    public static ObservableList<EquiposComputo> getEquiposComs() { return equiposComs;}

    //segunda table
    private static DataBase dataBase = new DataBase();
    private static ObservableList<DataBase> dataBases = FXCollections.observableArrayList();
    public static DataBase getDataBase(){ return dataBase;}
    private static ObservableList<DataBase> getDataBases() { return dataBases;}

    private static ObservableList<Usuarios> usuariosComs = FXCollections.observableArrayList();
    public static ObservableList<Usuarios> getUsuariosComs(){ return usuariosComs;}

    //fin de data base

    private static InventarioJefe inventarioJefe = new InventarioJefe();
    private static ObservableList<InventarioJefe> inventariosJefes = FXCollections.observableArrayList();
    public static InventarioJefe getInventarioJefe(){ return inventarioJefe;}
    public static ObservableList<EquiposComputo> equiposComsjefe = FXCollections.observableArrayList();
    public static ObservableList<EquiposComputo> getEquiposComsjefe(){ return equiposComsjefe;}

    // aqui este el del jefe





    public void changeScene(String fxml)throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }




    public static void main(String[] args) {
        launch();
    }
}