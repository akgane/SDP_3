package org.example.CoR.Handlers;

import org.example.CoR.Task;

public abstract class Handler {
    private Handler nextHandler;

    public void handle(Task task){
        if(nextHandler != null){
            nextHandler.handle(task);
        }
    }

    public Handler setNext(Handler handler){
        nextHandler = handler;
        return handler;
    }
}
