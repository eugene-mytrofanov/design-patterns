package net.mytrofanov.java.design_patterns.creational.abstract_factory;

import net.mytrofanov.java.design_patterns.creational.abstract_factory.buttons.factories.AbstractFactory;
import net.mytrofanov.java.design_patterns.creational.abstract_factory.buttons.factories.MacOsFactory;
import net.mytrofanov.java.design_patterns.creational.abstract_factory.buttons.factories.WindowsFactory;

public class Demo {

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        AbstractFactory factory;
        String osName = System.getProperty("os.name")
                              .toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOsFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

}
