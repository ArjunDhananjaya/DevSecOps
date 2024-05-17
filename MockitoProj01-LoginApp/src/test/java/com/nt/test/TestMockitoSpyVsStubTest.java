package com.nt.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestMockitoSpyVsStubTest {
	
	@Test
	public  void  testSpyVsStub() {
		//gives the Mock obj later becomes Stub object
		List<String> listMock=Mockito.mock(ArrayList.class);
		//gives the Spy object
		List<String> listSpy=Mockito.spy(ArrayList.class);
		//List<String> listSpy=Mockito.spy(new ArrayList());
		
		listMock.add("table");
		//Mockito.when(listMock.size()).thenReturn(10);
		
		listSpy.add("table");
		//Mockito.when(listSpy.size()).thenReturn(10);*/
		
		System.out.println(listMock.size()+"   "+listSpy.size());
		
		
		
		
		
	}

}
