package Encapsulation;

public class Player {
    private String firstName;
    private int health;
    private String weapon;
    private int lives;

    public Player(String name, String weapon, int health, int lives) {
        this.firstName = name;
        if(this.firstName == "") this.firstName = "Raistlin";
        this.health = health;
        if(this.health < 1) this.health = 1;
        if(this.health > 100) this.health = 100;
        this.lives = lives;
        if(this.lives > 3) this.lives = 3;
        if(this.lives < 1) this.lives = 1;
        this.weapon = weapon;
    }

    public void loseHealth(int points){
        this.health -= points;
        if(this.health <= 0){
            System.out.println("Player knocked out of game");
            lives -= 1;
            if(lives == 0) System.out.println("You lose the game.");
        }
    }

    public void gainHealth(int points){
        this.health += points;
        if(health > 100) health = 100;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getLives() {
        return lives;
    }

    public int healthRemaining(){
        return this.health;
    }
}
