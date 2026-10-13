package com.astronity.app.thread;

public class IncThread extends Thread {
    String name;
    Data data;

    public IncThread(String name, Data data) {
        this.name = name;
        this.data = data;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            this.data.value++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
