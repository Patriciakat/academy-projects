package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape {


    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    public void areaCalculator() {

        super.calculateRectangleArea();
        double circleArea = super.getArea() * Math.PI;
        BigDecimal roundedCircleArea = new BigDecimal(circleArea);
        roundedCircleArea = roundedCircleArea.setScale(2, RoundingMode.UP);
        super.setArea(roundedCircleArea.doubleValue());
    }
}
