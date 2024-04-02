package com.vichito.proyectointregador.Controller;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.vichito.proyectointregador.HelloApplication;
import com.vichito.proyectointregador.Models.Login;
import com.vichito.proyectointregador.Models.LoginUsuario;
import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button AccederButton;

    @FXML
    private TextField LabelContrasena;

    @FXML
    private BorderPane background;

    @FXML
    private Button SalirButton;

    @FXML
    private TextField TextUsuario;

    @FXML
    private Label wrongLoginLabel;

    @FXML
    void OnClickAccederButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        String usuario = TextUsuario.getText();
        String password =LabelContrasena.getText();

        LoginUsuario user1 = new LoginUsuario();

        if (user1.checkLoginUsuario(usuario, password)){
            escena.changeScene("pov-noble-view.fxml");
            return;
        }
        Login user = new Login();
        if (user.checkLogin(usuario, password)){
            escena.changeScene("jefe-view.fxml");}
        else {
            wrongLoginLabel.setVisible(true);
            wrongLoginLabel.setText("Datos Incorrectos");
            escena.changeScene("afterLogin.fxml");
        }
    }
    @FXML
    void OnclickSalirButton(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    void initialize() {
      background.setStyle(" -fx-background-color: linear-gradient(to right, black, #00008B);");
    }

}
