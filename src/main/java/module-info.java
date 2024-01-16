module com.jmc.mazebank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.jmc.GreenVault to javafx.fxml;
    exports com.jmc.GreenVault;
    exports com.jmc.GreenVault.Controllers;
    exports com.jmc.GreenVault.Controllers.Admin;
    exports com.jmc.GreenVault.Controllers.Client;
    exports com.jmc.GreenVault.Models;
    exports com.jmc.GreenVault.Views;
}