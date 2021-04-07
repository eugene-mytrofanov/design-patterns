package net.mytrofanov.java.design_patterns.creational.abstract_factory.buttons;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("The Windows Button is created");
    }

}
