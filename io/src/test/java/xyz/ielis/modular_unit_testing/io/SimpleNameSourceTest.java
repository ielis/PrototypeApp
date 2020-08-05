package xyz.ielis.modular_unit_testing.io;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SimpleNameSourceTest {

    private SimpleNameSource source;

    @BeforeEach
    void setUp() {
        source = new SimpleNameSource();
    }

    @Test
    void getNames() {
        Collection<String> names = source.getNames();
        String[] strings = names.toArray(new String[]{});
        assertArrayEquals(new String[]{"John", "Jamie", "Jimmy", "Joseph", "Julia", "Joanne", "Jane", "Janet"},
                strings);
    }
}