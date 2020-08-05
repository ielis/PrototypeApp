package xyz.ielis.modular_unit_testing.core;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import xyz.ielis.modular_unit_testing.io.NameSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    private static NameSource nameSource;

    private Hello hello;

    @BeforeAll
    static void beforeAll() {
        nameSource = new NameSource(List.of("John", "Jane", "Julia"));
    }

    @BeforeEach
    void setUp() {
        hello = new Hello(nameSource);
    }

    @Test
    void greet() {
        final String greet = hello.greet();
        assertEquals("Hi John\nHi Jane\nHi Julia", greet);
    }
}