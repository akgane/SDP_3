package org.example.CoR;

import org.example.CoR.Handlers.*;

import java.util.ArrayList;
import java.util.List;

public class CoR {
    public void showcase(){
        Handler lowPriorityHandler = new LowPriorityHandler();
        Handler mediumPriorityHandler = new MediumPriorityHandler();
        Handler highPriorityHandler = new HighPriorityHandler();

        lowPriorityHandler.setNext(mediumPriorityHandler);
        mediumPriorityHandler.setNext(highPriorityHandler);

        List<Task> tasks = new ArrayList<Task>();

        tasks.add(new Task("low1 task description"));
        tasks.add(new Task("low2 task description"));
        tasks.add(new Task(Priority.MEDIUM, "medium1 task description"));
        tasks.add(new Task(Priority.MEDIUM, "medium2 task description"));
        tasks.add(new Task(Priority.HIGH, "high1 task description"));
        tasks.add(new Task(Priority.HIGH, "high2 task description"));

        for(Task task : tasks) lowPriorityHandler.handle(task);
    }
}
