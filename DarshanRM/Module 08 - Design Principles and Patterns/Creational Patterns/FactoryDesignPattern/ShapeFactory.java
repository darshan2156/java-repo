package org.darshan.CollectionsPractise.FactoryDesignPattern;

public class ShapeFactory {
    public static Shape getShapeObject(String shape) {
        shape = shape.toLowerCase();
        return switch (shape) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            case "rectangle" -> new Rectangle();
            default -> null;
        };
    }
}
