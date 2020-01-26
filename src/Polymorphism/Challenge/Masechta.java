package Polymorphism.Challenge;

public class Masechta {
    private String name;
    private String topic;
    private int dafim;
    private boolean isBavli;

    public Masechta(String name, String topic, int dafim, boolean isBavli) {
        this.name = name;
        this.topic = topic;
        this.dafim = dafim;
        this.isBavli = isBavli;
    }

    public String getName() {
        return "Name unknown";
    }

    public String getTopic() {
        return "Topic unknown";
    }

    public int getDafim() {
        return -1;
    }

    public boolean isBavli() {
        return isBavli;
    }
}
