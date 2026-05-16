package org.danyal.workqueue.service;

import org.danyal.workqueue.model.Task;
import org.danyal.workqueue.model.TaskStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskServiceTest {

    private final TaskService service = new TaskService();

    @Test
    void createTask_setsStatusToTODO() {
        Task task = service.createTask("Buy milk", "2%");
        assertEquals(TaskStatus.TODO, task.getStatus());
    }
}