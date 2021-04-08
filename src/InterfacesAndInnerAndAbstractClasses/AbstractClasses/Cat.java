package InterfacesAndInnerAndAbstractClasses.AbstractClasses;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String intro() {
        return "I am a cat named " + getName() + " and ";
    }

    @Override
    public void eat() {
        System.out.println(intro() + "I eat mice");
    }

    @Override
    public void breathe() {
        System.out.println(intro() + "I breathe calmly");
    }

    @Override
    public void walk() {
        System.out.println(intro() + "I do not need you to take me for a walk");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
