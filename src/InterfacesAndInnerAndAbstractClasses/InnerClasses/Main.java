package InterfacesAndInnerAndAbstractClasses.InnerClasses;

public class Main {
    public static void main(String[] args) {
        Gearbox mclaren = new Gearbox(6);
        Gearbox.Gear first = mclaren.new Gear(1, 12.3);
        System.out.println(first.driveSpeed(1000));
    }
}
