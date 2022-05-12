package com.ncu.calc_interface.calculator_interface;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	Calculator calc = new Calculator();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAdd()
    {
    	String expr = "1+2+3+4+5";
    	int sum = calc.sum(expr);
        int expectedResult = 15;
        assertEquals(expectedResult,sum);
    }
    public void testSub()
    {
    	String expr = "1-2-3-4-5";
    	int sub = calc.sub(expr);
        int expectedResult = -15;
        assertEquals(expectedResult,sub);
    }
    public void testmul()
    {
    	String expr = "4*5";
    	int mul = calc.sum(expr);
        int expectedResult = 20;
        assertEquals(expectedResult,mul);
    }
    public void testDiv()
    {
    	String expr = "10/2";
    	int sum = calc.sum(expr);
        int expectedResult = 5;
        assertEquals(expectedResult,sum);
    }
}
