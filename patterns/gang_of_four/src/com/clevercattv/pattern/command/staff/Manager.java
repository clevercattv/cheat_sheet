package com.clevercattv.pattern.command.staff;

import com.clevercattv.pattern.command.task.Task;

// invoker
public class Manager {

    public void createTaskForDeveloper(Task task) {
        System.out.println("Manager give developer task: ");
        task.execute();
    }

}
