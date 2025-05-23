package dev.mrcabbagestick;

public class Main {

    public static void main(String[] args) {
        System.out.println(GameRegistries.getItem(new RegistryKey("item.bottle_of_instant_regret")));
        System.out.println(GameRegistries.getEntity(new RegistryKey("entity.horse")));
        System.out.println(GameRegistries.getStructure(new RegistryKey("structure.house")));
    }
}