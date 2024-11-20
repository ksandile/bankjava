module com.jmc {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.jmc to javafx.fxml;
    exports com.jmc.Controllers;
    exports com.jmc.Controllers.Admin;
    exports com.jmc.Controllers.Client;
    exports com.jmc.Models;
    exports com.jmc.Views;
    exports com.jmc;
}
