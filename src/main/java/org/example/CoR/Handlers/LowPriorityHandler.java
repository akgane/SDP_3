package org.example.CoR.Handlers;

import org.example.CoR.Priority;
import org.example.CoR.Task;

public class LowPriorityHandler extends Handler{
    @Override
    public void handle(Task task){
        if(task.getPriority().equals(Priority.LOW)){
            System.out.println("Low priority handler: " + task.getDescription());
        }else{
            super.handle(task);
        }
    }
}
