package org.example;

public abstract class Shape {

    private double area;
    private double side1;
    private double side2;

    public Shape(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public abstract void areaCalculator();

    public void calculateRectangleArea() {
        this.area = this.side1 * this.side2;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return (""" 
                Area: %s cm^2.
                """.formatted(area));
    }
}
