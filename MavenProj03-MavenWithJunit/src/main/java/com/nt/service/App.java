package com.nt.service;

public class App 
{
	public  int sum(int  x,int y) {
		return x+y;
	}
	
    public static void main( String[] args )
    {
         App  app1=new App();
         System.out.println("result is:"+app1.sum(10, 20));
         
    }
}
