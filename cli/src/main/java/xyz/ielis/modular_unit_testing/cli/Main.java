package xyz.ielis.modular_unit_testing.cli;

import xyz.ielis.modular_unit_testing.core.Greeter;
import xyz.ielis.modular_unit_testing.db.NameSource;
import xyz.ielis.modular_unit_testing.db.FileNameSource;

public class Main {

    public static void main(String[] args) {
        NameSource nameSource = new FileNameSource();
        Greeter greeter = new Greeter(nameSource);
        System.out.println(greeter.greet());
    }
}
