package dev.mrcabbagestick;

import java.util.ArrayList;
import java.util.List;

public class CommandListInvoker {
    private List<PCFanCommand> commands = new ArrayList<>();

    public void addCommand(PCFanCommand command){
        commands.add(command);
    }

    public void executeAll(){
        commands.forEach(PCFanCommand::execute);
    }
}
