package Polymorphism.Challenge;

public class Kesuvos extends Masechta {
    public Kesuvos(String name, String topic, int dafim, boolean isBavli) {
        super(name, topic, dafim, isBavli);
    }

    @Override
    public String getName() {
        return "Kesuvos";
    }

    @Override
    public String getTopic() {
        return "Miscellany";
    }

    @Override
    public int getDafim() {
        return 90;
    }
}
