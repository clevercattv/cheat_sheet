package com.clevercattv.pattern.composite.employee;

public interface Employee {
    int getTaskPerformingSpeed();
    boolean addSubordinate(Employee employee);
    boolean removeSubordinate(Employee employee);
}
