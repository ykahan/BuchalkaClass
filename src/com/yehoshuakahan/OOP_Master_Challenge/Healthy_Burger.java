package com.yehoshuakahan.OOP_Master_Challenge;

public class Healthy_Burger extends Hamburger {

    public Healthy_Burger(Meat meat, Topping topping1, Topping topping2, Topping topping3, Topping topping4,
                          Topping topping5, Topping topping6){
        super(new Brown_Rye(),
                meat,
                new Topping[]{topping1, topping2, topping3, topping4, topping5, topping6},
                new Side[]{null},
                6,
                0,
                1.5);
    }
}
