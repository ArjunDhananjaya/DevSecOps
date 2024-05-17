package com.nt.test;

import com.nt.client.App;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
         App app=new App();
         int result= app.sum(10, 20);
         System.out.println("result is::"+result);
    }
}
