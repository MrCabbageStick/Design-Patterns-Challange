package io.github.mrcabbagestick;

public class BluntArrow implements Arrow{

    @Override
    public void dealDamage(Enemy enemy) {
        enemy.dealDamage(1);
    }
}
