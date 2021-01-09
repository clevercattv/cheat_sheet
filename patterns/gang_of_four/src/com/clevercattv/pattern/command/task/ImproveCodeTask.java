package com.clevercattv.pattern.command.task;

import com.clevercattv.pattern.command.staff.Developer;

public class ImproveCodeTask implements Task{
    Developer developer;

    public ImproveCodeTask(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void execute() {
        developer.improveCode();
    }
}
