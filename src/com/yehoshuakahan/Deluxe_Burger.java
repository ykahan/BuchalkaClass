package com.yehoshuakahan;

public class Deluxe_Burger extends Hamburger {
    public Deluxe_Burger() {
        super();
        this.basePrice = 5.99;
        this.price = this.basePrice;
    }

    @Override
    public String toString() {
        String output = "This Deluxe Burger comes with french fries and soda.\n";
        output += super.toString();
        return output;
    }
}
