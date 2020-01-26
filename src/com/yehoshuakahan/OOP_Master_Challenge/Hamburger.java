package com.yehoshuakahan.OOP_Master_Challenge;

public class Hamburger {
    private Roll roll;
    private Meat meat;
    private Topping topping1;
    private Topping topping2;
    private Topping topping3;
    private Topping topping4;
    private double price;
    private Topping[] toppings;

    public Hamburger(Roll roll, Meat meat, Topping topping1, Topping topping2, Topping topping3, Topping topping4) {
        this.roll = roll;
        this.meat = meat;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.topping4 = topping4;
        this.price = 1.0;
        this.price += this.roll.getPrice();
        this.price += this.meat.getPrice();
        toppings = new Topping[]{topping1, topping2, topping3, topping4};
        for (Topping add : toppings) {
            if (add != null) {
                this.price += add.getPrice();
            }
        }
    }

    public void removeAddition(Topping remove){
        for(int i = 0; i < toppings.length; i++){
                if(toppings[i] == remove){
                    this.price -= toppings[i].getPrice();
                    toppings[i] = null;
                    break;
                }
        }
    }

    public void addAddition(Topping newAdd){
        for(int i = 0; i < toppings.length; i++){
            if(toppings[i] == null){
                toppings[i] = newAdd;
                this.price += toppings[i].getPrice();
                break;
            }
        }
    }

    public boolean canAddTopping(){
        for(int i = 0; i < toppings.length; i++){
            if(toppings[i] == null){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nBasic hamburger on " + this.roll.getName() + " with " +
                this.meat.getName() + " and the following additions:");
        for (Topping topping: toppings) {
            if (topping != null) {
                sb.append("\n" + topping.getName());
            }
        }
        sb.append("\nTotal cost: $" + this.price);

        return sb.toString();
    }
}
