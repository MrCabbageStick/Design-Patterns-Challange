package io.github.mrcabbagestick;

public class Enemy {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void dealDamage(int damage){
        health -= damage;

        if(health < 0)
            health = 0;
    }

    public int getHealth() {
        return health;
    }
}
