package com.astronity.app;

public class Human {
    public String name;
    public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
