package InterfacesAndInnerAndAbstractClasses.AbstractClasses;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Yum!");
    }

    @Override
    public void walk() {
        System.out.println("Walkies!");
    }

    @Override
    public void breathe() {
        System.out.println("Air is good");
    }
}
