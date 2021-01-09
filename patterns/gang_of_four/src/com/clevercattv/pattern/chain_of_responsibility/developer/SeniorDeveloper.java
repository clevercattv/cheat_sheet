package com.clevercattv.pattern.chain_of_responsibility.developer;

import com.clevercattv.pattern.chain_of_responsibility.Feature;

public class SeniorDeveloper extends AbstractDeveloper {

    public SeniorDeveloper() {
        super(9);
    }

    @Override
    protected void release(Feature feature) {
        System.out.println("Made the feature after analyzing all input info!");
    }
}
