package com.tutorial.fundamental.solid;

public class AreaCalcService {

    @Deprecated
    public double calculateCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircleV2(double side) {
        return Math.pow(side, 2);
    }

    public double calculateTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public double calculateRectangle(double length, double width) {
        return length * width;
    }
}
