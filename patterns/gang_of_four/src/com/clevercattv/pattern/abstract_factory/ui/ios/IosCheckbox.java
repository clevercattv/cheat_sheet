package com.clevercattv.pattern.abstract_factory.ui.ios;

import com.clevercattv.pattern.abstract_factory.ui.Checkbox;

public class IosCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Paint ios checkbox!");
    }
}
