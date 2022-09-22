module com.example.diplomado {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.diplomado to javafx.fxml;
    exports com.example.diplomado;
}