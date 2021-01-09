package com.clevercattv.pattern.command.task;

// manager talk with developer using jira tasks
@FunctionalInterface
public interface Task {
    void execute();
}
