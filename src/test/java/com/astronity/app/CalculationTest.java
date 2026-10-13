package com.astronity.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculationTest {
    @Test
    public void testCalculation()
    {
        Calculation calculation = new Calculation();
    }

    @Test
    public void testAdd()
    {
        Calculation calculation = new Calculation();

        Integer a = 1;
        Integer b = 2;

        Integer result = calculation.sum(a,b);
        assertEquals(Integer.valueOf(3), result);
    }

    @Test
    public void testSub()
    {
        Calculation calculation = new Calculation();

        int a = 3;
        int b = 2;

        int result = calculation.sub(a,b);

        assertEquals(1, result);
    }
}
