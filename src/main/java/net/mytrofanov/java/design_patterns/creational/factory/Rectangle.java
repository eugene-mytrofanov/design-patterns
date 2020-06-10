package net.mytrofanov.java.design_patterns.creational.factory;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing inside Rectangle");
    }
}
