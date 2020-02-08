package OOP_Master_Challenge;

public class Deluxe_Burger extends Hamburger {
    private Sides sides;

    public Deluxe_Burger(Roll roll, Meat meat,
                         Topping topping1, Topping topping2, Topping topping3, Topping topping4){
        super(roll,
                meat,
                topping1,
                topping2,
                topping3,
                topping4,
                2.5,
                "Deluxe");
        sides = new Sides(new Side[]{new French_Fries(), new Drink()},
                true);
    }


    @Override
    public String toString() {
        String sides = this.sides.toString();
        return super.toString(sides);
    }
}