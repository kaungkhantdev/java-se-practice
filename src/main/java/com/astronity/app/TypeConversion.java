package com.astronity.app;

public class TypeConversion {
    public static void main(String[] args) {
        int source = 10;
        long dest;

        float d = source;

        dest = source;
//        System.out.println(d);
//        System.out.println(dest);

        source = (int) dest;
        d = dest;

        byte b = 10;

        b = (byte)(b + 1);
        System.out.println("B "+b);

    }
}
