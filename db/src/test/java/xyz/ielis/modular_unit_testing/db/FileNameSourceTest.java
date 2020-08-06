package xyz.ielis.modular_unit_testing.db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;

class FileNameSourceTest {

    private FileNameSource source;

    @BeforeEach
    void setUp() {
        source = new FileNameSource();
    }

    @Test
    void getNames() {
        Collection<String> names = source.getNames();
        assertThat(names, hasSize(8));
        assertThat(names, hasItems("John", "Jamie", "Jimmy", "Joseph", "Julia", "Joanne", "Jane", "Janet"));
    }
}