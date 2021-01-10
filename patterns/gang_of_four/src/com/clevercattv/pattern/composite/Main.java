package com.clevercattv.pattern.composite;

import com.clevercattv.pattern.composite.employee.*;

import java.util.Arrays;

public class Main {
    // unrealistic example
    // The trainee can have senior as subordinate and some other little inconsistencies..
    public static void main(String[] args) {
        Employee trainee = new TraineeEmployee(2);
        Employee trainee1 = new TraineeEmployee(2);
        Employee trainee2 = new TraineeEmployee(2);

        Employee junior = new JuniorEmployee(3);
        Employee junior1 = new JuniorEmployee(3);
        Employee junior2 = new JuniorEmployee(3);

        Employee middle = new MiddleEmployee(4);
        Employee middle1 = new MiddleEmployee(4);
        Employee middle2 = new MiddleEmployee(4);

        Employee senior = new SeniorEmployee(5);
        Employee senior1 = new SeniorEmployee(5);
        Employee senior2 = new SeniorEmployee(5);

        Employee manager = new ManagerEmployee(0);

        senior.addSubordinate(trainee);
        senior1.addSubordinate(trainee1);
        senior2.addSubordinate(trainee2);

        senior.addSubordinate(middle);
        senior1.addSubordinate(middle1);
        senior2.addSubordinate(middle2);

        middle.addSubordinate(junior);
        middle1.addSubordinate(junior1);
        middle1.addSubordinate(junior2);

        Arrays.asList(senior, senior1, senior2).forEach(manager::addSubordinate);

        System.out.println(manager.getTaskPerformingSpeed());
    }
}
