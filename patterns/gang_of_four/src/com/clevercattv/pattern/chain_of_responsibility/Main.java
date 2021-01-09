package com.clevercattv.pattern.chain_of_responsibility;

import com.clevercattv.pattern.chain_of_responsibility.developer.AbstractDeveloper;
import com.clevercattv.pattern.chain_of_responsibility.developer.JuniorDeveloper;
import com.clevercattv.pattern.chain_of_responsibility.developer.MiddleDeveloper;
import com.clevercattv.pattern.chain_of_responsibility.developer.SeniorDeveloper;

public class Main {
    public static void main(String[] args) {
        AbstractDeveloper juniorDeveloper = new JuniorDeveloper();
        AbstractDeveloper middleDeveloper = new MiddleDeveloper();
        AbstractDeveloper seniorDeveloper = new SeniorDeveloper();

        juniorDeveloper.setNextDeveloper(middleDeveloper);
        middleDeveloper.setNextDeveloper(seniorDeveloper);

        juniorDeveloper.releaseFeature(new Feature(5));
        juniorDeveloper.releaseFeature(new Feature(7));
        juniorDeveloper.releaseFeature(new Feature(9));
    }
}
