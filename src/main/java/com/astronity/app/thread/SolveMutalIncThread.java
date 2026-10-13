package com.astronity.app.thread;

public class SolveMutalIncThread extends Thread {
    String name;
    Data data;

    public SolveMutalIncThread(String name, Data data) {
        this.name = name;
        this.data = data;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized(this.data)
            {
                this.data.value++;
            }
        }
    }
}
