package com.astronity.app;

class Window95 {
    void internalApi()
    {
        System.out.println("Internal Api");
    }
    private void privateApi()
    {
        System.out.println("Private Api");
    }
    void start()
    {
        System.out.println("Start");
    }
    void shutdown()
    {
        System.out.println("Shutdown");
    }
}

class Window2000 extends Window95 {
    void screenSaver()
    {
        System.out.println("ScreenSaver");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Window2000 window2000 = new Window2000();
        window2000.internalApi();
        window2000.start();
        window2000.shutdown();
        window2000.screenSaver();
    }
}
