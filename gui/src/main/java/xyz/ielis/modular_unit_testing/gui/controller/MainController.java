package xyz.ielis.modular_unit_testing.gui.controller;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import org.springframework.stereotype.Component;
import xyz.ielis.modular_unit_testing.core.Greeter;

@Component
public class MainController {

    private final Greeter greeter;

    public MenuItem closeMenuItem;

    public Label greeterLabel;

    public MainController(Greeter greeter) {
        this.greeter = greeter;
    }

    public void closeMenuItemAction() {
        Platform.exit();
    }

    public void initialize() {
        greeterLabel.setText(greeter.greet());
    }
}
