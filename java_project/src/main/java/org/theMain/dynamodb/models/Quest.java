package org.theMain.dynamodb.models;

import org.theMain.enums.Difficulty;
import org.theMain.enums.Duration;
import org.theMain.util.DateRange;

import java.time.LocalDate;
import java.util.List;

public class Quest {
    private int questId;
    private String name;
    private List<Integer> tasks;
    private boolean completed;
    private Difficulty difficulty;
    private Duration duration;
    private DateRange dueDate;
    private LocalDate deadline;
    private Reward reward;

    public int getQuestId() {
        return questId;
    }

    public void setQuestId(int questId) {
        this.questId = questId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getTasks() {
        return tasks;
    }

    public void setTasks(List<Integer> tasks) {
        this.tasks = tasks;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
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

    public Reward getReward() {
        return reward;
    }

    public void setReward(Reward reward) {
        this.reward = reward;
    }
}
