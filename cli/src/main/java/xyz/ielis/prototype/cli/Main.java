package xyz.ielis.prototype.cli;

import xyz.ielis.prototype.core.Greeter;
import xyz.ielis.prototype.model.NameSource;
import xyz.ielis.prototype.model.FileNameSource;

public class Main {

    public static void main(String[] args) {
        NameSource nameSource = new FileNameSource();
        Greeter greeter = new Greeter(nameSource);
        System.out.println(greeter.greet());
    }
}
