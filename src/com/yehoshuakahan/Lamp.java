package com.yehoshuakahan;

public class Lamp {
    private int wattage;
    private boolean filament;


    public Lamp(int wattage, boolean filament) {
        this.wattage = wattage;
        this.filament = filament;
    }

    public int getWattage() {
        return wattage;
    }

    public boolean isFilament() {
        return filament;
    }

    public void turnOn(){
        System.out.println("Turning on the lamp...");
    }

    public void turnOff(){
        System.out.println("Turning off the lamp...");
    }

}
