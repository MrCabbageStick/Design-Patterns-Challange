package dev.mrcabbagestick;

import java.util.Map;

public class ItemRegistry {
    static ItemRegistry instance = null;

    private final Map<RegistryKey, Item> items;

    private ItemRegistry(){
        items = Map.of(
                new RegistryKey("item.sword"), new Item("Sword"),
                new RegistryKey("item.axe"), new Item("Axe"),
                new RegistryKey("item.bottle_of_instant_regret"), new Item("Bottle of instant regret")
        );
    }

    public static ItemRegistry getInstance(){
        if(instance == null)
            instance = new ItemRegistry();

        return instance;
    }

    public Item getItem(RegistryKey registryKey){
        return items.get(registryKey);
    }

    public record Item(String name){}
}
