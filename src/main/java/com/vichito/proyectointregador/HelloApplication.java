package com.vichito.proyectointregador;
import com.vichito.proyectointregador.Models.EquiposComputo;
import com.vichito.proyectointregador.Models.Personal;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

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




    public void changeScene(String fxml)throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch();
    }
}