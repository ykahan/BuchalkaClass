package InterfacesAndInnerAndAbstractClasses.InnerClass;

public class Main {
    public static void main(String[] args) {
        Gearbox porsche = new Gearbox(6);
        porsche.addGear(1, 12.3);
        porsche.addGear(2, 6.5);
        porsche.changeGear(1);
        System.out.println(porsche.getWheelSpeed(1000));
        porsche.operateClutch(true);
        porsche.changeGear(1);
        System.out.println(porsche.getWheelSpeed(1000));
        porsche.operateClutch(false);
        System.out.println(porsche.getWheelSpeed(1000));
    }
}
