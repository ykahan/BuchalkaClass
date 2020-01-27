package com.yehoshuakahan.OOP_Master_Challenge;

public class Basic_Burger extends Hamburger {


    public Basic_Burger(Roll roll, Meat meat, Topping topping1, Topping topping2, Topping topping3,
                        Topping topping4) {
        super(roll,
                meat,
                new Topping[]{topping1, topping2, topping3, topping4},
                new Side[]{null},
                4,
                0,
                1.0);
    }
}
