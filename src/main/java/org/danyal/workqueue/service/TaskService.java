package org.danyal.workqueue.service;

import org.danyal.workqueue.model.Task;
import org.danyal.workqueue.model.TaskStatus;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class TaskService {
    private final Map<Long, Task> tasks = new HashMap<>();
    private long idCounter = 0;

    public Task createTask(String title, String description){
        Task task = new Task(idCounter, title, description, TaskStatus.TODO, Instant.now(), Instant.now());
        tasks.put(idCounter, task);
        idCounter++;
        return task;
    }
}
