package InterfacesAndInnerAndAbstractClasses.InnerClass;

import java.util.ArrayList;

public class Gearbox {
    private final ArrayList<Gear> gears;
    private final int maxGear;
    private int currentGear;
    private boolean clutchIsIn;

    public Gearbox(int maxGear) {
        this.maxGear = maxGear;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if (gearIsValid(number, ratio) && gearIsNew(number, ratio)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int number){
        if(gearIsValid(number) && haveGear(number) && clutchIsIn)
        this.currentGear = number;
    }

    private boolean haveGear(int number){
        for (Gear gear : gears) {
            if (number == gear.gearNumber) return true;
        }
        return false;
    }

    private boolean gearIsNew(int number, double ratio) {
        for (Gear gear : gears) {
            if (number == gear.gearNumber) return false;
            if (ratio == gear.ratio) return false;
        }
        return true;
    }

    private boolean gearIsValid(int number, double ratio) {
        return number > 0 && number <= maxGear && ratio > 0;
    }

    private boolean gearIsValid(int number){
        return gearIsValid(number, 1.0);
    }

    private static class Gear {
        private final int gearNumber;
        private final double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * this.ratio;
        }
    }


}
