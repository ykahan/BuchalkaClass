package com.yehoshuakahan;

public class Model_T_Ford extends CarV2 {
    private int mph = 0;
    public Model_T_Ford(int cylinders, int doors, int passengers, boolean convertible, boolean gps, String name) {
        super(cylinders, doors, passengers, convertible, gps, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Does a Model T Ford even have an engine?  I thought you just stick your feet " +
                "through the bottom and run.");
    }

    @Override
    public void accelerate(int increase) {
        if(increase > 0 && this.mph + increase < 20){
            System.out.println("Model T Ford accelerating from " + this.mph + " mph to " + increase + " mph.");
            this.mph += increase;
        } else if (increase <= 0) {
            System.out.println("Invalid acceleration.");
        } else{
            System.out.println("Model T Ford can't go that much faster.");
        }
    }

    @Override
    public void brake(int decrease) {
        if(decrease < 0 && this.mph + decrease >= 0){
            System.out.println("Creak, creak, Model T Ford is slowing down.");
            this.mph += decrease;
        } else {
            System.out.println("Invalid deceleration.  Try it again and Model T Ford might break down.");
        }
    }
}
