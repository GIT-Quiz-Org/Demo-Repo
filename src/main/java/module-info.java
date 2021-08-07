module com.ijse.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.java;
    requires java.sql;


    opens com.ijse.demo to javafx.fxml;
    exports com.ijse.demo;
    exports com.ijse.demo.main;
    opens com.ijse.demo.main to javafx.fxml;
    exports com.ijse.demo.controller;
    opens com.ijse.demo.controller to javafx.fxml;
}