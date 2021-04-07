package net.mytrofanov.java.design_patterns.creational.abstract_factory;

import net.mytrofanov.java.design_patterns.creational.abstract_factory.buttons.Button;
import net.mytrofanov.java.design_patterns.creational.abstract_factory.buttons.factories.AbstractFactory;
import net.mytrofanov.java.design_patterns.creational.abstract_factory.checkboxes.Checkbox;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(AbstractFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
