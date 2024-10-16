package org.example.Command;

import org.example.CoR.Task;

public class TaskInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute(String taskDesc) {
        if(command != null) command.execute(taskDesc);
    }
}
