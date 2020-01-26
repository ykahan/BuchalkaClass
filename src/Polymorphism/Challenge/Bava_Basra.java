package Polymorphism.Challenge;

public class Bava_Basra extends Masechta{
    public Bava_Basra(String name, String topic, int dafim, boolean isBavli) {
        super(name, topic, dafim, isBavli);
    }

    @Override
    public String getName() {
        return "Bava Basra";
    }

    @Override
    public String getTopic() {
        return "Property law";
    }

    @Override
    public int getDafim() {
        return 180;
    }
}
