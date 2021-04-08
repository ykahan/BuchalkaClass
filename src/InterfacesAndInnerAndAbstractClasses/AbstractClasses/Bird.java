package InterfacesAndInnerAndAbstractClasses.AbstractClasses;

public abstract class Bird extends Animal implements IFlyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the bird is pecking");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " the bird is breathing");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " the bird is walking");
    }

    @Override
    public String intro() {
        return null;
    }

    @Override
    public void fly() {
        System.out.println("I've got IFlyable");
    }
}
