package com.astronity.app;

import java.util.ListResourceBundle;

public class SimpleRB extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][] {
                {"Title", "My Program - Main"},
                {"Stop Text", "Stop"}
        };
    }
}
