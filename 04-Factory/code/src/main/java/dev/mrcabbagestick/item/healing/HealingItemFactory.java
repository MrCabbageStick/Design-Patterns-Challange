package dev.mrcabbagestick.item.healing;

import dev.mrcabbagestick.item.DefaultItemFactory;
import dev.mrcabbagestick.item.Item;

public class HealingItemFactory implements DefaultItemFactory {
    private final int healthPoints;

    public HealingItemFactory(int healthPoints){
        this.healthPoints = healthPoints;
    }

    @Override
    public Item createDefault(String name, String registryKey) {
        return new HealingItem(registryKey, name, healthPoints);
    }
}
