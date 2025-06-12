package dev.mrcabbagestick;

import java.util.HashMap;
import java.util.Map;

public class DeviceManager {
    private Map<String, String> devices = new HashMap<>(); // ID -> Name
    private SystemMediator mediator;

    public DeviceManager(SystemMediator mediator) {
        this.mediator = mediator;
    }

    public void setMediator(SystemMediator mediator) {
        this.mediator = mediator;
    }

    public void addDevice(String id, String name){
        devices.put(id, name);
    }

    public void doDeviceStuff(String deviceId, String msg){
        var device = devices.get(deviceId);

        if(device == null)
            return;

        mediator.log(String.format("%s(%s) does it's things:\n    %s", device, deviceId, msg));
    }
}
