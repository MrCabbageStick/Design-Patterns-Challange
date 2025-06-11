package io.github.mrcabbagestick;

import java.util.List;

public class DeviceGroup implements Device{

    private final List<Device> devices;

    public DeviceGroup(List<Device> devices) {
        this.devices = devices;
    }

    public void addDevice(Device device){
        devices.add(device);
    }

    @Override
    public void turnOn() {
        devices.forEach(Device::turnOn);
    }

    @Override
    public void turnOff() {
        devices.forEach(Device::turnOn);
    }

    @Override
    public void toggle() {
        devices.forEach(Device::toggle);
    }
}
