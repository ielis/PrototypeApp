package xyz.ielis.prototype.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FileNameSource implements NameSource {

    private final List<String> names = new ArrayList<>();

    public FileNameSource(Collection<String> names) {
        this.names.addAll(names);
    }

    public FileNameSource() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(FileNameSource.class.getResourceAsStream("names.txt")))) {
            reader.lines().forEach(names::add);
        } catch (IOException e) {
            // swallow
        }
    }

    @Override
    public Collection<String> getNames() {
        return List.copyOf(names);
    }
}
