module com.example.autuservice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.autuservice to javafx.fxml;
    exports com.example.autuservice;
}