package com.yehoshuakahan;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class Hamburger {
    protected Bread bread = null;
    protected double basePrice = 3.99;
    protected double price = basePrice;
    protected Extra[] toppings;
    protected Meat meat = null;

    public enum Extra {
        CARROT, ONION, SAUERKRAUT, MUSHROOM, PICKLE, TOMATO, RED_PEPPER, KETCHUP,
        HOT_PEPPER, LETTUCE
    }

    public enum Bread {WHITE_ROLL, WHOLE_WHEAT_ROLL, SESAME_ROLL, BARLEY_ROLL, CORN_ROLL}

    public enum Meat {REG_GROUND_BEEF, TURKEY, EXTRA_LEAN_BEEF, UNICORN_MEAT}

    protected Map<Extra, String> extraPrices;
    protected Map<Bread, String> breadPrices;
    protected Map<Meat, String> meatPrices;

    public Hamburger() {
        Extra[] toppings = new Extra[4];
        this.toppings = toppings;

        initializeExtrasPriceMapping();
        initializeBreadPricesMapping();
        initializeMeatPricesMapping();
    }

    private void initializeMeatPricesMapping() {
        meatPrices = new HashMap<>();
        meatPrices.put(Meat.REG_GROUND_BEEF, "0.00");
        meatPrices.put(Meat.TURKEY, "1.50");
        meatPrices.put(Meat.EXTRA_LEAN_BEEF, "2.00");
        meatPrices.put(Meat.UNICORN_MEAT, "100.00");
    }

    private void initializeBreadPricesMapping() {
        breadPrices = new HashMap<>();
        breadPrices.put(Bread.BARLEY_ROLL, "1.00");
        breadPrices.put(Bread.CORN_ROLL, "1.20");
        breadPrices.put(Bread.SESAME_ROLL, "1.40");
        breadPrices.put(Bread.WHOLE_WHEAT_ROLL, "1.60");
        breadPrices.put(Bread.WHITE_ROLL, "0.00");
    }

    private void initializeExtrasPriceMapping() {
        extraPrices = new HashMap<>();
        extraPrices.put(Extra.CARROT, "0.75");
        extraPrices.put(Extra.KETCHUP, "0.24");
        extraPrices.put(Extra.HOT_PEPPER, "0.36");
        extraPrices.put(Extra.LETTUCE, "0.52");
        extraPrices.put(Extra.MUSHROOM, "0.64");
        extraPrices.put(Extra.ONION, "0.38");
        extraPrices.put(Extra.PICKLE, "0.42");
        extraPrices.put(Extra.RED_PEPPER, "0.51");
        extraPrices.put(Extra.SAUERKRAUT, "0.73");
        extraPrices.put(Extra.TOMATO, "0.34");
    }

    public void addTopping(Extra extra) {
        int length = toppings.length;
        for (int i = 0; i < length; i++) {
            if (toppings[i] == null) {
                toppings[i] = extra;
                this.price += Double.valueOf(extraPrices.get(extra));
                return;
            }
        }
        System.out.println("No more than " + this.toppings.length + " toppings permitted.");
    }

    public void removeTopping(Extra extra) {
        int length = toppings.length;
        for (int i = 0; i < length; i++) {
            if (toppings[i].equals(extra)) {
                toppings[i] = null;
                this.price -= Double.valueOf(extraPrices.get(extra));
                return;
            }
        }
        System.out.println(extra.toString() + " not found.");
    }

    public void setBread(Bread newBread) {
        removeOldBreadPrice(this.bread);
        this.bread = newBread;
        addNewBreadPrice(newBread);
    }

    public void setMeat(Meat newMeat) {
        removeOldMeatPrice(this.meat);
        this.meat = newMeat;
        addNewMeatPrice(newMeat);
    }

    private void removeOldMeatPrice(Meat oldMeat) {
        if (oldMeat != null) this.price -= Double.valueOf(meatPrices.get(oldMeat));
    }

    private void addNewMeatPrice(Meat newMeat) {
        if (newMeat != null) this.price += Double.valueOf(meatPrices.get(newMeat));
    }

    private void removeOldBreadPrice(Bread oldBread) {
        if (oldBread != null) {
            this.price -= Double.valueOf(breadPrices.get(oldBread));
        }
    }

    private void addNewBreadPrice(Bread newBread) {
        if(newBread != null){
            this.price += Double.valueOf(breadPrices.get(newBread));
        }
    }

    public Bread getBread() {
        return bread;
    }

    public Meat getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getPrice() {
        return price;
    }

    public Extra[] getToppings() {
        return toppings;
    }

    public void printString(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getBasePriceString());
        sb.append(getMeatString());
        sb.append(getBreadString());
        sb.append(getExtrasString());
        sb.append(getFinalPriceString());
        return sb.toString();
    }

    public String getExtrasString() {
        int length = toppings.length;
        StringBuilder toppingsList = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (toppings[i] != null) {
                toppingsList.append(toppings[i].toString() + ": $" + extraPrices.get(toppings[i]));
                toppingsList.append("\n");
            }
        }
        return toppingsList.toString();
    }

    public String getBreadString() {
        Bread bread = getBread();
        StringBuilder sb = new StringBuilder();
        sb.append(bread.toString() + ": $" + breadPrices.get(bread) + "\n");
        return sb.toString();
    }

    public String getMeatString() {
        Meat meat = getMeat();
        StringBuilder sb = new StringBuilder();
        sb.append(meat.toString() + ": $" + meatPrices.get(meat) + "\n");
        return sb.toString();
    }

    public String getBasePriceString() {
        String price = "Base Price: $";
        price += this.basePrice + "\n";
        return price;
    }

    public String getFinalPriceString() {
        double price = this.price;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return "Final Price: " + formatter.format(price);}
}
