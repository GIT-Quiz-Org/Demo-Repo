package com.ijse.demo.controller;

import com.ijse.demo.model.Customer;
import com.ijse.demo.model.Item;
import com.ijse.demo.service.CustomerService;
import com.ijse.demo.service.ItemService;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ItemController {
    public TextField txtItemId;
    public TextField txtItemName;
    public Button btnSaveItem;

    public void btnSaveItemOnAction(ActionEvent actionEvent) {
        ItemService is = new ItemService();

        is.saveItem(new Item(txtItemId.getText(), txtItemName.getText()));
    }
}
