package dev.mrcabbagestick;

public class Main {
    public static void main(String[] args) {
        var handler = new HelpCommandHandler(new EchoCommandHandler(new PingCommandHandler(null)));

        handler.handle("There is no such a command");
        handler.handle("ping");
        handler.handle("echo Hello there, old sport!");
        handler.handle("help");
    }
}