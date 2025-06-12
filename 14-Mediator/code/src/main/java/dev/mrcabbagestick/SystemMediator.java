package dev.mrcabbagestick;

public class SystemMediator {
    private final Logger logger;
    private final ResourceManager resourceManager;
    private final DeviceManager deviceManager;

    public SystemMediator(Logger logger, ResourceManager resourceManager, DeviceManager deviceManager) {
        this.logger = logger;
        this.resourceManager = resourceManager;
        this.deviceManager = deviceManager;
    }

    public void log(String msg){
        logger.log(msg);
    }

    public void useResource(String path, boolean log){
        resourceManager.useResource(path, log);
    }

    public void useDevice(String deviceId, String msg){
        deviceManager.doDeviceStuff(deviceId, msg);
    }
}
