package InterfacesAndInnerAndAbstractClasses.InnerClasses;

public class Main {
    public static void main(String[] args) {
        Gearbox mclaren = new Gearbox(6);
        mclaren.addGear(1, 5.3);
        mclaren.addGear(10.6);
        mclaren.addGear(15.9);
        mclaren.changeGear(1);
        mclaren.operateClutch();
        mclaren.changeGear(1);
        mclaren.driveSpeed(1000);
        mclaren.operateClutch();
        double speed = mclaren.driveSpeed(1000);
        System.out.println("Speed is " + speed);

    }
}
