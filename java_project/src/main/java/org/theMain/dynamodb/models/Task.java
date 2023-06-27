package org.theMain.dynamodb.models;

import org.theMain.enums.Difficulty;
import org.theMain.util.DateRange;

import java.time.LocalDate;

public class Task {
    private int taskId;
    private String name;
    private String description;
    private Difficulty difficulty;
    private DateRange dueDate;
    private LocalDate deadline;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public DateRange getDueDate() {
        return dueDate;
    }

    public void setDueDate(DateRange dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
