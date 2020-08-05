package xyz.ielis.modular_unit_testing.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleNameSource implements NameSource {

    private final Collection<String> names;

    public SimpleNameSource(Collection<String> names) {
        this.names = names;
    }

    public SimpleNameSource() {
        Collection<String> names1;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(SimpleNameSource.class.getResourceAsStream("names.txt")))) {
            names1 = reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            names1 = List.of();
        }

        names = names1;
    }

    @Override
    public Collection<String> getNames() {
        return List.copyOf(names);
    }
}
