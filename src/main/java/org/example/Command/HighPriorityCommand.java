package org.example.Command;

public class HighPriorityCommand implements Command {
    TaskReceiver taskReceiver;

    public HighPriorityCommand(TaskReceiver taskReceiver) {
        this.taskReceiver = taskReceiver;
    }

    @Override
    public void execute() {
        taskReceiver.handleHighPriorityTask();
    }
}
