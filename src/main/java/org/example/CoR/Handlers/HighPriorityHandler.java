package org.example.CoR.Handlers;

import org.example.CoR.Priority;
import org.example.CoR.Task;

public class HighPriorityHandler extends Handler{
    @Override
    public void handle(Task task){
        if(task.getPriority().equals(Priority.HIGH)){
            System.out.println("High priority handler: " + task.getDescription());
        }else{
            super.handle(task);
        }
    }
}
