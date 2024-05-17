package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.nt.service.BankOperationsService;

@DisplayName("Bank Class for Testing")
//@TestMethodOrder(OrderAnnotation.class)
//@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.DisplayName.class)
@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.MethodName.class)
class TestBankOperationsService {
    private static BankOperationsService  service;
    
    @BeforeAll
    public static void  setUp() {
    	System.out.println("TestBankOperationsService.setUp()");
    	 service=new BankOperationsService();
    }
    
    @BeforeEach
    public  void setUpEach() {
    	System.out.println("TestBankOperationsService.setUpEach()");
    }
    
    @Test
    @DisplayName("Test with BigValues")
    @Tag("test")
    @Order(10)
    public void  testCaluculateSimpleIntrestAmountWithBigValues() {
    	System.out.println("TestBankOperationsService.testCaluculateSimpleIntrestAmountWithBigValues()");
    	float  expected=2400000.0f;
    	float  actual=service.calculateSimpleIntrestAmount(10000000.0f, 2.0f, 12.0f);
    	assertEquals(expected, actual,1.0f);
    }
    
    @Test
    @DisplayName("0Test with SmallValues")
    @Tag("test")
    @Order(1)
    public void  testCaluculateSimpleIntrestAmountWithSmallValues() {
    	System.out.println("TestBankOperationsService.testCaluculateSimpleIntrestAmountWithSmallValues()");
    	float  expected=24000.0f;
    	float  actual=service.calculateSimpleIntrestAmount(100000.0f, 2.0f, 12.0f);
    	assertEquals(expected, actual,0.5f);
    }
    
    @Test
    @DisplayName("Test with Timer")
    @Tag("uat")
    @Tag("test")
    @Order(3)
    public void  testCaluculateSimpleIntrestAmountWithTimer() {
    	System.out.println("TestBankOperationsService.testCaluculateSimpleIntrestAmountWithTimer()");
    	assertTimeout(Duration.ofMillis(20015), ()->{
    		service.calculateSimpleIntrestAmount(100000.0f, 2.0f, 12.0f);
    	});
    }
  
    @Test
    @DisplayName("Test with ZeroValues")
    @Tag("test")
    @Order(0)
    public void  testCalculateSimpleIntrestAmountWithZeroValues() {
    	System.out.println("TestBankOperationsService.testCalculateSimpleIntrestAmountWithZeroValues()");
    	  assertThrows(IllegalArgumentException.class,()->{
    		                           service.calculateSimpleIntrestAmount(0.0f,0.0f,12.0f);     
    	                          });
    }
    
	
    @AfterEach
    public  void tearDownEach() {
    	System.out.println("TestBankOperationsService.tearDownEach()");
    }
    
    @AfterAll
    public  static void  tearDown() {
    	System.out.println("TestBankOperationsService.tearDown()");
    	service=null;
    }
	

}
