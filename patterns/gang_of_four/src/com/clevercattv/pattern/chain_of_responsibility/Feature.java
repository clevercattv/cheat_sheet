package com.clevercattv.pattern.chain_of_responsibility;

public class Feature {
    private final int complexity;

    public Feature(int complexity) {
        this.complexity = complexity;
    }

    public int getComplexity() {
        return complexity;
    }
}
