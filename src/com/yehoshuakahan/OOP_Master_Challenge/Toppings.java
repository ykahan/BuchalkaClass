package com.yehoshuakahan.OOP_Master_Challenge;

public class Toppings {
    Topping[] toppings;

    public Toppings(Topping[] toppings) {
        this.toppings = toppings;
    }

    public double getToppingsPrice() {
        double result = 0.0;
        for (int i = 0; i < toppings.length; i++) {
            if (toppings[i] != null) {
                result += toppings[i].getPrice();
            }
        }
        return result;
    }

    public boolean hasToppings() {
        for (Topping topping : toppings) {
            if (topping != null) {
                return true;
            }
        }
        return false;
    }

    public String getToppingsNames() {
        organizeToppings();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < toppings.length; i++) {
            if (toppings[i] != null) {
                sb.append("\n");
                sb.append(toppings[i].getName());
            }
        }
        return sb.toString();
    }

    private void organizeToppings() {
        for (int i = 0; i < toppings.length; i++) {
            if (toppings[i] == null) {
                int firstFilled = getFirstFilledIndex(i + 1);
                if (firstFilled != -1) {
                    toppings[i] = toppings[firstFilled];
                    toppings[firstFilled] = null;
                }
            }
        }
    }

    public int getFirstFilledIndex(int start) {
        for (int i = start; i < toppings.length; i++) {
            if (toppings[i] != null) {
                return i;
            }
        }
        return -1;
    }

    public void removeTopping(Topping toppingToRemove) {
        if (!canRemoveTopping()) return;
        for (int i = 0; i < toppings.length; i++) {
            if (toppings[i].getClass() == toppingToRemove.getClass()) {
                toppings[i] = null;
                organizeToppings();
                break;
            }
        }
    }

    public void addTopping(Topping toppingToAdd) {
        if (!canAddTopping()) return;
        for (int i = 0; i < toppings.length; i++) {
            if (toppings[i] == null) {
                toppings[i] = toppingToAdd;
                organizeToppings();
                break;
            }
        }
    }

    private boolean canAddTopping() {
        for (Topping topping : toppings) {
            if (topping == null) {
                return true;
            }
        }
        return false;
    }

    private boolean canRemoveTopping() {
        for (Topping topping : toppings) {
            if (topping != null) {
                return true;
            }
        }
        return false;
    }
}