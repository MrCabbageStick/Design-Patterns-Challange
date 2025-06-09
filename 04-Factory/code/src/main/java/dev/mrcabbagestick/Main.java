package dev.mrcabbagestick;

import dev.mrcabbagestick.item.ItemFactory;
import dev.mrcabbagestick.item.edible.EdibleItem;
import dev.mrcabbagestick.item.healing.HealingItem;
import dev.mrcabbagestick.item.weapon.WeaponItem;

public class Main {
    public static void main(String[] _args) throws ItemFactory.IncorrectRegistryKeyException {
        var factory = new ItemFactory(15, 5, 10);

        var watermelon = factory.createDefault("Watermelon", "item.edible.watermelon");
        var sword = factory.createDefault("Sword", "item.weapon.sword");
        var aspirin = factory.createDefault("Aspirin", "item.healing.aspirin");

        System.out.println("Watermelon is edible: " + (watermelon instanceof EdibleItem));
        System.out.println("Sword is a weapon: " + (sword instanceof WeaponItem));
        System.out.println("Aspirin is healing: " + (aspirin instanceof HealingItem));

        try{
            factory.createDefault("Invalid", "item.incorrect.invalid");
        } catch (ItemFactory.IncorrectRegistryKeyException e) {
            System.out.println("Invalid item type handled correctly");
        }

        try{
            factory.createDefault("Invalid", "invalid.healing.potion");
        } catch (ItemFactory.IncorrectRegistryKeyException e) {
            System.out.println("Invalid object type handled correctly");
        }

        try{
            factory.createDefault("Invalid", "invalid.washing_machine");
        } catch (ItemFactory.IncorrectRegistryKeyException e) {
            System.out.println("Invalid registry key format handled correctly");
        }
    }
}