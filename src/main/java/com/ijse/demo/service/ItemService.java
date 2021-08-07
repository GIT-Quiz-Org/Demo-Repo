package com.ijse.demo.service;

import com.ijse.demo.db.DBConnection;
import com.ijse.demo.model.Customer;
import com.ijse.demo.model.Item;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemService {

    public void saveItem(Item item){
        String sql = "INSERT INTO Item VALUES(?,?)";

        PreparedStatement stm = null;
        try {
            stm = DBConnection.getInstance().getConnection()
                    .prepareStatement(sql);
            stm.setString(1, item.getItemId());
            stm.setString(2, item.getItemName());

            stm.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
