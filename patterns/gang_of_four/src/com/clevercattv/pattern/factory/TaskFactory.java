package com.clevercattv.pattern.factory;

import com.clevercattv.pattern.factory.task.EasyTask;
import com.clevercattv.pattern.factory.task.HardTask;
import com.clevercattv.pattern.factory.task.MediumTask;
import com.clevercattv.pattern.factory.task.Task;

public class TaskFactory {
    // For factory often use if-else, switch case or enum.
    public static Task getInstance(int complexity) {
        if (complexity > 10) {
            return new HardTask();
        } else if (complexity > 7) {
            return new MediumTask();
        } else {
            return new EasyTask();
        }
    }
}
