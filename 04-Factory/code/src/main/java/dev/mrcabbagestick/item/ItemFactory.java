package dev.mrcabbagestick.item;

import dev.mrcabbagestick.item.edible.EdibleItemFactory;
import dev.mrcabbagestick.item.healing.HealingItemFactory;
import dev.mrcabbagestick.item.weapon.WeaponItemFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ItemFactory{
//    private final EdibleItemFactory edibleItemFactory;
//    private final HealingItemFactory healingItemFactory;
//    private final WeaponItemFactory weaponItemFactory;

    private final Map<String, DefaultItemFactory> typeFactoryMap;

    public ItemFactory(int hungerPoints, int healthPoints, int damagePoints) {
//        this.edibleItemFactory = new EdibleItemFactory(hungerPoints);
//        this.healingItemFactory = new HealingItemFactory(healthPoints);
//        this.weaponItemFactory = new WeaponItemFactory(damagePoints);

        typeFactoryMap = Map.of(
            "edible", new EdibleItemFactory(hungerPoints),
            "healing",  new HealingItemFactory(healthPoints),
            "weapon", new WeaponItemFactory(damagePoints)
        );
    }

    public Item createDefault(String name, String registryKey) throws IncorrectRegistryKeyException {
        var splitted = registryKey.split("\\.");

        if(splitted.length != 3)
            throw new IncorrectRegistryKeyException("Incorrect registry key format");

        var objectType = splitted[0];
        var itemType = splitted[1];
        var itemName = splitted[2];

        if(!objectType.equals("item"))
            throw new IncorrectRegistryKeyException("Incorrect game object type, expected 'item'");

        var factory = typeFactoryMap.get(itemType);

        if(factory == null)
            throw new IncorrectRegistryKeyException("Incorrect item type");

        return factory.createDefault(name, registryKey);
    }

    public static class IncorrectRegistryKeyException extends Exception{
        public IncorrectRegistryKeyException(String message) {
            super(message);
        }
    }
}
