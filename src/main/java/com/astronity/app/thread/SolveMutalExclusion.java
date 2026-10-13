package com.astronity.app.thread;

public class SolveMutalExclusion {
    public static void main(String[] args) {
        Data data = new Data();

        SolveMutalIncThread t1 = new SolveMutalIncThread("one", data);
        SolveMutalIncThread t2 = new SolveMutalIncThread("two", data);
        SolveMutalIncThread t3 = new SolveMutalIncThread("three", data);

        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();

            System.out.println("Data.value  "+data.value);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}