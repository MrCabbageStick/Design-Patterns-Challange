package dev.mrcabbagestick;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class CommandHandler {
    private CommandHandler nextHandler = null;

    public CommandHandler(CommandHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public CommandHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(CommandHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract public boolean canHandle(String command);

    public void handle(String command){
        if(nextHandler != null)
            nextHandler.handle(command);
    }

    protected record CommandSplit(String command, List<String> rest){
        public static CommandSplit fromString(String string){
            var split = string.split(" ");

            String command = null;
            List<String> rest = null;

            if(split.length >= 1){
                command = split[0];
            }

            if(split.length >= 2){
                rest = Arrays.stream(split).skip(1).toList();
            }

            return new CommandSplit(command, rest);
        }
    }
}
