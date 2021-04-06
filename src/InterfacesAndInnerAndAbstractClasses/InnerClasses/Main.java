package InterfacesAndInnerAndAbstractClasses.InnerClasses;

public class Main {
    public static void main(String[] args) {
        Gearbox mclaren = new Gearbox(6);
        mclaren.addGear(1, 12.3);
        System.out.println(mclaren.driveSpeed(1, 1000));
    }
}
