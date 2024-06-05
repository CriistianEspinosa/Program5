module com.example.program5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.program5 to javafx.fxml;
    exports com.example.program5;
}