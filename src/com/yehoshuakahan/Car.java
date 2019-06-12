package com.yehoshuakahan;

public class Car extends Vehicle {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
    private int gear;
    private String direction;
    private int speed;

    public Car() {
    }


    public Car(int doors, int wheels, String model, String engine, String color) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.color = color;
        int parked = 0;
        this.gear = parked;
        this.direction = "straight";
        this.speed = 0;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed(int x){
        if(this.speed + x >= 0 && this.speed + x <= 100){
            this.speed += x;
        }
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        model = model.toLowerCase();

        if (model.equals("carrera") || model.equals("commodore")) this.model = model;
        else this.model = "unknown model";
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void drive() {
        System.out.println("Car.drive() invoked");
        super.move();
    }

    public void shiftGear(int x) {
        int oldGear = this.gear;
        if (gear < 0 || gear > 4) System.out.println("That is not a valid gear");
        else if (this.gear != x) {
            System.out.println("Now switching from gear " + this.gear + " to gear " + x);
            this.gear = x;
        } else System.out.println("Car already in gear " + x);
        if (this.gear == 0) {
            System.out.println("Coming to a stop.");
            int currentSpeed = getSpeed();
            currentSpeed *= -1;
            accelerate(currentSpeed);
        }

        if(oldGear == 0 && this.gear != 0 && this.speed != 0) drive();
    }


    public void turn(String direction) {
        direction = direction.toLowerCase();
        if (direction == "straight" || direction == "right" || direction == "left") {
            System.out.println("Now turning steering wheel to the " + direction + " position");
            this.direction = direction;
        }
        else System.out.println("That is not a valid position for the steering wheel.");
    }

    public void accelerate(int change){
        if(this.speed + change >= 0 && this.speed + change <= 100){
            setSpeed(change);
        }
    }
}
