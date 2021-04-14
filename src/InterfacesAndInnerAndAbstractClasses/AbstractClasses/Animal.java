package InterfacesAndInnerAndAbstractClasses.AbstractClasses;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    // Abstract methods are just method signatures which must be implemented
    // by inheriting classes.  As far as these are concerned, an abstract
    // class is like an interface.  The difference is that an abstract class
    // can also provide implemented code which inheriting classes can use
    // as-is, such as the getter found below.

    public abstract void eat();
    public abstract void breathe();
    public abstract void walk();
    public abstract String intro();

    protected String getName() {
        return name;
    }
}
