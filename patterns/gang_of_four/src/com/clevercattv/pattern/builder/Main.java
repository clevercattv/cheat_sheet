package com.clevercattv.pattern.builder;

import com.clevercattv.pattern.builder.pizzeria.Pizza;
import com.clevercattv.pattern.builder.pizzeria.PizzaBuilder;
import com.clevercattv.pattern.builder.pizzeria.component.Fish;
import com.clevercattv.pattern.builder.pizzeria.component.Sausage;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(new Sausage(), null, new Fish(), null);
        System.out.println(pizza);

        Pizza pizzaUsingBuilder = new PizzaBuilder()
                .setSausage(new Sausage())
                .setFish(new Fish())
                .createPizza();
        System.out.println(pizzaUsingBuilder);
    }
}
