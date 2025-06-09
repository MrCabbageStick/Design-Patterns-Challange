package io.github.mrcabbagestick;

public class Bow {
    private Arrow arrow;

    public Bow(Arrow arrow) {
        this.arrow = arrow;
    }

    public void dealDamage(Enemy enemy){
        arrow.dealDamage(enemy);
    }

    public void setArrow(Arrow arrow) {
        this.arrow = arrow;
    }
}
