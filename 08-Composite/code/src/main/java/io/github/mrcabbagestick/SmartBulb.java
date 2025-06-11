package io.github.mrcabbagestick;

public class SmartBulb implements Device{
    private boolean isOn = false;
    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public void toggle() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }
}
