package com.nt.service;

import com.nt.dao.ILoginDAO;

public class LoginMgmtServiceImpl implements ILoginMgmtService {
	   private ILoginDAO  loginDao;
	   
	   public LoginMgmtServiceImpl(ILoginDAO dao) {
		  loginDao=dao;
	    }
	

	@Override
	public String authenticate(String user, String pwd) {
		 if (user.equals("") || pwd.equals(""))
			 throw new IllegalArgumentException(" Username or/and password must not be empty");
		 //use DAO
		boolean flag=loginDao.verify(user, pwd);
		return flag?"Valid Credentials":"Invalid Credentials";
	}
	
	@Override
	public String registerUser(String user, String pwd) {
		 if(!user.equalsIgnoreCase("") && !pwd.equalsIgnoreCase("")) {
			 loginDao.addUser(user, pwd);
			 return "user added";
		 }
		return "user not added";
	}

}
