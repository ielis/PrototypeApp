package xyz.ielis.modular_unit_testing.gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import xyz.ielis.modular_unit_testing.gui.controller.MainController;

@SpringBootApplication
public class Main extends Application {

    private ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }

    @Override
    public void init() throws Exception {
        final String[] args = getParameters().getRaw().toArray(new String[]{});
        ctx = new SpringApplicationBuilder()
                .sources(Main.class)
                .run(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        final FXMLLoader loader = new FXMLLoader(MainController.class.getResource("Main.fxml"));

        loader.setControllerFactory(ctx::getBean);

        final Parent parent = loader.load();
        stage.setScene(new Scene(parent));
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        ctx.stop();
        Platform.exit();
    }
}
