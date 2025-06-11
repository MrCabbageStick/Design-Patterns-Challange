package io.github.mrcabbagestick;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var dev1 = new SmartBulb();
        var dev2 = new SmartBulb();
        var dev3 = new SmartBulb();
        var dev4 = new SmartBulb();

        var deviceGroup = new DeviceGroup(List.of(dev1, dev2, dev3));

        dev1.turnOn();
        dev3.turnOn();

        dev4.turnOn();

        deviceGroup.toggle();

        assert(!dev1.isOn());
        assert(dev2.isOn());
        assert(!dev3.isOn());
        assert(dev1.isOn());

        System.out.println("Bulb1: " + (dev1.isOn() ? "▣" : "□"));
        System.out.println("Bulb2: " + (dev2.isOn() ? "▣" : "□"));
        System.out.println("Bulb3: " + (dev3.isOn() ? "▣" : "□"));
        System.out.println("Bulb4: " + (dev4.isOn() ? "▣" : "□"));
    }
}