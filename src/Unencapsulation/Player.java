package Unencapsulation;

public class Player {
    public String name;
    public int health;
    public String weapon;
    public int lives;

    public void loseHealth(int points){
        this.health -= points;
        if(this.health <= 0){
            System.out.println("Player knocked out of game");
            lives -= 1;
            if(lives == 0) System.out.println("You lose the game.");
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
