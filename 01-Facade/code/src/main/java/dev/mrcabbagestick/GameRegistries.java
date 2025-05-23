package dev.mrcabbagestick;

public class GameRegistries {

    public static ItemRegistry.Item getItem(RegistryKey registryKey){
        return ItemRegistry.getInstance().getItem(registryKey);
    }

    public static StructureRegistry.Structure getStructure(RegistryKey registryKey){
        return StructureRegistry.getInstance().getStructure(registryKey);
    }

    public static EntityRegistry.Entity getEntity(RegistryKey registryKey){
        return EntityRegistry.getInstance().getEntity(registryKey);
    }
}
