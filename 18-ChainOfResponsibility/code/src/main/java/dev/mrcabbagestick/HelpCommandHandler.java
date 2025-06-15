package dev.mrcabbagestick;

public class HelpCommandHandler extends CommandHandler{
    public HelpCommandHandler(CommandHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean canHandle(String command) {
        var _command = CommandSplit.fromString(command).command();
        return _command != null && _command.equals("help");
    }

    @Override
    public void handle(String command) {
        if(canHandle(command)){
            System.out.println(
                    "Commands:\n" +
                    "  ping -> prints 'pong'\n" +
                    "  echo <...text> -> prints back text\n" +
                    "  help -> prints this message"
            );
        }
        else
            super.handle(command);

    }
}
