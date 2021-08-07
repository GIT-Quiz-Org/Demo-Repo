/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Sheron Perera. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/**
 * @author <sheronenosh1234@gmail.com> Sheron Perera
 */


package com.ijse.demo.controller;

import com.ijse.demo.model.Customer;
import com.ijse.demo.service.CustomerService;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CustomerController {
    public TextField txtId;
    public TextField txtName;
    public Button btnSave;


    public void onBtnSaveAction(ActionEvent actionEvent) {
        CustomerService cs = new CustomerService();

        cs.saveCustomer(new Customer(txtId.getText(), txtName.getText()));

    }
}