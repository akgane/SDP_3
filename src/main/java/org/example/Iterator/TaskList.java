package org.example.Iterator;

import org.example.CoR.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }
    public TaskIterator iterator() {
        return new TaskListIterator(tasks);
    }
}
