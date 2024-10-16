package org.example.Command;


import org.example.CoR.Priority;
import org.example.CoR.Task;
import org.example.Mediator.Mediator;

public class MediumPriorityCommand implements Command{
    Mediator mediator;

    public MediumPriorityCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute(String taskDesc) {
        mediator.handleTask(new Task(Priority.MEDIUM, taskDesc));
    }
}
