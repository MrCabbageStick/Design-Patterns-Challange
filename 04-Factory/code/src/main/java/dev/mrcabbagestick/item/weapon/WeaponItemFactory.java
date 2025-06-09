package dev.mrcabbagestick.item.weapon;

import dev.mrcabbagestick.item.DefaultItemFactory;
import dev.mrcabbagestick.item.Item;

public class WeaponItemFactory implements DefaultItemFactory {
    private final int damagePoints;

    public WeaponItemFactory(int damagePoints){
        this.damagePoints = damagePoints;
    }

    @Override
    public Item createDefault(String name, String registryKey) {
        return new WeaponItem(registryKey, name, damagePoints);
    }
}
