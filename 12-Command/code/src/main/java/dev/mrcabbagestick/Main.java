package dev.mrcabbagestick;

import dev.mrcabbagestick.commands.ChangeColor;
import dev.mrcabbagestick.commands.ChangeSpeed;

public class Main {
    public static void main(String[] args) {
        var invoker = new CommandListInvoker();

        PC.getInstance().addFan(new PCFan());
        PC.getInstance().addFan(new PCFan());
        PC.getInstance().addFan(new PCFan());

        invoker.addCommand(new ChangeSpeed(127, 0));
        invoker.addCommand(new ChangeSpeed(63, 1));
        invoker.addCommand(new ChangeSpeed(31, 2));

        invoker.addCommand(new ChangeColor(0xff00ff, 0));
        invoker.addCommand(new ChangeColor(0x00ffff, 1));
        invoker.addCommand(new ChangeColor(0xffff00, 2));

        invoker.executeAll();

        PC.getInstance().getFans().forEach((i, fan) -> {
            System.out.printf("FAN(%d) speed: %3d, color: %06x%n", i, fan.getSpeed(), fan.getColor());
        });
    }
}