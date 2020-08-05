package xyz.ielis.modular_unit_testing.io;

import java.util.Collection;
import java.util.List;

public class SimpleNameSource implements NameSource {

    private final Collection<String> names;

    public SimpleNameSource(Collection<String> names) {
        this.names = names;
    }

    @Override
    public Collection<String> getNames() {
        return List.copyOf(names);
    }
}
