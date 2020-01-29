package com.yehoshuakahan.OOP_Master_Challenge;

public class Main {
    public static void main(String[] args) {
//        Lettuce pepper = new Lettuce();
//        System.out.println(pepper.getName());
//        System.out.println(pepper.getPrice());

        Deluxe_Burger deluxe = new Deluxe_Burger(
                new White_Bread(),
                new Beef(),
                new Peppers(),
                new Peppers(),
                new Lettuce(),
                null);
        Healthy_Burger healthy = new Healthy_Burger(
                new Chicken(),
                new Onions(),
                new Tomatoes(),
                new Peppers(),
                new Lettuce(),
                new Onion_Rings(),
                new Onion_Rings());
        Hamburger regular = new Basic_Burger(
                new Whole_Wheat(),
                new Turkey(),
                new Peppers(),
                null,
                new Tomatoes(),
                null);
//
//        System.out.println(deluxe.toString());
////        System.out.println(healthy.toString());
////        System.out.println(regular.toString());
//
//        deluxe.switchMeat(new Chicken());
//        System.out.println(deluxe.toString());
//
//        deluxe.switchMeat(new Turkey());
//        System.out.println(deluxe.toString());
//
//        deluxe.addTopping(new Lettuce());
//        System.out.println(deluxe.toString());
//
//        deluxe.removeTopping(new Lettuce());
//        System.out.println(deluxe.toString());

        System.out.println(healthy.toString());

        healthy.removeSide(new Onion_Rings());
        healthy.addSide(new Drink());
        healthy.addSide(new French_Fries());
        healthy.addSide(new Drink());
        System.out.println(healthy.toString());
    }
}
