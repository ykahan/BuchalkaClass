package InterfacesAndInnerAndAbstractClasses.AbstractClasses;

public class Parakeet extends Bird{
    public Parakeet(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(intro() + "I flit about in the cage");
    }

    @Override
    public String intro() {
        return "I am a parakeet named " + getName() + " and ";
    }
}
