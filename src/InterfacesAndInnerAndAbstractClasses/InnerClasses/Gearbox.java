package InterfacesAndInnerAndAbstractClasses.InnerClasses;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;

    public Gearbox(int maxGears){
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void addGear(int gearNum, double ratio){
        Gear gear = new Gear(gearNum, ratio);
        gears.add(gear);
    }

    public double driveSpeed(int gearNum, int revs){
        for(Gear gear: gears){
            if(gear.gearNum == gearNum){
                return gear.driveSpeed(revs);
            }
        }
        return -1.0;
    }

    private class Gear{
        private int gearNum;
        private double ratio;

        public Gear(int gearNum, double ratio){
            this.gearNum = gearNum;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return (revs * this.ratio);
        }
    }
}
