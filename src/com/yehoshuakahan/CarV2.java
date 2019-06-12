package com.yehoshuakahan;

public class CarV2 {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int doors;
    private int passengers;
    private boolean convertible;
    private boolean gps;
    private String name;
    private int mph = 0;

    public CarV2(int cylinders, int doors, int passengers, boolean convertible, boolean gps, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = doors;
        this.passengers = passengers;
        this.convertible = convertible;
        this.gps = gps;
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getPassengers() {
        return passengers;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public boolean isGps() {
        return gps;
    }

    public String getName() {
        return name;
    }

    public int getMph(){
        return this.mph;
    }

    public void startEngine(){
        if(this.engine) System.out.println("The engine is starting");
        else System.out.println("There is no engine to start.");
    }

    public void accelerate(int increase){
        if(increase > 0) {
            this.mph += increase;
            System.out.println("Accelerating by " + increase + " mph to a speed of " + this.mph + " mph.");
        } else{
            System.out.println("Invalid acceleration--acceleration must be positive.");
        }
    }

    public void brake(int decrease){
        if(decrease < 0 && this.mph + decrease >= 0){
            this.mph += decrease;
            System.out.println("Decelerating by " + decrease + " mph to a speed of " + this.mph + " mph.");
        } else{
            System.out.println("Invalid deceleration.");
        }
    }
}
