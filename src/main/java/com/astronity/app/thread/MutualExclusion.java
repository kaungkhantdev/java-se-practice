package com.astronity.app.thread;

public class MutualExclusion {
    public static void main(String[] args) {
        Data data = new Data();

        IncThread t1 = new IncThread("one", data);
        IncThread t2 = new IncThread("two", data);
        IncThread t3 = new IncThread("three", data);

        t1.start();
        t2.start();
        t3.start();
        System.out.println("Data.value  "+data.value);

    }
}
