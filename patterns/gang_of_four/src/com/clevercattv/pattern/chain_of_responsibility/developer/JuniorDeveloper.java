package com.clevercattv.pattern.chain_of_responsibility.developer;

import com.clevercattv.pattern.chain_of_responsibility.Feature;

public class JuniorDeveloper extends AbstractDeveloper {
    public JuniorDeveloper() {
        super(5);
    }

    @Override
    protected void release(Feature feature) {
        System.out.println("Made the feature after the first try and have no idea why the feature works...");
    }
}
