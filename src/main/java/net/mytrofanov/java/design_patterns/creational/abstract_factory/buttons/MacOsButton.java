package net.mytrofanov.java.design_patterns.creational.abstract_factory.buttons;

public class MacOsButton implements Button {

    @Override
    public void paint() {
        System.out.println("MacOsButton has been created");
    }

}
