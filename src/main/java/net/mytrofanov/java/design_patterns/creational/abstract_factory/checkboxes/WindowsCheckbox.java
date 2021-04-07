package net.mytrofanov.java.design_patterns.creational.abstract_factory.checkboxes;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Windows checkbox is created");
    }

}
