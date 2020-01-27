package com.yehoshuakahan.OOP_Master_Challenge;

public class Side {
    private double price;
    private String name;

    public Side(double price, String name) {
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
