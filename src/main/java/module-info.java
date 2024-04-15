module com.vichito.proyectointregador {
    requires javafx.controls;
    requires javafx.fxml;
    opens com.vichito.proyectointregador.Models to javafx.base;

    requires org.kordamp.bootstrapfx.core;

    opens com.vichito.proyectointregador to javafx.fxml;
    exports com.vichito.proyectointregador;
    exports com.vichito.proyectointregador.Controller;
    opens com.vichito.proyectointregador.Controller to javafx.fxml;
}