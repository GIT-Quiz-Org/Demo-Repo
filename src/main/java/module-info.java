module com.ijse.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ijse.demo to javafx.fxml;
    exports com.ijse.demo;
}