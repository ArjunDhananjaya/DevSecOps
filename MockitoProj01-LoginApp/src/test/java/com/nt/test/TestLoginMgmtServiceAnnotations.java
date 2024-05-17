package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import com.nt.dao.ILoginDAO;
import com.nt.service.ILoginMgmtService;
import com.nt.service.LoginMgmtServiceImpl;

public class TestLoginMgmtServiceAnnotations {
	
  
   @InjectMocks
   private    LoginMgmtServiceImpl  loginService;
      @Mock
    private  ILoginDAO  mockDAO; 
      
     /* @Spy
    private   ILoginDAO   spyDAO; */  
      
   public TestLoginMgmtServiceAnnotations() {
	   MockitoAnnotations.openMocks(this);
  }
   
  
   
   @Test
   public  void  testAuthenticateWithValidCredentials() {
	   // make  Mock obj as the Stub object by providing funcationlify for the verify method
	    Mockito.when(mockDAO.verify("raja", "rani")).thenReturn(true);
	    assertEquals("Valid Credentials", loginService.authenticate("raja", "rani"));
	}
   
   @Test
   public  void  testAuthenticateWithInValidCredentials() {
	   // make  Mock obj as the Stub object by providing funcationlify for the verify method
	    Mockito.when(mockDAO.verify("raja", "rani1")).thenReturn(false);
	    assertEquals("Invalid Credentials", loginService.authenticate("raja", "rani1"));
	  
	}
   
   @Test
   public  void  testAuthenticateWithNoCredentials() {
	   assertThrows(IllegalArgumentException.class, ()->{
		                loginService.authenticate("", "");
	   }) ; 
	}
   
    @Test
     public  void testRegisterUserWithSpy() {
    	 //create the Spy object for DAO interface
    	 ILoginDAO daoSpy=Mockito.spy(ILoginDAO.class);
    	 // assign to SpyDAO obj to service class obj
    	 ILoginMgmtService loginService1=new LoginMgmtServiceImpl(daoSpy);
    	 
    	 //call service methods
    	 loginService1.registerUser("raja", "rani");
    	 loginService1.registerUser("suresh", "hyd");
    	 loginService1.registerUser("mahesh", "");
    	 
    	 //Check  addUSer(-,-) is called with data for appropriate no.of times or not
    	 Mockito.verify(daoSpy,Mockito.times(1)).addUser("raja", "rani");
    	 Mockito.verify(daoSpy,Mockito.times(1)).addUser("suresh", "hyd");
    	 Mockito.verify(daoSpy,Mockito.times(0)).addUser("mahesh", "");
     }
   
   
   
   
   
}
