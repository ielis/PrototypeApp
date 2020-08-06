module xyz.ielis.modular_unit_testing.gui {
    requires xyz.ielis.modular_unit_testing.core;
    requires xyz.ielis.modular_unit_testing.db;

    requires javafx.controls;
    requires javafx.fxml;

    requires spring.context;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    exports xyz.ielis.modular_unit_testing.gui to javafx.graphics, spring.context;
    opens xyz.ielis.modular_unit_testing.gui to spring.core, spring.beans;

    exports xyz.ielis.modular_unit_testing.gui.controller to javafx.fxml;
    opens xyz.ielis.modular_unit_testing.gui.controller to javafx.fxml, spring.beans;
}