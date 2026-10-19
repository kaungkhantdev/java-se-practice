package com.astronity.app;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("com.astronity.app.SimpleRB", locale);
        System.out.println("Title "+ rb.getString("Title"));
    }
}
