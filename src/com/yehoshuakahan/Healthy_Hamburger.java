package com.yehoshuakahan;

public class Healthy_Hamburger extends Hamburger {

    public Healthy_Hamburger(int additionsAllowed) {
        super();
        this.toppings = new Extra[6];
        this.bread = Bread.WHOLE_WHEAT_ROLL;
        this.price += Double.valueOf(breadPrices.get(this.bread));
    }

    @Override
    public void setBread(Bread newBread) {
        System.out.println("Healthy Burgers can only be made with Whole Wheat Rolls.");
    }
}
