package org.danyal.workqueue.service;

import org.danyal.workqueue.exception.TaskNotFoundException;
import org.danyal.workqueue.model.Task;
import org.danyal.workqueue.model.TaskStatus;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    public List<Task> listTasks(){
        return new ArrayList<>(tasks.values());
    }
    public Task getTaskById(Long id){
        Task task = tasks.get(id);
        if(task == null){
            throw new TaskNotFoundException(id);
        }package org.danyal.workqueue.service;

import org.danyal.workqueue.exception.TaskNotFoundException;
import org.danyal.workqueue.model.Task;
import org.danyal.workqueue.model.TaskStatus;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
            public List<Task> listTasks(){
                return new ArrayList<>(tasks.values());
            }
            public Task getTaskById(Long id){
                Task task = tasks.get(id);
                if(task == null){
                    throw new TaskNotFoundException(id);
                }
                return task;
            }
            public Task markComplete(Long id){
                Task task = getTaskById(id);
                task.setStatus(TaskStatus.DONE);
                task.setUpdatedAt(Instant.now());
                return task;
            }
        }

        return task;
    }
    public Task markComplete(Long id){
        Task task = getTaskById(id);
        task.setStatus(TaskStatus.DONE);
        task.setUpdatedAt(Instant.now());
        return task;
    }
}
