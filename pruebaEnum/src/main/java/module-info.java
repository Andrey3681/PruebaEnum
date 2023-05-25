module com.example.pruebaenum {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pruebaenum to javafx.fxml;
    exports com.example.pruebaenum;
}