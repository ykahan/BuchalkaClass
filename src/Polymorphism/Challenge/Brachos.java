package Polymorphism.Challenge;

public class Brachos extends Masechta {
    public Brachos(String name, String topic, int dafim, boolean isBavli) {
        super(name, topic, dafim, isBavli);
    }

    @Override
    public String getName() {
        return "Brachos";
    }

    @Override
    public String getTopic() {
        return "Blessings and prayer.";
    }

    @Override
    public int getDafim() {
        return 63;
    }
}
