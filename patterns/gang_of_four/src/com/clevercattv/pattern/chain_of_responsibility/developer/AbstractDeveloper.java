package com.clevercattv.pattern.chain_of_responsibility.developer;

import com.clevercattv.pattern.chain_of_responsibility.Feature;

import java.util.Objects;

public abstract class AbstractDeveloper {
    protected int knowledgeLevel;
    protected AbstractDeveloper nextDeveloper;

    public AbstractDeveloper(int knowledgeLevel) {
        this.knowledgeLevel = knowledgeLevel;
    }

    public void releaseFeature(Feature feature) {
        // for the truth, first of all I'm ask stack overflow..
        if (knowledgeLevel >= feature.getComplexity()) {
            release(feature);
        } else if (Objects.nonNull(nextDeveloper)) {
            nextDeveloper.releaseFeature(feature);
        } else {
            System.out.println("OH NO! https://i.ytimg.com/vi/TDR1hVsnPIg/maxresdefault.jpg");
        }
    }

    protected abstract void release(Feature feature);

    public void setKnowledgeLevel(int knowledgeLevel) {
        this.knowledgeLevel = knowledgeLevel;
    }

    public void setNextDeveloper(AbstractDeveloper nextDeveloper) {
        this.nextDeveloper = nextDeveloper;
    }
}
