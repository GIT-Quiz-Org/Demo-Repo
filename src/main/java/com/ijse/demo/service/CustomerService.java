package com.ijse.demo.service;

import com.ijse.demo.db.DBConnection;
import com.ijse.demo.model.Customer;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerService {

    public void saveCustomer(Customer customer){
        String sql = "INSERT INTO Customer VALUES(?,?)";

        PreparedStatement stm = null;
        try {
            stm = DBConnection.getInstance().getConnection()
                    .prepareStatement(sql);
            stm.setString(1, customer.getId());
            stm.setString(2, customer.getName());

            stm.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
