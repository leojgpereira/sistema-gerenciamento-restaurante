module com.apsoo.sistemagerenciamentorestaurante {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.apsoo.sistemagerenciamentorestaurante to javafx.fxml;
    exports com.apsoo.sistemagerenciamentorestaurante;
}