package com.yehoshuakahan;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(
                20,
                20,
                5);
        Case shell = new Case("220B",
                "Dell",
                "240",
                dimensions);

        Monitor monitor = new Monitor("Mustang",
                "Dell",
                27,
                new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("Mommy",
                "Hewlett-Packard",
                4,
                6,
                "2.44");

        PC pc = new PC(shell,
                       monitor,
                       motherboard);

        pc.powerUp();
//        pc.getMotherboard().loadProgram("Civilization VI");




    }
}
