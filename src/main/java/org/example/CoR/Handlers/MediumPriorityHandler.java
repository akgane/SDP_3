package org.example.CoR.Handlers;

import org.example.CoR.Priority;
import org.example.CoR.Task;

public class MediumPriorityHandler extends Handler{
    @Override
    public void handle(Task task){
        if(task.getPriority().equals(Priority.MEDIUM)){
            System.out.println("Medium priority handler: " + task.getDescription());
        }else{
            super.handle(task);
        }
    }
}
