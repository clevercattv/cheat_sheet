package com.clevercattv.pattern.abstract_factory.factory;

import com.clevercattv.pattern.abstract_factory.ui.Button;
import com.clevercattv.pattern.abstract_factory.ui.Checkbox;
import com.clevercattv.pattern.abstract_factory.ui.RadioButton;
import com.clevercattv.pattern.abstract_factory.ui.ios.IosButton;
import com.clevercattv.pattern.abstract_factory.ui.ios.IosCheckbox;
import com.clevercattv.pattern.abstract_factory.ui.ios.IosRadioButton;

public class IosWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public RadioButton createRadioButton() {
        return new IosRadioButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new IosCheckbox();
    }
}
