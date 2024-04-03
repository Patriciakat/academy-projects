package org.example;

public class Square extends Shape {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void areaCalculator() {
        super.calculateRectangleArea();
    }
}
