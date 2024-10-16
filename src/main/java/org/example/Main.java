package org.example;

import org.example.CoR.Task;
import org.example.Command.*;
import org.example.Iterator.*;
import org.example.Mediator.*;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new TaskMediator();

        Command lowCommand = new LowPriorityCommand(mediator);
        Command mediumCommand = new MediumPriorityCommand(mediator);
        Command highCommand = new HighPriorityCommand(mediator);

        TaskInvoker invoker = new TaskInvoker();

        TaskList tasks = new TaskList();
        for(int i = 0; i < 10; i++) tasks.addTask(new Task((i + 1) + "task description"));

        TaskIterator lowIterator = tasks.iterator();
        invoker.setCommand(lowCommand);
        while(lowIterator.hasNext()){
            invoker.execute(lowIterator.next().getDescription());
        }

        TaskIterator mediumIterator = tasks.iterator();
        invoker.setCommand(mediumCommand);
        while(mediumIterator.hasNext()){
            invoker.execute(mediumIterator.next().getDescription());
        }

        TaskIterator highIterator = tasks.iterator();
        invoker.setCommand(highCommand);
        while(highIterator.hasNext()){
            invoker.execute(highIterator.next().getDescription());
        }
    }
}