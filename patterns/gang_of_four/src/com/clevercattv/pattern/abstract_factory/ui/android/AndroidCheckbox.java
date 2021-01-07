package com.clevercattv.pattern.abstract_factory.ui.android;

import com.clevercattv.pattern.abstract_factory.ui.Checkbox;

public class AndroidCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Paint android checkbox!");
    }
}
