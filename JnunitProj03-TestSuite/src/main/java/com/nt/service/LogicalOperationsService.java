package com.nt.service;

import java.util.Date;

public class LogicalOperationsService {

	  public  boolean isPositive(int x) {
		    if(x<=0)
		    	 return false;
		    else
		    	return true;
	  }
	  
	  public  boolean isNull(Date d) {
		    if(d==null)
		    	 return true;
		    else
		    	return false;
	  }
}
