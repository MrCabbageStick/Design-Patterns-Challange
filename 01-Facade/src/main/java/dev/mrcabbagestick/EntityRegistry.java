package dev.mrcabbagestick;

import java.util.Map;

public class EntityRegistry {
    static EntityRegistry instance = null;

    private final Map<RegistryKey, Entity> entities;

    private EntityRegistry(){
        entities = Map.of(
                new RegistryKey("entity.zombie"), new Entity("Zombie"),
                new RegistryKey("entity.skeleton"), new Entity("Skeleton"),
                new RegistryKey("entity.horse"), new Entity("Horse")
        );
    }

    public static EntityRegistry getInstance(){
        if(instance == null)
            instance = new EntityRegistry();

        return instance;
    }

    public Entity getEntity(RegistryKey registryKey){
        return entities.get(registryKey);
    }

    public record Entity(String name){}
}
