package com.tutorial.fundamental.caroop;

public class HondaCar extends AbstractCar {
    @Override
    protected void drive() {
        System.out.println("Drive with 100km/h");
    }

    @Override
    protected void reverse() {
        System.out.println("Reverse with 20km/h");
    }
}
