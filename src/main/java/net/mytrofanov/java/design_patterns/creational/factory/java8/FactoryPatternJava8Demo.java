package net.mytrofanov.java.design_patterns.creational.factory.java8;

import net.mytrofanov.java.design_patterns.creational.factory.Shape;

public class FactoryPatternJava8Demo {
    public static void main(String[] args) {
        ShapeFactory shapeFactoryJava8 = new ShapeFactory();

        Shape shape1 = shapeFactoryJava8.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactoryJava8.getShape("rectangle");
        shape2.draw();

        Shape shape3 = shapeFactoryJava8.getShape("square");
        shape3.draw();
    }

}
