package net.mytrofanov.java.design_patterns.creational.factory.java8;

import net.mytrofanov.java.design_patterns.creational.factory.Circle;
import net.mytrofanov.java.design_patterns.creational.factory.Rectangle;
import net.mytrofanov.java.design_patterns.creational.factory.Shape;
import net.mytrofanov.java.design_patterns.creational.factory.Square;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ShapeFactory {

    static final Map<String, Supplier<Shape>> map = new HashMap<>();

    static {
        map.put("CIRCLE", Circle::new);
        map.put("RECTANGLE", Rectangle::new);
        map.put("SQUARE", Square::new);
    }

    public Shape getShape(String shapeType) {
        Supplier<Shape> shape = map.get(shapeType.toUpperCase());
        if (shape != null) {
            return shape.get();
        }
        throw new IllegalArgumentException("No such shape " + shapeType.toUpperCase());
    }
}
