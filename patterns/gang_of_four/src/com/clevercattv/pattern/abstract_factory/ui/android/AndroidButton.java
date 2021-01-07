package com.clevercattv.pattern.abstract_factory.ui.android;

import com.clevercattv.pattern.abstract_factory.ui.Button;

public class AndroidButton implements Button {
    @Override
    public void paint() {
        System.out.println("Paint android button!");
    }
}
