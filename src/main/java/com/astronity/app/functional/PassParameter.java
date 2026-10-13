package com.astronity.app.functional;

public class PassParameter {
    void hello()
    {
        System.out.println("hello");

    }

    public static void main(String[] args) {
        PassParameter p = new PassParameter();

        Action act = p::hello;
        act.run();
    }
}
