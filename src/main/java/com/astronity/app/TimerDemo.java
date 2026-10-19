package com.astronity.app;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask {
    @Override
    public void run() {
        Date d = new Date();
        System.out.println("MyTask executed "+ d);
    }
}

public class TimerDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();
        MyTask task = new MyTask();

        timer.schedule(task, 1000, 3000);
        System.out.println("Start");
    }
}
