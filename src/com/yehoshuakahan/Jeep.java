package com.yehoshuakahan;

public class Jeep extends CarV2 {
    private int mph = 0;

    public Jeep(int cylinders, int doors, int passengers, boolean convertible, boolean gps, String name) {
        super(cylinders, doors, passengers, convertible, gps, name);
    }


    @Override
    public void startEngine() {
        System.out.println("Jeep engines starts!");
    }

    @Override
    public void accelerate(int increase) {
        if(increase > 0) {
            this.mph += increase;
            System.out.println("Jeep's going faster!");
        }
    }

    @Override
    public void brake(int decrease) {
        if(decrease < 0 && (this.mph + decrease >= 0)){
            this.mph += decrease;
            System.out.println("Jeep's going slower now.");
        } else{
            System.out.println("Jeep says no.");
        }
    }
}
