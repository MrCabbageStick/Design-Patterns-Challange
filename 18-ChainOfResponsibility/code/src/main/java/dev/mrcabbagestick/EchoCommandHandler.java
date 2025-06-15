package dev.mrcabbagestick;

public class EchoCommandHandler extends CommandHandler{
    public EchoCommandHandler(CommandHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean canHandle(String command) {
        var _command = CommandSplit.fromString(command).command();
        return _command != null && _command.equals("echo");
    }

    @Override
    public void handle(String command) {
        if(canHandle(command)){
            var split = CommandSplit.fromString(command);
            System.out.println(String.join(" ", split.rest()));
        }
        else
            super.handle(command);

    }
}
