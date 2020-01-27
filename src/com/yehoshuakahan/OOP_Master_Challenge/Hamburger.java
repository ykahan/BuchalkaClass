package com.yehoshuakahan.OOP_Master_Challenge;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Hamburger {
    private Roll roll;
    private Meat meat;
    private Topping topping1;
    private Topping topping2;
    private Topping topping3;
    private Topping topping4;
    private double price;
    private Topping[] toppings;
    private Side[] sides;
    private int maxToppings;
    private int maxSides;

    public Hamburger(Roll roll, Meat meat, Topping[] toppings, Side[] sides, int maxToppings, int maxSides, double price){
        this.roll = roll;
        this.meat = meat;
        this.price = price;
        this.maxToppings = maxToppings;
        this.maxSides = maxSides;
        this.price += this.roll.getPrice();
        this.price += this.meat.getPrice();
        for (Topping topping : toppings) {
            if (topping != null) {
                this.price += topping.getPrice();
            }
        }
        for(Side side: sides){
            if(side != null){
                this.price += side.getPrice();
            }
        }
    }

    public void switchMeat(Meat newMeat){
        this.price -= this.meat.getPrice();
        this.price += newMeat.getPrice();
        this.meat = newMeat;
    }

    public void switchBread(Roll newRoll){
        this.price -= this.roll.getPrice();
        this.price += newRoll.getPrice();
        this.roll = newRoll;
    }

    private void removeTopping(Topping toppingToRemove){
        if(!canRemoveTopping()) return;
        for(Topping topping: toppings){
            if (topping.getClass() == toppingToRemove.getClass()) {
                this.price -= topping.getPrice();
                topping = null;
                break;
            }
        }
    }

    public boolean isHealthyBurger(){
        return this instanceof Healthy_Burger;
    }

    private void addTopping(Topping toppingToAdd){
        if(!canAddTopping() || isHealthyBurger()) return;
        for(Topping topping: toppings){
            if (topping == null){
                topping = toppingToAdd;
                this.price += topping.getPrice();
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

    private boolean canRemoveTopping(){
        for(Topping topping: toppings){
            if(topping != null){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String displayPrice = formatter.format(this.price);
        StringBuilder sb = new StringBuilder();
        sb.append("\nBasic hamburger on ");
        sb.append(this.roll.getName());
        sb.append(" with ");
        sb.append(this.meat.getName());
        sb.append(" and the following toppings:");
        for (Topping topping: toppings) {
            if (topping != null) {
                sb.append("\n");
                sb.append(topping.getName());
            }
        }
        sb.append("\nTotal cost: ");
        sb.append(displayPrice);

        return sb.toString();
    }
}
