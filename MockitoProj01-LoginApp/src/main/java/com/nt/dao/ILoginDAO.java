package com.nt.dao;

public interface ILoginDAO {
   public  boolean verify(String username,String password);
   public  String addUser(String user,String pwd);
}
