package com.clevercattv.pattern.abstract_factory.ui.ios;

import com.clevercattv.pattern.abstract_factory.ui.RadioButton;

public class IosRadioButton implements RadioButton {
    @Override
    public void paint() {
        System.out.println("Paint ios radio button!");
    }
}
