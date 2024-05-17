package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.nt.service.ArthmeticOperations;

public class TestArthmeticOperations {
	private static ArthmeticOperations  ar;
	
	@BeforeAll
	public static  void   setup() {
		System.out.println("TestArthmeticOperations.setup()");
		ar=new ArthmeticOperations();
	}
	
	@Test
	public   void testSumWithPositives() {
		System.out.println("TestArthmeticOperations.testSumWithPositives()");
		int val1=10;
		int val2=20;
		int expected=30;
		int actual=ar.sum(val1, val2);
		assertEquals(expected, actual);
	}
	
	@Test
	public   void testSumWithNegatives() {
		System.out.println("TestArthmeticOperations.testSumWithNegatives()");
		int val1=-10;
		int val2=-20;
		int expected=-30;
		int actual=ar.sum(val1, val2);
		assertEquals(expected, actual);
	}
	
	@Test
	public   void testSumWithZeros() {
		System.out.println("TestArthmeticOperations.testSumWithZeros()");
		int val1=0;
		int val2=0;
		int expected=0;
		int actual=ar.sum(val1, val2);
		assertEquals(expected, actual);
	}
	
	@Test
	@Disabled
	public   void testSumWithMixedValues() {
		System.out.println("TestArthmeticOperations.testSumWithMixedValues()");
		int val1=10;
		int val2=-20;
		int expected=-10;
		int actual=ar.sum(val1, val2);
		assertEquals(expected, actual);
	}
	
	@AfterAll
	public static void  tearDown() {
		System.out.println("TestArthmeticOperations.tearDown()");
		ar=null;
	}
	

}
