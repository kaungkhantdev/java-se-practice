package com.astronity.app.functional;

public class LambdaDemo {
    void process()
    {
        System.out.println("Process");
    }
    static void hello()
    {
        System.out.println("Hello");
    }
    static void hi()
    {
        System.out.println("hi");
    }
    static int getData()
    {
        return 100;
    }

    public static void main(String[] args) {
        Action act = LambdaDemo::hello;
        act.run();

        act =  LambdaDemo::hi;
        act.run();

        LambdaDemo lambdaDemo = new LambdaDemo();
        act = lambdaDemo::process;
        act.run();

        act = () -> System.out.println("HELLO");
        act.run();

        act = () -> {
            System.out.println("HELLO");
            System.out.println("HI");
        };
        act.run();
    }
}
