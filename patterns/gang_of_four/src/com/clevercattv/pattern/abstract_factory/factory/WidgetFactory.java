package com.clevercattv.pattern.abstract_factory.factory;

import com.clevercattv.pattern.abstract_factory.ui.Button;
import com.clevercattv.pattern.abstract_factory.ui.Checkbox;
import com.clevercattv.pattern.abstract_factory.ui.RadioButton;

public interface WidgetFactory {
    Button createButton();
    RadioButton createRadioButton();
    Checkbox createCheckbox();

    enum Type {
        ANDROID,
        IOS,
    }

    static WidgetFactory newInstance(Type type) {
        switch (type) {
            case ANDROID:
                return new AndroidWidgetFactory();
            case IOS:
                return new IosWidgetFactory();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
