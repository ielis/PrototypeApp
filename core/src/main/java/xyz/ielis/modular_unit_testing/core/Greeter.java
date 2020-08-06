package xyz.ielis.modular_unit_testing.core;

import xyz.ielis.modular_unit_testing.db.NameSource;

import java.util.stream.Collectors;

public class Greeter {

    private final NameSource nameSource;

    public Greeter(NameSource nameSource) {
        this.nameSource = nameSource;
    }

    public String greet() {
        return nameSource.getNames().stream()
                .map(name -> String.format("Hi %s", name))
                .collect(Collectors.joining("\n"));
    }
}
