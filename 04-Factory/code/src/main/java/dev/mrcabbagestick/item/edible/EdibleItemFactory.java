package dev.mrcabbagestick.item.edible;

import dev.mrcabbagestick.item.DefaultItemFactory;
import dev.mrcabbagestick.item.Item;

public class EdibleItemFactory implements DefaultItemFactory {
    private final int hungerPoints;

    public EdibleItemFactory(int hungerPoints){
        this.hungerPoints = hungerPoints;
    }

    @Override
    public Item createDefault(String name, String registryKey) {
        return new EdibleItem(registryKey, name, hungerPoints);
    }
}
