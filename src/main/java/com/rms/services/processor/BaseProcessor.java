package com.rms.services.processor;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import com.rms.services.schema.BaseFault;
import com.rms.services.schema.RMSException;


public class BaseProcessor {

	
	public static final String SUCCESS = "0";
	public static final String FAIL = "-1";
	
	public static final String PENDING = "PENDING";
	public static final String Remitter = "Remitter";
	public static final String Beneficiary = "Beneficiary";
	public static final String Transaction = "Transaction";
	public static final String Email = "Email";
	
	public static final String Create= "Create";
	public static final String Update = "Update";
	public static final String Confirm = "Confirm";
	
	
	public static final String DELETE = "DELETE";
	public static final String ADD = "ADD";
	public static final String UPDATE= "UPDATE";
	
	public static final int SUSPICIOUS_LEVEL_1= 1; // customer must answer Security question to login.
	public static final int SUSPICIOUS_LEVEL_2= 2; // customer must not be allowed to login.
	public static final String EVENT_DASHBOARD= "dashboard"; 

	public static final String CUST_STATUS_EDD = "EDD";
	public static final int EDD_TIME_DAYS = 90;   ///90 days

	
	
	public void log(String string) {
		System.out.println(string);
		
	}
	
	public int getRandomNumber(int min, int max) {
		Random rand = new Random();
		
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	public boolean updateRequired(String value1, String value2) {
		
		String value1String = (value1 == null) ? "" : value1;
		String value2String = (value2 == null) ? "" : value2;
		
		
		if (!value1String.equals(value2String))
			return true;
		else
			return false;	
	}

	public boolean updateRequired(double value1, double value2) {
		
		if (value1 != value2)
			return true;
		else
			return false;	
	}
	
	

	public String generateTransactionNumber() {
		// TODO Auto-generated method stub
		Calendar rightNow = new GregorianCalendar();
		//int year = rightNow.get(Calendar.YEAR);
		//int month = rightNow.get(Calendar.MONTH)+1;
		//int day = rightNow.get(Calendar.DATE);
		//return formatDate(year, month, day);
		return rightNow.YEAR+rightNow.getTimeInMillis()+"";
	}

	public String generateTransactionPin() {
		// TODO Auto-generated method stub
		Calendar rightNow = new GregorianCalendar();
		//int year = rightNow.get(Calendar.YEAR);
		//int month = rightNow.get(Calendar.MONTH)+1;
		//int day = rightNow.get(Calendar.DATE);
		//return formatDate(year, month, day);
		return (rightNow.MONTH+rightNow.getTimeInMillis()) /2 +"";
	}
	public String trim(String loginName) {
		
		return (loginName== null)? null : loginName.trim();
	}

	public RMSException getRMSException(String errorCode) {
		
		BaseFault fault = new BaseFault();
		RMSException cdmException = new RMSException(fault.getCause(),fault);
		return cdmException;
	}
	
	public RMSException getRMSException(String errorCode, int code) {
		
		BaseFault fault = new BaseFault();
		RMSException cdmException = new RMSException(fault.getCause()+"  code "+code,fault);
		return cdmException;
	}
	
	

	 
	
}
