//BankOperationsService.java
package com.nt.service;

public class BankOperationsService {

	public  float   calculateSimpleIntrestAmount(float  pamt ,float rate,float time) {
		//System.out.println("BankOperationsService.calculateSimpleIntrestAmount()");
		if(pamt==0 || rate==0 || time==0)
			throw new IllegalArgumentException("Invalid inputs");
		try {
			Thread.sleep(20000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		float intramt=pamt*rate*time/100.0f;
		return intramt;
	}
}
