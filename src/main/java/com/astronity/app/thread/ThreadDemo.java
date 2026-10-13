package com.astronity.app.thread;

class CounterThread extends Thread {
    String name;
    CounterThread(String name) {
        super(name);
        this.name = name;
    }
    public void run()
    {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread "+this.name +" i==> "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        CounterThread t1 = new CounterThread("One");
        CounterThread t2 = new CounterThread("Two");
        CounterThread t3 = new CounterThread("Three");

        t1.start();
        t2.start();
        t3.start();
    }
}
