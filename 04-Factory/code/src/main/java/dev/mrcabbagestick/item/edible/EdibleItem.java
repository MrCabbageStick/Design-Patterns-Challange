package dev.mrcabbagestick.item.edible;

import dev.mrcabbagestick.item.Item;

public class EdibleItem implements Item {
    private final String registryKey;
    private final String name;
    private final int hungerPoints;

    public EdibleItem(String registryKey, String name, int hungerPoints) {
        this.registryKey = registryKey;
        this.name = name;
        this.hungerPoints = hungerPoints;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRegistryKey() {
        return registryKey;
    }

    public int getHungerPoints() {
        return hungerPoints;
    }
}
