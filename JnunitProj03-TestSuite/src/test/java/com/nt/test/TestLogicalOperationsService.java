package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.nt.service.LogicalOperationsService;

public class TestLogicalOperationsService {
   private static  LogicalOperationsService service;
   
   @BeforeAll
    public static void  setUp() {
    	service=new LogicalOperationsService();
    }
   
   @Test
   public void  testIsPosiviteWithPositive() {
	   assertTrue(service.isPositive(100));
   }
   
   @Test
   public void  testIsPosiviteWithNegetive() {
	   assertFalse(service.isPositive(-100));
   }
   
   @Test
   public void  testIsNullWithObject() {
	   assertFalse(service.isNull(new Date()));
   }
   
   @Test
   public void  testIsNullWithNull() {
	     Date d=null;
	   assertTrue(service.isNull(d));
   }
   
   
   @AfterAll
   public static void tearDown() {
	   service=null;
   }
	
}
