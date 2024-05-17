package com.nt.service;

public interface ILoginMgmtService {
   public  String  authenticate(String user,String pwd);
   public   String  registerUser(String user,String pwd);
}
