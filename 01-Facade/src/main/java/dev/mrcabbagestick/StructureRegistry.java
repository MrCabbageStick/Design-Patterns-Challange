package dev.mrcabbagestick;

import java.util.Map;

public class StructureRegistry {
    static StructureRegistry instance = null;

    private final Map<RegistryKey, Structure> entities;

    private StructureRegistry(){
        entities = Map.of(
                new RegistryKey("structure.castle"), new Structure("Castle"),
                new RegistryKey("structure.house"), new Structure("House"),
                new RegistryKey("structure.arena"), new Structure("Arena")
        );
    }

    public static StructureRegistry getInstance(){
        if(instance == null)
            instance = new StructureRegistry();

        return instance;
    }

    public Structure getStructure(RegistryKey registryKey){
        return entities.get(registryKey);
    }

    public record Structure(String name){}
}
