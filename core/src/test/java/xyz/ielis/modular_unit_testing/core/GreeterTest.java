package xyz.ielis.modular_unit_testing.core;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import xyz.ielis.modular_unit_testing.db.NameSource;
import xyz.ielis.modular_unit_testing.db.FileNameSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {

    private static NameSource NAME_SOURCE;

    private Greeter greeter;

    @BeforeAll
    static void beforeAll() {
        NAME_SOURCE = new FileNameSource(List.of("John", "Jane", "Julia"));
    }

    @BeforeEach
    void setUp() {
        greeter = new Greeter(NAME_SOURCE);
    }

    @Test
    void greet() {
        final String greet = greeter.greet();
        assertEquals("Hi John\nHi Jane\nHi Julia", greet);
    }
}