package dev.mrcabbagestick.item.weapon;

import dev.mrcabbagestick.item.Item;

public class WeaponItem implements Item {
    private final String registryKey;
    private final String name;
    private final int damagePoints;

    public WeaponItem(String registryKey, String name, int damagePoints) {
        this.registryKey = registryKey;
        this.name = name;
        this.damagePoints = damagePoints;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRegistryKey() {
        return registryKey;
    }

    public int getDamagePoints(){
        return damagePoints;
    }
}
