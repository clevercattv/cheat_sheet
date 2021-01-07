package com.clevercattv.pattern.abstract_factory.ui.ios;

import com.clevercattv.pattern.abstract_factory.ui.Button;

public class IosButton implements Button {
    @Override
    public void paint() {
        System.out.println("Paint ios button!");
    }
}
