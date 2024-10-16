package org.example.Command;

import org.example.CoR.Priority;
import org.example.CoR.Task;
import org.example.Mediator.Mediator;

public class LowPriorityCommand implements Command {
    Mediator mediator;

    public LowPriorityCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute(String taskDesc) {
        mediator.handleTask(new Task(Priority.LOW, taskDesc));
    }
}
