module xyz.ielis.prototype.gui {
    requires xyz.ielis.prototype.core;
    requires xyz.ielis.prototype.model;

    requires javafx.controls;
    requires javafx.fxml;

    requires spring.context;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    exports xyz.ielis.prototype.gui to javafx.graphics, spring.context;
    opens xyz.ielis.prototype.gui to spring.core, spring.beans;

    exports xyz.ielis.prototype.gui.controller to javafx.fxml;
    opens xyz.ielis.prototype.gui.controller to javafx.fxml, spring.beans;
}