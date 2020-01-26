package Unencapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Yehoshua";
        player.health = 20;
        player.weapon = "sword";

        int damage = 21;
        player.loseHealth(damage);;
        System.out.println("Remaining health: " + player.healthRemaining());
    }
}
