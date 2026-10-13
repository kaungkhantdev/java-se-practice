package com.astronity.app;

public class FloatDemo {
    public static void main(String[] args) {
        float f = 13.4F;
        System.out.println("f = " + f);

        double d = 13.4;
        System.out.println("d = " + d);

        f = 33;
        System.out.println("f = " + f);

        double result = 3.2 - 1.2;
        System.out.println("result = " + result);

        f = 1.0F/0;
        System.out.println("f = " + f);

        float posZero = 0;
        float negZero = -0;
        System.out.println("posZero = " + posZero);
        System.out.println("negZero = " + negZero);

        result = 1/posZero;
        System.out.println("result = " + result);

        result = 1/negZero;
        System.out.println("result = " + result);

        result = 0/0.0F;
        System.out.println("result = " + result);
    }
}
