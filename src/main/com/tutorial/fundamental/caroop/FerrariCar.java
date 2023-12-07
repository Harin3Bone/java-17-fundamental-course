package com.tutorial.fundamental.caroop;

public class FerrariCar extends AbstractCar {
    @Override
    protected void drive() {
        System.out.println("Drive with 300km/h");
    }

    @Override
    protected void reverse() {
        System.out.println("Reverse with 100km/h");
    }
}
