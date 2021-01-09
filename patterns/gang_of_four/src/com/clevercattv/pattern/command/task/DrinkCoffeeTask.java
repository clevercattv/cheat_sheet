package com.clevercattv.pattern.command.task;

import com.clevercattv.pattern.command.staff.Developer;

public class DrinkCoffeeTask implements Task{
    Developer developer;

    public DrinkCoffeeTask(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void execute() {
        developer.drinkCoffee();
    }
}
