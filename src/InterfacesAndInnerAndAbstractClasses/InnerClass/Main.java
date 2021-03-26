package InterfacesAndInnerAndAbstractClasses.InnerClass;

public class Main {
    public static void main(String[] args) {
        Gearbox porsche = new Gearbox(6);
        Gearbox.Gear first = porsche.new Gear(1, 12.3);
        Gearbox.Gear second = porsche.new Gear(2, 6.5);
        System.out.println(first.driveSpeed(1000));
        System.out.println(second.driveSpeed(560));
    }
}
