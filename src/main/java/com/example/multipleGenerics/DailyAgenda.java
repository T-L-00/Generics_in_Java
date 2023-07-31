package com.example.multipleGenerics;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Represents a daily agenda with high and low priority tasks.
 *
 * @param <T> The type of task.
 */
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class DailyAgenda<T> {
    private List<T> highPriorityTasks;
    private List<T> lowPriorityTasks;

    public List<T> getHighPriorityTasks() {
        return highPriorityTasks;
    }

    public List<T> getLowPriorityTasks() {
        return lowPriorityTasks;
    }
}
