package xyz.ielis.modular_unit_testing.gui;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xyz.ielis.modular_unit_testing.core.Greeter;
import xyz.ielis.modular_unit_testing.db.FileNameSource;
import xyz.ielis.modular_unit_testing.db.NameSource;

@Configuration
public class AppConfiguration {

    @Bean
    public Greeter greeter(NameSource nameSource) {
        return new Greeter(nameSource);
    }

    @Bean
    public NameSource nameSource() {
        return new FileNameSource();
    }
}
