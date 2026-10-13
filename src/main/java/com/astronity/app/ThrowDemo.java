package com.astronity.app;

public class ThrowDemo {
    static float div(float a, float b)
    {
        if (Float.isNaN(a) || Float.isNaN(b)) {
            throw new ArithmeticException("A or B is NaN");
        }
        return a / b;
    }

    static float div2(float a, float b) throws Exception
    {
        if (Float.isNaN(a) || Float.isNaN(b)) {
            throw new Exception("A or B is NaN");
        }
        return a / b;
    }

    public static void main(String[] args) {
//        System.out.println(div(Float.NaN,3));

        try {
            System.out.println(div(10,Float.NaN));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
