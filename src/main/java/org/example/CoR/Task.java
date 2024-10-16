package org.example.CoR;

public class Task {
    Priority priority;
    String description;

    public Task(String description){
        this.priority = Priority.LOW;
        this.description = description;
    }

    public Task(Priority priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public Priority getPriority() {return priority;}
    public String getDescription() {return description;}
    public void setPriority(Priority priority) {this.priority = priority;}
    public void setDescription(String description) {this.description = description;}
}
