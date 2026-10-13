package com.astronity.app;

interface Action {
    private void internalApi() {
        System.out.println("Internal API");
    }

    default void action() {
        System.out.println("Action Default Method");
        internalApi();
    }

    static void staticMethod() {
        System.out.println("Static Method");
    }
}

class Something implements Action {}

public class DefaultMethodDemo {
    public static void main(String[] args) {
        Something obj = new Something();
        obj.action();

        Action.staticMethod();
    }
}
