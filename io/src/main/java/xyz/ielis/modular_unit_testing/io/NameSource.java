package xyz.ielis.modular_unit_testing.io;

import java.util.Collection;
import java.util.List;

public class NameSource {

    private final Collection<String> names;

    public NameSource(Collection<String> names) {
        this.names = names;
    }

    public Collection<String> getNames() {
        return List.copyOf(names);
    }
}
