package InterfacesAndInnerAndAbstractClasses.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Animal rascal = new Dog("Rascal");
        Animal flash = new Cat("Flash");
        Bird blizzard = new Parakeet("Blizzard");
        // in order to have access to fly(), we
        // must use a Bird object rather than an
        // Animal object
        
        rascal.breathe();
        rascal.eat();
        rascal.walk();

        flash.breathe();
        flash.eat();
        flash.walk();

        blizzard.breathe();
        blizzard.eat();
        blizzard.walk();
        blizzard.fly();
    }
}
