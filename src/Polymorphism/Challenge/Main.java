package Polymorphism.Challenge;

public class Main {
    public static void main(String[] args) {
        Masechta brachos = new Brachos("Brachos", "Blessings", 65, true);
        Masechta bavaBasra = new Bava_Basra("Bava Bathra", "money", 190, true);
        Masechta mas = new Masechta("Kiddushin", "kinyanim", 75, false);
        Masechta[] masechtos = {brachos, bavaBasra, mas};

        for(Masechta masechta: masechtos){
            System.out.println("===================================");
            System.out.println(masechta.getName());
            System.out.println(masechta.getDafim());
            System.out.println(masechta.getTopic());
            System.out.println("Bavli? " + masechta.isBavli());
        }
    }
}
