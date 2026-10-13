package com.astronity.app;

public class OverLoadDemo {
    void println(short n){
        System.out.println("short version ");
        System.out.println(n);
    }

    void  println(int n){
        System.out.println("int version ");
        System.out.println(n);
    }
    void  println(long n){
        System.out.println("long version ");
        System.out.println(n);
    }

    void  println(double n){
        System.out.println("double version ");
        System.out.println(n);
    }

    void println(String n){
        System.out.println("String version ");
        System.out.println(n);
    }

    public static void main(String[] args) {
        byte b= 10;
        OverLoadDemo demo = new OverLoadDemo();
        demo.println(10);
        demo.println(b+1);
        demo.println("Hello");
    }
}
