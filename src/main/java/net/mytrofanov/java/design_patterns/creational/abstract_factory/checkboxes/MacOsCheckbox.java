package net.mytrofanov.java.design_patterns.creational.abstract_factory.checkboxes;

public class MacOsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("The MacOsCheckbox has been created");
    }

}
