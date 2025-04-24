package org.darshan.CollectionsPractise.FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShapeObject("circle");
        if(shape != null) shape.drawShape();

        shape = ShapeFactory.getShapeObject("square");
        if(shape != null) shape.drawShape();

        shape = ShapeFactory.getShapeObject("rectangle");
        if(shape != null) shape.drawShape();

        shape = ShapeFactory.getShapeObject("cube");
        if(shape != null) shape.drawShape();
        else System.out.println("Shape can not be created.");
    }
}
