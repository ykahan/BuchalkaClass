package com.yehoshuakahan;

public class Player {
    public String fullName;
    public int health;
    public String weapon;
    public int lives;

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0) {
            System.out.println("Player dead");
            this.lives--;
        }
    }

    public int getHealth(){
        return this.health;
    }
}
