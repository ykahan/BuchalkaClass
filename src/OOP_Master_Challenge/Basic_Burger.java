package OOP_Master_Challenge;

public class Basic_Burger extends Hamburger {
    private double basePrice;


    public Basic_Burger(Roll roll, Meat meat, Topping topping1, Topping topping2, Topping topping3,
                        Topping topping4) {
        super(roll,
                meat,
                topping1,
                topping2,
                topping3,
                topping4,
                1.0,
                "Basic");
    }
}