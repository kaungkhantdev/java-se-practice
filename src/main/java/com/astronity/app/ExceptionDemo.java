package com.astronity.app;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            String str = "hi";
            System.out.println("String "+str.toUpperCase());

            int result = 5/0;
            System.out.println("Result "+result);



        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception" + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointer Exception" + e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
