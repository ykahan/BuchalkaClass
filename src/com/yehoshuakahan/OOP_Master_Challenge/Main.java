package com.yehoshuakahan.OOP_Master_Challenge;

public class Main {
    public static void main(String[] args) {
        Hamburger burger = new Hamburger(new Whole_Wheat(), new Beef(), new Onions(), new Onions(), null, null);
        System.out.println(burger.toString());
        burger.switchBread(new White_Bread());
        System.out.println(burger.toString());
        burger.switchMeat(new Turkey());
        System.out.println(burger.toString());
        burger.removeTopping(new Onions());
        System.out.println(burger.toString());
        burger.addTopping(new Peppers());
        System.out.println(burger.toString());
    }
}
