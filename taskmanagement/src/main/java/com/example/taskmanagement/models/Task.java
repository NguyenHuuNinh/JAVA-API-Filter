package com.example.taskmanagement.models;

public class Task {
    private int id;
    private String title;
    private String description;
    private String priority;
    private int assignedTo;

    public Task(int id, String title, String description, String priority, int assignedTo) {
        this.id = id; this.title = title; this.description = description; this.priority = priority; this.assignedTo = assignedTo;
    }
    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }
    public int getAssignedTo() { return assignedTo; }
    public void setAssignedTo(int assignedTo) { this.assignedTo = assignedTo; }
}