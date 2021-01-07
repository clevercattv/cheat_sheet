package com.clevercattv.pattern.abstract_factory.factory;

import com.clevercattv.pattern.abstract_factory.ui.Button;
import com.clevercattv.pattern.abstract_factory.ui.Checkbox;
import com.clevercattv.pattern.abstract_factory.ui.RadioButton;
import com.clevercattv.pattern.abstract_factory.ui.android.AndroidButton;
import com.clevercattv.pattern.abstract_factory.ui.android.AndroidCheckbox;
import com.clevercattv.pattern.abstract_factory.ui.android.AndroidRadioButton;

public class AndroidWidgetFactory implements WidgetFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public RadioButton createRadioButton() {
        return new AndroidRadioButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new AndroidCheckbox();
    }
}
