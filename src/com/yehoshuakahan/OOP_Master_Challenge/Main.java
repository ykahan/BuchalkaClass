package com.yehoshuakahan.OOP_Master_Challenge;

public class Main {
    public static void main(String[] args) {
        Hamburger burger1 = new Healthy_Burger(new Beef(), new Lettuce(), new Lettuce(), new Onions(), new Onions(),
                new Peppers(), new Tomatoes());

        Hamburger burger2 = new Basic_Burger(new White_Bread(), new Chicken(), new Lettuce(), new Onions(),
                new Peppers(), new Tomatoes());

        System.out.println("burger1 is a Healthy_Burger: " + burger1.isHealthyBurger());
        System.out.println("burger2 is a Healthy_Burger: " + burger2.isHealthyBurger());
    }
}
