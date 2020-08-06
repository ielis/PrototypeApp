package xyz.ielis.prototype.gui;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xyz.ielis.prototype.core.Greeter;
import xyz.ielis.prototype.model.FileNameSource;
import xyz.ielis.prototype.model.NameSource;

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
