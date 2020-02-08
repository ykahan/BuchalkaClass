package OOP_Master_Challenge;

import java.text.NumberFormat;

public class Hamburger {
    private Roll roll;
    private Meat meat;
    private double totalPrice;
    private double basePrice;
    private Toppings toppings;
    private String baseName;

    public Hamburger(Roll roll,
                     Meat meat,
                     Topping topping1,
                     Topping topping2,
                     Topping topping3,
                     Topping topping4,
                     double basePrice,
                     String baseName) {
        this.roll = roll;
        this.meat = meat;
        this.toppings = new Toppings(new Topping[]{topping1, topping2, topping3, topping4});
        this.basePrice = basePrice;
        this.totalPrice = 0.0;
        this.baseName = baseName;
    }

    public void switchMeat(Meat newMeat) {
        this.meat = newMeat;
        setTotalPrice();
    }

    public void switchBread(Roll newRoll) {
        this.roll = newRoll;
        setTotalPrice();
    }

    public void setTotalPrice() {
        setTotalPrice(0.0);
    }

    public void setTotalPrice(double toAdd) {
        this.totalPrice = this.basePrice;
        this.totalPrice += this.roll.getPrice();
        this.totalPrice += this.meat.getPrice();
        this.totalPrice += this.toppings.getToppingsPrice();
        this.totalPrice += toAdd;
    }

    public double getTotalPrice(){
        return this.totalPrice;
    }

    public boolean isHealthyBurger() {
        return this instanceof Healthy_Burger;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public void addTopping(Topping topping){
        toppings.addTopping(topping);
    }

    public void removeTopping(Topping topping){
        toppings.removeTopping(topping);
    }

    public String toString(String sides) {
        setTotalPrice();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String displayPrice = formatter.format(this.totalPrice);
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(this.baseName);
        sb.append(" hamburger on ");
        sb.append(this.roll.getName());
        sb.append(" with ");
        sb.append(this.meat.getName());
        if(toppings.hasToppings()) {
            sb.append(" and the following toppings:");
            sb.append(toppings.getToppingsNames());
        }
        if(sides.length() > 0) {
            sb.append("\nThe following sides are also included:");
            sb.append(sides);
        }
        sb.append("\nTotal cost: ");
        sb.append(displayPrice);

        return sb.toString();
    }
}
