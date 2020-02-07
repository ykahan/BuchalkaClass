package com.yehoshuakahan.OOP_Master_Challenge;

public class Healthy_Burger extends Hamburger{
    private Sides sides;

    public Healthy_Burger(Meat meat,
                          Topping topping1, Topping topping2, Topping topping3, Topping topping4,
                          Side side1, Side side2){
        super(new Brown_Rye(),
                meat,
                topping1,
                topping2,
                topping3,
                topping4,
                1.5,
                "Healthy");
        sides = new Sides(new Side[]{side1, side2},
                false);
    }

    @Override
    public void setTotalPrice() {
        double toAdd = this.sides.getCostAllSides();
        super.setTotalPrice(toAdd);
    }

    @Override
    public String toString() {
        String sides = this.sides.toString();
        return super.toString(sides);
    }

    public void addSide(Side side){
        this.sides.addSide(side);
    }

    public void removeSide(Side side){
        this.sides.removeSide(side);
    }

    public void switchSides(Side oldSide, Side newSide){
        this.sides.switchSide(oldSide, newSide);
    }

    public void addTopping(Topping topping){
        super.addTopping(topping);
    }

    public void removeTopping(Topping topping){
        super.removeTopping(topping);
    }
}