package InterfacesAndInnerAndAbstractClasses.InnerClasses;

import java.util.ArrayList;

public class Gearbox {
    private final ArrayList<Gear> gears;
    private final int maxGears;
    private Gear currentGear;
    private boolean clutchIsIn;

    public Gearbox(int maxGears, double ratio) {
            this.maxGears = maxGears;
            this.gears = new ArrayList<>();

            Gear neutral = new Gear(0, 0.0);
            this.gears.add(neutral);
            currentGear = neutral;

            for (int i = 1; i < maxGears; i++) {
                double gearRatio = ratio * i;
                this.gears.add(new Gear(i, gearRatio));
            }

            clutchIsIn = false;
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void operateClutch(){
        this.clutchIsIn = !clutchIsIn;
    }

    public void changeGear(int newGear) {
        if (this.clutchIsIn) {
            for (Gear gear : gears) {
                if (gear.getNum() == newGear) {
                    currentGear = gear;
                    System.out.println("Gear changed to number " + currentGear.getNum());
                }
            }
        } else {
            System.out.println("Failed to change gear");
        }
    }

    @Override
    public String toString() {
        StringBuilder gearsString = new StringBuilder();
        for(Gear gear: gears){
            gearsString.append("\n\t").append(gear.toString());
        }
        return "Gearbox{\n" +
                "gears=" + gearsString +
                ",\n\t maxGears=" + maxGears +
                ",\n\t currentGear=" + currentGear +
                ",\n\t clutchIsIn=" + clutchIsIn +
                '}';
    }

    public double driveSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("No wheel speed");
            return 0.0;
        } else {
                return this.currentGear.getRatio() * revs;
            }
        }

    private static class Gear {
        // inner class
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

        @Override
        public String toString() {
            return "Gear{" +
                    "gearNum=" + gearNum +
                    ", ratio=" + ratio +
                    '}';
        }
    }
}
