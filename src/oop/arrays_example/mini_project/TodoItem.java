package oop.arrays_example.mini_project;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TodoItem {
    private static long nextId = 1;
    private final long id;
    private String title;
    private final LocalDateTime createdAt = LocalDateTime.now();
    private LocalDate dueDate;
    private boolean completed;
    private TodoImportance importance = TodoImportance.LOW;

    public TodoItem(String title) {
        this(title, null, TodoImportance.LOW);
    }

    public TodoItem(String title, LocalDate dueDate) {
        this(title, dueDate, TodoImportance.LOW);
    }

    public TodoItem(String title, LocalDate dueDate, TodoImportance importance) {
        this.title = title;
        this.dueDate = dueDate;
        this.importance = importance;
        this.id = nextId++;
    }

    public TodoItem(String title, TodoImportance importance) {
        this(title, null, importance);
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public TodoImportance getImportance() {
        return importance;
    }

    public void setImportance(TodoImportance importance) {
        this.importance = importance;
    }

    public void changeStatus() {
        this.completed = !this.completed;
    }

    public void print() {
        System.out.printf("%3d. %s | DueDate: %s | Completed: %s | Importance: %s\n",
                id, title, dueDate == null ? "N/A" : dueDate,
                completed ? "✅" : "❌", importance
        );
    }

    @Override
    public String toString() {
        return String.format("%d;%s;%s;%s;%b;%s", id, title, createdAt, dueDate, completed, importance);
    }
}






