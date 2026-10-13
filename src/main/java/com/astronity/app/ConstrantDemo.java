package com.astronity.app;

interface Size {
    int Small = 0;
    int Medium = 1;
    int Large = 2;
}
public class ConstrantDemo {
    public static void main(String[] args) {
        System.out.println("Hello World" + Size.Small);
    }
}
