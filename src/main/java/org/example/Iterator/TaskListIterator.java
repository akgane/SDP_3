package org.example.Iterator;

import org.example.CoR.Task;

import java.util.List;

public class TaskListIterator implements TaskIterator {
    List<Task> tasks;
    int pos = 0;

    public TaskListIterator(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean hasNext() {
        return pos < tasks.size();
    }

    @Override
    public Task next() {
        if(hasNext()){
            return tasks.get(pos++);
        }
        return null;
    }
}
