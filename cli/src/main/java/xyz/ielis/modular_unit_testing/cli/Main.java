package xyz.ielis.modular_unit_testing.cli;

import xyz.ielis.modular_unit_testing.core.Hello;
import xyz.ielis.modular_unit_testing.io.NameSource;
import xyz.ielis.modular_unit_testing.io.SimpleNameSource;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        NameSource nameSource = new SimpleNameSource(Arrays.asList(args));
        Hello hello = new Hello(nameSource);
        System.out.println(hello.greet());
    }
}
