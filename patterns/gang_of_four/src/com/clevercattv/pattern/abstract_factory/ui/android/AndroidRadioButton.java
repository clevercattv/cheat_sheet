package com.clevercattv.pattern.abstract_factory.ui.android;

import com.clevercattv.pattern.abstract_factory.ui.RadioButton;

public class AndroidRadioButton implements RadioButton {
    @Override
    public void paint() {
        System.out.println("Paint android radio button!");
    }
}
