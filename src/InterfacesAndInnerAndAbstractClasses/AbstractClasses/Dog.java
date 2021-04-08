package InterfacesAndInnerAndAbstractClasses.AbstractClasses;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public String intro(){
        return "I am a dog named " + getName() + " and I ";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void eat() {
        System.out.println(intro() + "am eating.  Yum!");
    }

    @Override
    public void walk() {
        System.out.println(intro() + "love Walkies!");
    }

    @Override
    public void breathe() {
        System.out.println(intro() + "think that Air is good");
    }
}
