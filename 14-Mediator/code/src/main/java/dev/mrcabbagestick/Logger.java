package dev.mrcabbagestick;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private SystemMediator mediator;
    private List<String> logs = new ArrayList<>();
    private String logFilePath;

    public Logger(SystemMediator mediator, String logFilePath) {
        this.mediator = mediator;
        this.logFilePath = logFilePath;
    }

    public void setMediator(SystemMediator mediator) {
        this.mediator = mediator;
    }

    public void log(String msg){
        logs.add(msg);
        System.out.println(msg);
    }

    public void drainToFile(){
        // Let's imagine it writes the logs to a file
        mediator.useResource(logFilePath, false);
        logs.clear();
    }
}
