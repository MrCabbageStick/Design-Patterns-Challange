package io.github.mrcabbagestick;

public class Main {
    public static void main(String[] args) {
        var enemy = new Enemy(100);

        var bow = new Bow(new BluntArrow());

        bow.dealDamage(enemy);
        assert enemy.getHealth() == 99;

        bow.setArrow(new FlamingArrow());
        bow.dealDamage(enemy);
        assert enemy.getHealth() == 79;

        bow.setArrow(new PoisonedArrow());
        bow.dealDamage(enemy);
        assert enemy.getHealth() == 69;
    }
}