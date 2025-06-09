package dev.mrcabbagestick.item.healing;

import dev.mrcabbagestick.item.Item;

public class HealingItem implements Item {
    private final String registryKey;
    private final String name;
    private final int healthPoints;

    public HealingItem(String registryKey, String name, int healthPoints) {
        this.registryKey = registryKey;
        this.name = name;
        this.healthPoints = healthPoints;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRegistryKey() {
        return registryKey;
    }

    public int getHealthPoints(){
        return healthPoints;
    }
}
