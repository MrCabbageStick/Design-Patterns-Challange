package dev.mrcabbagestick;

import java.util.HashMap;
import java.util.Map;

public class ResourceManager {
    private Map<String, String> resources = new HashMap<>(); // Path -> Name
    private SystemMediator mediator;
    private String printerDeviceId;

    public ResourceManager(SystemMediator mediator, String printerDeviceId) {
        this.mediator = mediator;
        this.printerDeviceId = printerDeviceId;
    }

    public void addResource(String path, String name){
        resources.put(path, name);
    }

    public void setMediator(SystemMediator mediator) {
        this.mediator = mediator;
    }

    public void printFileContents(String path){
        mediator.useDevice(
                printerDeviceId,
                String.format("File '%s' contents: <NONE>", path)
        );
    }

    public void useResource(String resourcePath, boolean log){
        var resource = resources.get(resourcePath);

        if(resource == null)
            return;

        if(log)
            mediator.log(String.format("Using resource: %s(%s).", resource, resourcePath));
    }
}
