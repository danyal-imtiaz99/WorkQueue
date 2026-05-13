package org.danyal.workqueue.model;

import java.time.Instant;

public class Main {

    public static void main(String[] args){
        Task task = new Task(1L, "Workout", "Chest and Arms", TaskStatus.TODO, Instant.now(), Instant.now());
        System.out.println(task);
    }
}
