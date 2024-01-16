package com.jmc.GreenVault.Controllers.Admin;

import com.jmc.GreenVault.Models.Client;
import com.jmc.GreenVault.Models.Model;
import com.jmc.GreenVault.Views.ClientCellFactory;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientsController implements Initializable {
    public ListView<Client> clients_listview;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initClientsList();
        clients_listview.setItems(Model.getInstance().getClients());
        clients_listview.setCellFactory(e -> new ClientCellFactory());                    //specifies that the ClientCellFactory should be used to create custom cells for each item in the list
    }

    private void initClientsList() {
        if (Model.getInstance().getClients().isEmpty()){     //this method is likely used to ensure that the client list is populated when the view is first loaded
            Model.getInstance().setClients();
        }
    }
}
