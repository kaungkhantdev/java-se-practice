package com.astronity.app;

public class Superman extends Human{
    public Superman(String name, int age){
        super(name,age);
    }

    public void show() {
        System.out.println("Name "+this.age);
        System.out.println("Phone "+this.name);
    }
}
