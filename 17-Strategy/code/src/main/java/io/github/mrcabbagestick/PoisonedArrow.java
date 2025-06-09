package io.github.mrcabbagestick;

public class PoisonedArrow implements Arrow{
    @Override
    public void dealDamage(Enemy enemy) {
        enemy.dealDamage(10);
    }
}
