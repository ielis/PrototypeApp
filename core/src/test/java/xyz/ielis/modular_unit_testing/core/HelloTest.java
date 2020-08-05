package xyz.ielis.modular_unit_testing.core;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import xyz.ielis.modular_unit_testing.io.NameSource;
import xyz.ielis.modular_unit_testing.io.SimpleNameSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    private static NameSource NAME_SOURCE;

    private Hello hello;

    @BeforeAll
    static void beforeAll() {
        NAME_SOURCE = new SimpleNameSource(List.of("John", "Jane", "Julia"));
    }

    @BeforeEach
    void setUp() {
        hello = new Hello(NAME_SOURCE);
    }

    @Test
    void greet() {
        final String greet = hello.greet();
        assertEquals("Hi John\nHi Jane\nHi Julia", greet);
    }
}