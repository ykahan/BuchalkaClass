package com.yehoshuakahan.OOP_Master_Challenge;

public class Sides {
    private Side[] sides;
    private boolean sidesFixed;

    public Sides(Side[] sides, boolean sidesFixed){
        this.sides = sides;
        this.sidesFixed = sidesFixed;
    }

    public boolean hasSides(){
        for(Side side: sides){
            if(side != null){
                return true;
            }
        }
        return false;
    }

    public void addSide(Side newSide){
        double toAdd = 0.0;
        if(!this.sidesFixed) {
            for (int i = 0; i < sides.length; i++) {
                if (sides[i] == null) {
                    sides[i] = newSide;
                    break;
//                    toAdd = getCostAllSides();
//                    toAdd = getCostAllSides();
//                    return toAdd;
                }
            }
        }
//        return toAdd;
    }

    public void removeSide(Side oldSide){
//        double toSubtract = 0.0;
        if(!this.sidesFixed) {
            for (int i = 0; i < sides.length; i++) {
                if (sides[i].getClass() == oldSide.getClass()) {
//                    toSubtract = -1 * sides[i].getPrice();
                    sides[i] = null;
                    break;
//                    return toSubtract;
                }
            }
        }
//        return toSubtract;
    }

    public void switchSide(Side newSide, Side oldSide){
        organizeSides();
        for(int i = 0; i < sides.length; i++){
            if(sides[i].getClass() == oldSide.getClass()){
                removeSide(oldSide);
                addSide(newSide);
                break;
            }
        }
    }

    private void organizeSides(){
        if(sides[0] == null){
            sides[0] = sides[1];
            sides[1] = null;
        }
    }

    public double getCostAllSides(){
        double result = 0.0;
        for(int i =0; i < sides.length; i++) {
            if (sides[i] != null) {
                result += sides[i].getPrice();
            }
        }
        return result;
    }

    public boolean canAddSide(){
        for(Side side: sides){
            if(side == null){
                return true;
            }
        }
        return false;
    }

    public boolean canRemoveSide(){
        if(!this.sidesFixed) {
            for (Side side : sides) {
                if (side != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean canSwitchSide(Side oldSide){
        if(!this.sidesFixed) {
            for (Side side : sides) {
                if (side.getClass() == oldSide.getClass()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Side side: sides){
            sb.append("\n");
            sb.append(side.getName());
        }
        return sb.toString();
    }
}
