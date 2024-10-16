package org.example.Command;

public class TaskInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        if(command != null) command.execute();
    }
}
