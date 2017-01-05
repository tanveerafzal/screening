package com.rms.services.processor;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import com.rms.services.schema.BaseFault;
import com.rms.services.schema.RMSException;


public class BaseServiceProcessor extends BaseProcessor{

	
	public void log(String string) {
		System.out.println(string);
		
	}
	

	

	
	public  double getDouble(String value) {
		
		try{
			return Double.parseDouble(value);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		return 0;
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
		return rightNow.getTimeInMillis()+"";
	}

	public static String generateVerificationCode() {
		// TODO Auto-generated method stub
		Calendar rightNow = new GregorianCalendar();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(999999999);
		return (randomInt*rightNow.getTimeInMillis())+"";
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
	public String trim(String value) {
		
		return (value== null)? "" : value.trim();
	}

	public RMSException getRMSException(String errorCode) {
		
		BaseFault fault = new BaseFault();
		RMSException cdmException = new RMSException(fault.getCause(),fault);
		return cdmException;
	}
	
	public  RMSException getRMSException(String errorCode, int code) {
		
		BaseFault fault = new BaseFault();
		RMSException cdmException = new RMSException(fault.getCause()+"  code "+code,fault);
		return cdmException;
	}
	
	



	
//	public RefLanguage getRefLanguage(String languageCode)
//	{
//	RefLanguageDAO refLanguageDAO =new RefLanguageDAO();
//	List<RefLanguage> list = refLanguageDAO.findByLanguageCd(languageCode);
//	return (list == null || list.size()==0) ? null : list.get(0);
//	}
//	
	
	
//	public RefCustType getRefCustType(String customerType) {
//		RefCustTypeDAO dao =new RefCustTypeDAO();
//		List<RefCustType> list = dao.findByCustTypeCd(customerType);
//		return (list == null || list.size()==0) ? null : list.get(0);
//	}	
//	
//	public RefCustStatus getRefCustStatus(String code) {
//		RefCustStatusDAO dao =new RefCustStatusDAO();
//		List<RefCustStatus> list = dao.findByCustStatusCd(code);
//		return (list == null || list.size()==0) ? null : list.get(0);
//	}	
//	

	
	
//	public RefTransactionType getRefTransactionType(String code) {
//		
//		RefTransactionTypeDAO dao =new RefTransactionTypeDAO();
//		List<RefTransactionType> list =dao.findByTransactionTypeCd(code);
//		return (list == null || list.size()==0) ? null : list.get(0);
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	










}
