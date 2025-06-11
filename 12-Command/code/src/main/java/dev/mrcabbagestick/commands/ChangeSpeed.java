package dev.mrcabbagestick.commands;

import dev.mrcabbagestick.PC;
import dev.mrcabbagestick.PCFanCommand;

public record ChangeSpeed(int newSpeed, int fanId) implements PCFanCommand {
    @Override
    public void execute(){
        var fan = PC.getInstance().getFan(fanId);

        if(fan == null)
            return;

        fan.setSpeed(newSpeed);
    }
}
