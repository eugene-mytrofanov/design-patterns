package net.mytrofanov.java.design_patterns.creational.abstract_factory.buttons.factories;

import net.mytrofanov.java.design_patterns.creational.abstract_factory.buttons.Button;
import net.mytrofanov.java.design_patterns.creational.abstract_factory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */

public interface AbstractFactory {
    Button createButton();
    Checkbox createCheckbox();
}
