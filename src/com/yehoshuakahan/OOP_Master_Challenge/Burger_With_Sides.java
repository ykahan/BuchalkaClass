//package com.yehoshuakahan.OOP_Master_Challenge;
//
//public class Burger_With_Sides extends Hamburger {
//    private Side[] sides;
//    private boolean sidesFixed;
//
//    public Burger_With_Sides(Roll roll,
//                             Meat meat,
//                             double basePrice,
//                             Topping topping1,
//                             Topping topping2,
//                             Topping topping3,
//                             Topping topping4,
//                             Side side1,
//                             Side side2,
//                             boolean sidesFixed){
//        super(roll,
//                meat,
//                topping1,
//                topping2,
//                topping3,
//                topping4,
//                basePrice);
//        this.sides = new Side[] {side1, side2};
//        this.sidesFixed = sidesFixed;
//    }
//
//    public void addSide(Side newSide){
//        if(!this.sidesFixed) {
//            for (int i = 0; i < sides.length; i++) {
//                if (sides[i] == null) {
//                    sides[i] = newSide;
//                    double toAdd = getCostAllSides();
//                    super.setTotalPrice(toAdd);
//                    break;
//                }
//            }
//        }
//    }
//
//    public void removeSide(Side oldSide){
//        if(!this.sidesFixed) {
//            for (int i = 0; i < sides.length; i++) {
//                if (sides[i].getClass() == oldSide.getClass()) {
//                    double toSubtract = -1 * sides[i].getPrice();
//                    sides[i] = null;
//                    super.setTotalPrice(toSubtract);
//                    break;
//                }
//            }
//        }
//    }
//
//    public void switchSide(Side newSide, Side oldSide){
//        organizeSides();
//        for(int i = 0; i < sides.length; i++){
//            if(sides[i].getClass() == oldSide.getClass()){
//                removeSide(oldSide);
//                addSide(newSide);
//                break;
//            }
//        }
//    }
//
//    private void organizeSides(){
//        if(sides[0] == null){
//            sides[0] = sides[1];
//            sides[1] = null;
//        }
//    }
//
//    public double getCostAllSides(){
//        double result = 0.0;
//        for(Side side: sides){
//            result += side.getPrice();
//        }
//        return result;
//    }
//
//    public boolean canAddSide(){
//        for(Side side: sides){
//            if(side == null){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean canRemoveSide(){
//        if(!this.sidesFixed) {
//            for (Side side : sides) {
//                if (side != null) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public boolean canSwitchSide(Side oldSide){
//        if(!this.sidesFixed) {
//            for (Side side : sides) {
//                if (side.getClass() == oldSide.getClass()) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//}
