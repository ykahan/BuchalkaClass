package InterfacesAndInnerAndAbstractClasses.AbstractClasses;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(intro() + "falls straight down");
    }

    @Override
    public String intro() {
        return getName() + " the penguin ";
    }
}
