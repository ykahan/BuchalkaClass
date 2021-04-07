package InterfacesAndInnerAndAbstractClasses.InnerClasses;

public class Main4Gearbox {
    public static void main(String[] args) {
        Gearbox mclaren = new Gearbox(6, 5.3);

        mclaren.changeGear(1);
        mclaren.operateClutch();
        mclaren.changeGear(1);
        mclaren.driveSpeed(1000);
        mclaren.operateClutch();
        double speed = mclaren.driveSpeed(1000);
        System.out.println("Speed is " + speed);
        System.out.println(mclaren.toString());

    }
}
