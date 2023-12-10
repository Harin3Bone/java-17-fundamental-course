package com.tutorial.fundamental.caroop;

import com.tutorial.fundamental.animaloop.Animal;

public class Toyota extends Car implements CarInterface, TruckInterface {

    public void setCustomEngine() {
        super.setEngine("V8");
    }

    @Override
    public void drive() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void reverse() {

    }
}
