package com.clevercattv.pattern.command;

import com.clevercattv.pattern.command.staff.Developer;
import com.clevercattv.pattern.command.staff.Manager;
import com.clevercattv.pattern.command.task.DrinkCoffeeTask;
import com.clevercattv.pattern.command.task.ImproveCodeTask;
import com.clevercattv.pattern.command.task.MakeFeatureTask;
import com.clevercattv.pattern.command.task.Task;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Developer developer = new Developer();

        Task drinkCoffeeTask = new DrinkCoffeeTask(developer);
        Task makeFeatureTask = new MakeFeatureTask(developer);
        Task improveCodeTask = new ImproveCodeTask(developer);

        manager.createTaskForDeveloper(drinkCoffeeTask);
        manager.createTaskForDeveloper(makeFeatureTask);
        manager.createTaskForDeveloper(improveCodeTask);
        manager.createTaskForDeveloper(drinkCoffeeTask);
    }
}
