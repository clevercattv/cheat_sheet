package com.clevercattv.pattern.command.task;

import com.clevercattv.pattern.command.staff.Developer;

public class MakeFeatureTask implements Task{
    Developer developer;

    public MakeFeatureTask(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void execute() {
        developer.makeFeature();
    }
}
