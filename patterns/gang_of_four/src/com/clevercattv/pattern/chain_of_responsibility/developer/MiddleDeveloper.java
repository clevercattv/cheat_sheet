package com.clevercattv.pattern.chain_of_responsibility.developer;

import com.clevercattv.pattern.chain_of_responsibility.Feature;

public class MiddleDeveloper extends AbstractDeveloper {
    public MiddleDeveloper() {
        super(7);
    }

    @Override
    protected void release(Feature feature) {
        System.out.println("Made the feature after some thinking!");
    }
}
