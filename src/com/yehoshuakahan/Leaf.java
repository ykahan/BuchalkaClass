package com.yehoshuakahan;

public class Leaf extends CarV2 {
    private int mph = 0;

    public Leaf(int cylinders, int doors, int passengers, boolean convertible, boolean gps, String name) {
        super(cylinders, doors, passengers, convertible, gps, name);
    }

    @Override
    public void startEngine() {
        System.out.println("The Leaf will try to find it's engine...");
    }

    @Override
    public void accelerate(int increase) {
        if (increase > 0) {
            this.mph += increase;
            System.out.println("Ok, Leaf is going faster by " + increase + " mph.");
            System.out.println("Leaf is now going at " + this.mph + " mph.");
        } else {
            System.out.println("Invalid acceleration");
        }
    }

    @Override
    public void brake(int decrease) {
        if (decrease < 0 && this.mph + decrease >= 0) {
            this.mph += decrease;
            System.out.println("Leaf going slower now by " + (-1 * decrease) + " mph.");
        } else if (decrease >= 0) {
            System.out.println("Invalid deceleration.");
        } else {
            System.out.println("Leaf can't go that much slower.");
        }
    }
}
