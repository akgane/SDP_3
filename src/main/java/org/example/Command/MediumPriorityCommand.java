package org.example.Command;

public class MediumPriorityCommand implements Command{
    TaskReceiver taskReceiver;

    public MediumPriorityCommand(TaskReceiver taskReceiver) {
        this.taskReceiver = taskReceiver;
    }

    @Override
    public void execute() {
        taskReceiver.handleMediumPriorityTask();
    }
}
