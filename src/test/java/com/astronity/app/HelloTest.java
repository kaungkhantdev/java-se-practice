package com.astronity.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void shouldReturnHello()
    {
        Hello hello = new Hello();

        String result = hello.action();

        assertEquals("Hello", result);
    }
}
