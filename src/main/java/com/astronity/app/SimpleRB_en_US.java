package com.astronity.app;

import java.util.ListResourceBundle;

public class SimpleRB_en_US extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][] {
                {"Title", "My Program - En US"},
                {"Stop Text", "Stop"}
        };
    }
}
