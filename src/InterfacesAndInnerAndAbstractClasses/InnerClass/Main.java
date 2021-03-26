package InterfacesAndInnerAndAbstractClasses.InnerClass;

public class Main {
    public static void main(String[] args) {
        Gearbox porsche = new Gearbox(6);
        porsche.changeGear(1);
        System.out.println(porsche.getWheelSpeed(1000));
        porsche.operateClutch(true);
        porsche.changeGear(1);
        System.out.println(porsche.getWheelSpeed(1000));
        porsche.operateClutch(false);
        System.out.println(porsche.getWheelSpeed(1000));
        porsche.operateClutch(true);
        porsche.changeGear(2);
        porsche.operateClutch(false);
        System.out.println(porsche.getWheelSpeed(1000));

    }
}
