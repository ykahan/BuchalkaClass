package com.yehoshuakahan;

public class Toyota extends Car {
    private boolean pickupTruck;
    private String load;

    public Toyota(int doors, int wheels, String model, String engine, String color, boolean pickupTruck) {
        super(doors, wheels, model, engine, color);
        this.pickupTruck = pickupTruck;
    }

    public boolean getPickupTruck(){
        return this.pickupTruck;
    }

    public void setLoad(String load){
        if(this.pickupTruck) {
            System.out.println("Loading " + load + " into flatbed");
            this.load = load;
        }
        else System.out.println("Sorry, only a pickup truck can carry a load.");
    }

    public String getLoad(){
        return this.load;
    }
}
