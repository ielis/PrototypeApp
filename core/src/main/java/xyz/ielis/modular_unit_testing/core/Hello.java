package xyz.ielis.modular_unit_testing.core;

import xyz.ielis.modular_unit_testing.io.NameSource;

import java.util.stream.Collectors;

public class Hello {

    private final NameSource nameSource;

    public Hello(NameSource nameSource) {
        this.nameSource = nameSource;
    }

    public String greet() {
        return nameSource.getNames().stream()
                .map(name -> String.format("Hi %s", name))
                .collect(Collectors.joining("\n"));
    }
}
