package org.theMain.dynamodb.models;

import org.theMain.enums.Difficulty;
import org.theMain.enums.Frequency;
import org.theMain.util.DateRange;

import java.time.LocalDate;

public class Task {
    private int taskId;
    private String name;
    private String description;
    private Difficulty difficulty;
    private int completed;
    private Frequency frequency;
    private DateRange dueDate;
    private LocalDate deadline;
    private int rewardId;
}
