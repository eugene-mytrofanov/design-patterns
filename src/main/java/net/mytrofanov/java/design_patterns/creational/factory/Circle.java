package net.mytrofanov.java.design_patterns.creational.factory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing inside Circle");
    }
}
