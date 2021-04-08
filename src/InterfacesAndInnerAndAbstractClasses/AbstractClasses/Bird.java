package InterfacesAndInnerAndAbstractClasses.AbstractClasses;

public abstract class Bird extends Animal{
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

    public abstract void fly();
}
