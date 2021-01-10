package com.clevercattv.pattern.factory;

public class Main {
    public static void main(String[] args) {
        Developer junior = new Developer(4);
        Developer middle = new Developer(8);
        Developer senior = new Developer(12);

        junior.implementNextTask();
        middle.implementNextTask();
        senior.implementNextTask();
    }
}
