package org.example.Mediator;

import org.example.CoR.Handlers.*;
import org.example.CoR.Task;

public class TaskMediator implements Mediator{
    private Handler lowHandler;
    private Handler mediumHandler;
    private Handler highHandler;

    public TaskMediator(){
        lowHandler = new LowPriorityHandler();
        mediumHandler = new MediumPriorityHandler();
        highHandler = new HighPriorityHandler();

        lowHandler.setNext(mediumHandler);
        mediumHandler.setNext(highHandler);
    }

    @Override
    public void handleTask(Task task) {
        lowHandler.handle(task);
    }
}
