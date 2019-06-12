package com.yehoshuakahan;

import jdk.swing.interop.SwingInterOpUtils;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight,
               int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog chews and chews, munch munch munch");
    }

    @Override
    public void eat() {
        System.out.println("Doggie loves to eat.  Yum!");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Doggy takes a walk");
        super.move(6);
    }

    public void run(){
        System.out.println("Doggy runs");
        move(12);
    }

    private void moveLegs(int speed){
        System.out.println("Dog moves legs at " + speed + " mph");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
