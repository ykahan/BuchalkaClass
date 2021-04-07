package InterfacesAndInnerAndAbstractClasses.InnerClasses;

public class Main {
    public static void main(String[] args) {
        Gearbox mclaren = new Gearbox(6);
        mclaren.addGear(1, 12.3);
        System.out.println(mclaren.driveSpeed(1000));
        mclaren.addGear(4,15.5);
        mclaren.addGear(13.1);
        mclaren.addGear(14.2);
        System.out.println(mclaren.toString());
    }
}
