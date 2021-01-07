package com.clevercattv.pattern.abstract_factory;

import com.clevercattv.pattern.abstract_factory.factory.WidgetFactory;
import com.clevercattv.pattern.abstract_factory.ui.Widget;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        paintAllWidgets(WidgetFactory.newInstance(WidgetFactory.Type.ANDROID));
        System.out.println("==============================================");
        paintAllWidgets(WidgetFactory.newInstance(WidgetFactory.Type.IOS));
    }

    private static void paintAllWidgets(WidgetFactory widgetFactory) {
        Arrays.asList(
                widgetFactory.createButton(),
                widgetFactory.createRadioButton(),
                widgetFactory.createCheckbox()
        ).forEach(Widget::paint);
    }

}
