package com.jmc.GreenVault.Controllers.Admin;

import com.jmc.GreenVault.Models.Client;
import com.jmc.GreenVault.Models.DatabaseDriver;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientCellController implements Initializable {
    public Label fName_lbl;
    public Label lName_lbl;
    public Label pAddress_lbl;
    public Label ch_acc_lbl;
    public Label sv_acc_lbl;
    public Label date_lbl;

    private final Client client;                                              //variable cannot be reassigned once it has been initialized
    private final DatabaseDriver databaseDriver = new DatabaseDriver();
    public ClientCellController(Client client) {
        this.client = client;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fName_lbl.textProperty().bind(client.firstNameProperty());
        lName_lbl.textProperty().bind(client.lastNameProperty());
        pAddress_lbl.textProperty().bind(client.pAddressProperty());
        ch_acc_lbl.textProperty().bind(client.checkingAccountProperty().asString());
        sv_acc_lbl.textProperty().bind(client.savingsAccountProperty().asString());
        date_lbl.textProperty().bind(client.dateProperty().asString());
    }
}
/*This approach of using property bindings is a common
pattern in JavaFX. It ensures that the UI components automatically
update when the underlying data model changes.*/