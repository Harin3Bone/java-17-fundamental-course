package com.tutorial.fundamental.caroop;

public abstract class AbstractCar {

    private String engine;
    private String breaks;
    private String tires;

    protected abstract void drive();

    protected abstract void reverse();

    protected void stop() {
        System.out.println("Stop");
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getBreaks() {
        return breaks;
    }

    public void setBreaks(String breaks) {
        this.breaks = breaks;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }
}
