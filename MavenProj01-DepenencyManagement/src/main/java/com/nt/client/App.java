package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public int  sum(int x,int y) {
		return x+y;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!123" );
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext();
        for(int i=1;i<=5;++i) {
        	System.out.println("abc:"+i);
        }
    }
}
