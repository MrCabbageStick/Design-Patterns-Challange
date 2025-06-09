package io.github.mrcabbagestick;

public class FlamingArrow implements Arrow{

    @Override
    public void dealDamage(Enemy enemy) {
        enemy.dealDamage(20);
    }
}
