package com.clevercattv.pattern.composite.employee;

import java.util.ArrayList;
import java.util.List;

public class AbstractEmployee implements Employee {

    private int taskPerformingSpeed;
    private List<Employee> subordinates = new ArrayList<>();

    public AbstractEmployee(int taskPerformingSpeed) {
        this.taskPerformingSpeed = taskPerformingSpeed;
    }

    @Override
    public int getTaskPerformingSpeed() {
        int subordinatesSpeed = subordinates.stream()
                .mapToInt(Employee::getTaskPerformingSpeed)
                .sum();
        return taskPerformingSpeed + subordinatesSpeed;
    }

    @Override
    public boolean addSubordinate(Employee employee) {
        return subordinates.add(employee);
    }

    @Override
    public boolean removeSubordinate(Employee employee) {
        return subordinates.remove(employee);
    }
}
