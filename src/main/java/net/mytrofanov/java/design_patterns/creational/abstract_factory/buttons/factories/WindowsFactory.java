package net.mytrofanov.java.design_patterns.creational.abstract_factory.buttons.factories;

import net.mytrofanov.java.design_patterns.creational.abstract_factory.buttons.Button;
import net.mytrofanov.java.design_patterns.creational.abstract_factory.buttons.WindowsButton;
import net.mytrofanov.java.design_patterns.creational.abstract_factory.checkboxes.Checkbox;
import net.mytrofanov.java.design_patterns.creational.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

}
