package com.clevercattv.pattern.factory;

import com.clevercattv.pattern.factory.task.Task;

public class Developer {

    private int knowledgeLevel;

    public Developer(int knowledgeLevel) {
        this.knowledgeLevel = knowledgeLevel;
    }

    public void implementNextTask() {
        System.out.printf("The developer with knowledge level %d ask for task.%n", knowledgeLevel);
        Task task = TaskFactory.getInstance(knowledgeLevel);
        System.out.printf("The developer get a %s and implements it!%n%n", task.getClass().getSimpleName());
    }

}
