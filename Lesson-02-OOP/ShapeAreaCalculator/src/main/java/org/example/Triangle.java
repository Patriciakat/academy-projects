package org.example;

public class Triangle extends Shape {

    public Triangle(double side1, double side2) {
        super(side1, side2);
    }

    @Override
    public void areaCalculator() {
        super.calculateRectangleArea();
        double triangleArea = super.getArea() / 2;
        super.setArea(triangleArea);
    }
}
