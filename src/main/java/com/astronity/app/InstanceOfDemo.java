package com.astronity.app;

import static java.lang.System.out;

public class InstanceOfDemo {
    public static void main(String[] args) {
        Human h = new Human("hi", 1);

        out.println("h instanceof Human "+ (h instanceof Human));
        out.println("h instanceof Object "+ (h instanceof Object));
    }
}
