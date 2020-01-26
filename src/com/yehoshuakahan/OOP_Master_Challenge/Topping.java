package com.yehoshuakahan.OOP_Master_Challenge;

public class Topping {
    private double price;
    private String name;

    public Topping(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
