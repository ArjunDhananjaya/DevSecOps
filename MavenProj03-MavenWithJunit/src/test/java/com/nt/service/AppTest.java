package com.nt.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
  
    @Test
    public void testSumWithPositives()
    {
    	int val1=10;
    	int val2=20;
    	int expected=30;
    	int actual=new App().sum(val1, val2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSumWithNegetives()
    {
    	int val1=-10;
    	int val2=-20;
    	int expected=-30;
    	int actual=new App().sum(val1, val2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSumWithMixedValue()
    {
    	int val1=-10;
    	int val2=20;
    	int expected=10;
    	int actual=new App().sum(val1, val2);
        assertEquals(expected, actual);
    }
    
    @Test
    @Ignore
    public void testSumWithZeros()
    {
    	int val1=0;
    	int val2=0;
    	int expected=0;
    	int actual=new App().sum(val1, val2);
        assertEquals(expected, actual);
    }
    
}
