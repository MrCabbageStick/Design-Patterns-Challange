package dev.mrcabbagestick;

public class PingCommandHandler extends CommandHandler{
    public PingCommandHandler(CommandHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean canHandle(String command) {
        var _command = CommandSplit.fromString(command).command();
        return _command != null && _command.equals("ping");
    }

    @Override
    public void handle(String command) {
        if(canHandle(command)){
            System.out.println("pong");
        }
        else
            super.handle(command);

    }
}
