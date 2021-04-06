package InterfacesAndInnerAndAbstractClasses.InnerClasses;

import java.util.ArrayList;

public class Gearbox {
    private final ArrayList<Gear> gears;
    private final int maxGears;
    private Gear currentGear;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
        currentGear = gears.get(0);
        clutchIsIn = false;
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int gearNum, double ratio) {
        if (gearNum > 0 && gearNum <= maxGears) {
            for (Gear gear : gears) {
                if (gear.getNum() == gearNum || gear.getRatio() == ratio) return;
                // gear's already present, should not be added
            }
            Gear newGear = new Gear(gearNum, ratio);
            gears.add(newGear);
        }
    }

    public void addGear(double ratio){
        if(gears.size() < maxGears){
            boolean[] gearsPresent = createGearsArray();
            for (int i = 0; i < gearsPresent.length; i++) {
                if(gearsPresent[i] == false) {
                    addGear(i, ratio);
                    return;
                }
            }
        }
    }

    private boolean[] createGearsArray() {
        boolean[] gearsPresent = new boolean[maxGears];
        for (int i = 0; i < gearsPresent.length; i++) {
            gearsPresent[i] = false;
        }
        for(Gear gear: gears){
            gearsPresent[gear.getNum()] = true;
        }
        return gearsPresent;
    }

    public void changeGear(int newGear) {
        if (this.clutchIsIn) {
            for (Gear gear : gears) {
                if (gear.getNum() == newGear) {
                    currentGear = gear;
                    System.out.println("Gear changed to number " + currentGear);
                }
            }
        } else {
            System.out.println("Failed to change gear");
        }
    }

    public double driveSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("No wheel speed");
            return 0.0;
        } else {
                return this.currentGear.getNum() * revs;
            }
        }

    private static class Gear {
        private final int gearNum;
        private final double ratio;

        public Gear(int gearNum, double ratio) {
            this.gearNum = gearNum;
            this.ratio = ratio;
        }

        public int getNum() {
            return this.gearNum;
        }

        public double getRatio() {
            return this.ratio;
        }

        public double driveSpeed(int revs) {
            return (revs * this.ratio);
        }
    }
}
