package net.mytrofanov.java.design_patterns.creational.abstract_factory.buttons.factories;

import net.mytrofanov.java.design_patterns.creational.abstract_factory.buttons.Button;
import net.mytrofanov.java.design_patterns.creational.abstract_factory.buttons.MacOsButton;
import net.mytrofanov.java.design_patterns.creational.abstract_factory.checkboxes.Checkbox;
import net.mytrofanov.java.design_patterns.creational.abstract_factory.checkboxes.MacOsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOsFactory implements AbstractFactory{

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }

}
