package com.tutorial.fundamental.variables;

public class Computer {

    private String cpu;
    private int ram;
    private String vga;

    public Computer() {}

    public Computer(String cpu, int ram, String vga) {
        this.cpu = cpu;
        this.ram = ram;
        this.vga = vga;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getVga() {
        return vga;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", vga='" + vga + '\'' +
                '}';
    }

}
