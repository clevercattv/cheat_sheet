package com.clevercattv.pattern.builder.pizzeria;

import com.clevercattv.pattern.builder.pizzeria.component.*;

public class Pizza {
    private final Sausage sausage;
    private final Cheese cheese;
    private final Fish fish;
    private final Banana banana;

    public Pizza(Sausage sausage, Cheese cheese, Fish fish, Banana banana) {
        this.sausage = sausage;
        this.cheese = cheese;
        this.fish = fish;
        this.banana = banana;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "sausage=" + sausage +
                ", cheese=" + cheese +
                ", fish=" + fish +
                ", banana=" + banana +
                '}';
    }
}
