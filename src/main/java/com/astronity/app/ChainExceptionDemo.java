package com.astronity.app;

public class ChainExceptionDemo {
    static void process() throws Exception
    {
        Exception exception = new ArithmeticException("Custom Arithmetic Exception");
        exception.initCause(new Exception("Init Cause"));

        throw exception;
    }

    public static void main(String[] args) {
        try
        {
            process();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Caught Exception"+ e.getCause());
        }
    }
}
