package com.rms.services.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rms.services.schema.BaseFault;
import com.rms.services.schema.RMSException;


public class CommonUtil {
	
	public static double formatDouble(double value)
	{
		DecimalFormat df = new DecimalFormat("#.##");
		return Double.parseDouble(df.format(value));
	}

	
		
	public static double Round(double value) {
			double p = (double)Math.pow(10,2);
			value = value * p;
			  double tmp = Math.round(value);
			  return (double)tmp/p;
			  }
		
		
	public static String getCustomerNumber() {
		//2010-01-01
		Calendar rightNow = new GregorianCalendar();
		//int year = rightNow.get(Calendar.YEAR);
		//int month = rightNow.get(Calendar.MONTH)+1;
		//int day = rightNow.get(Calendar.DATE);
		//return formatDate(year, month, day);
		return rightNow.getTimeInMillis()+"";
	}		
	
	
	public static Date getTodaysDate() {
		//2010-01-01
		Calendar rightNow = new GregorianCalendar();
		//int year = rightNow.get(Calendar.YEAR);
		//int month = rightNow.get(Calendar.MONTH)+1;
		//int day = rightNow.get(Calendar.DATE);
		//return formatDate(year, month, day);
		return rightNow.getTime();
	}	
	public static Date getTodaysDatePlusOne() {
		Calendar rightNow = new GregorianCalendar();
		//int year = rightNow.get(Calendar.YEAR);
		//int month = rightNow.get(Calendar.MONTH)+1;
		int day = rightNow.get(Calendar.DATE)+1;
		rightNow.set(Calendar.DATE, day);
		return rightNow.getTime();
	}	
	
	public static Date getYearBackDate() {
		//2010-01-01
		Calendar rightNow = new GregorianCalendar();
		int year = rightNow.get(Calendar.YEAR)-1;
		//int month = rightNow.get(Calendar.MONTH)+1;
		//int day = rightNow.get(Calendar.DATE);
		rightNow.set(Calendar.YEAR, year);
		//return (new Date(year, month, day));
		return rightNow.getTime();
		
	}
	

	private static String formatDate(int year, int month, int billDay) {
		
		String strMonth = ""+month;
		String strBillDay = ""+billDay;
		if (strMonth.length()==1) strMonth = "0"+strMonth;
		if (strBillDay.length()==1) strBillDay = "0"+strBillDay;
		return year+"-"+strMonth+"-"+strBillDay;
	}




  
    public static boolean isNumber(String value)
	{
		
		for ( int i=0; i<value.length(); ++i)
			if ( value.charAt(i) < '0' || value.charAt(i) > '9' ) 
				return false ;
		return true ;
	}
    
    public static String dumpException(Exception e, int maxDepthToPrint) {
        StringBuffer stackDump = new StringBuffer();

        int i, depthCounter;
        String s;
        StackTraceElement[] st;
        s = "\nMessage:\n" + e.toString() + "\nStack trace:\n";
        stackDump.append(s);
//        System.out.print(s);

        st = e.getStackTrace();
        depthCounter = 0;

        for (i = 0; i < st.length; i++) {
            s = "   at " + st[i].toString() + "\n";
            stackDump.append(s);
//            System.out.print(s);

            depthCounter++;
            if (depthCounter >= maxDepthToPrint) {
                s = "... " + (st.length - depthCounter) + " more\n";
                stackDump.append(s);
//                System.out.print(s);
                break;
            }
        }

        Throwable t = e.getCause();
        while (t != null) {
            s = "Caused by: " + t.toString() + "\n";
            stackDump.append(s);
//            System.out.print(s);

            st = t.getStackTrace();
            depthCounter = 0;
            for (i = 0; i < st.length; i++) {
                s = "   at " + st[i].toString() + "\n";
                stackDump.append(s);
//                System.out.print(s);

                depthCounter++;
                if (depthCounter >= maxDepthToPrint) {
                    s = "   ... " + (st.length - depthCounter) + " more\n";
                    stackDump.append(s);
//                    System.out.print(s);
                    break;
                }
            }
            t = t.getCause();
        }
        return stackDump.toString();
    }
    
    
    
    public static XMLGregorianCalendar asXMLGregorianCalendar(Timestamp timestamp) {
		DatatypeFactory df=null;
		try {
			df=DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			System.err.println("Exception in CommonUtil.asXMLGregorianCalendar() method : ");
			//e.printStackTrace();
		}
	    if (timestamp == null) {
	        return null;
	    } else {
	        GregorianCalendar gc = new GregorianCalendar();
	        gc.setTimeInMillis(timestamp.getTime());
	        return df.newXMLGregorianCalendar(gc);
	    }
	}
    public static XMLGregorianCalendar asXMLGregorianCalendar(java.util.Date timestamp) {
		DatatypeFactory df=null;
		try {
			df=DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			System.err.println("Exception in CommonUtil.asXMLGregorianCalendar() method : ");
			//e.printStackTrace();
		}
	    if (timestamp == null) {
	        return null;
	    } else {
	        GregorianCalendar gc = new GregorianCalendar();
	        gc.setTimeInMillis(timestamp.getTime());
	        return df.newXMLGregorianCalendar(gc);
	    }
	}
    public static XMLGregorianCalendar asXMLGregorianCalendar(Calendar calender) {
		DatatypeFactory df=null;
		try {
			df=DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			System.err.println("Exception in CommonUtil.asXMLGregorianCalendar() method : ");
		}
	    if (calender == null) {
	        return null;
	    } else {
	        GregorianCalendar gc = new GregorianCalendar();
	        gc.setTimeInMillis(calender.getTimeInMillis());
	        return df.newXMLGregorianCalendar(gc);
	    }
	}
    
   public static Date converXMLGregorianCalendarToDate(XMLGregorianCalendar xMLGregorianCalendar){
	  
	   Date date=new Date(xMLGregorianCalendar.toGregorianCalendar().getTimeInMillis());
	   return date;
   }
   
   public static Date converXMLGregorianCalendarToSQLDate(XMLGregorianCalendar xMLGregorianCalendar){
		System.out.println("converXMLGregorianCalendarToSQLDate.. xMLGregorianCalendar : "+xMLGregorianCalendar);

	   if (xMLGregorianCalendar == null)
		   return null;
	   java.sql.Date date=new java.sql.Date(xMLGregorianCalendar.toGregorianCalendar().getTimeInMillis());
		System.out.println("converXMLGregorianCalendarToSQLDate.. conerted Date : "+date);

	   return date;
   }

   public static String converDateToRemitOneFormat(Date date){

   DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
   return df.format(date);
   }

   
   public static Timestamp converXMLGregorianCalendarToTimestamp(XMLGregorianCalendar xMLGregorianCalendar){
	   if (xMLGregorianCalendar== null)
		   return null;
	   
	   Calendar cal=xMLGregorianCalendar.toGregorianCalendar();
	   Timestamp timestamp=new Timestamp(cal.getTimeInMillis());
	   return timestamp;
   }
   
public static Timestamp converXMLGregorianCalendarToTimestampBegin(XMLGregorianCalendar xMLGregorianCalendar){
	   
	   Calendar cal=xMLGregorianCalendar.toGregorianCalendar();
	   
	   Timestamp timestamp=new Timestamp(cal.getTimeInMillis());
	   timestamp.setHours(0);
	   timestamp.setMinutes(0);
	   timestamp.setSeconds(0);
	  
	   return timestamp;
   }


public static Timestamp converXMLGregorianCalendarToTimestampEnd(XMLGregorianCalendar xMLGregorianCalendar){
	
	   Calendar cal=xMLGregorianCalendar.toGregorianCalendar();
	   
	   Timestamp timestamp=new Timestamp(cal.getTimeInMillis());
	   timestamp.setHours(23);
	   timestamp.setMinutes(59);
	   timestamp.setSeconds(59);
	  
	   return timestamp;
}
   
   public static Timestamp getCurrentTimeStamp(){
	   java.util.Date date= new java.util.Date();
	   Timestamp timestamp = new Timestamp(date.getTime());
	   return timestamp;
   }

   
   public static boolean  checkForValidValue(String value){
	   if ((value!=null) && !value.equals("?") && !value.equals(""))
		   return true;
	   else
		  return false;
   }
   
   public static boolean  checkForValidValue(XMLGregorianCalendar value){
	   if ((value!=null) )
		   return true;
	   else
		  return false;
   }

   public static boolean  getBooleanValue(String value){
	   if ((value!=null) && value.equalsIgnoreCase("Y") )
		   return true;
	   else
		  return false;
	
   }

  
   
   
 
   
  



	public static String getStringFromBoolean(boolean value) {
		if (value)
			return "Y";
		else
			return "N";
	}
	
	
	
	
	public Calendar getCalendarFromDate(Date date)
	{
		Calendar cal=null;
		try {  
			cal=Calendar.getInstance();
			cal.setTime(date);
			}
		catch (Exception e)
			{
			System.err.println("Exception in CommonUtil.getCalendarFromDate method :");  
			}  
		return cal;
	 
	 }
	
	public static String booleanToSring(boolean value){
		String string=new Boolean(value).toString();
	     return string;
	}
	
	public static String booleanToYN(boolean value){
		String string="N";
		if (value) 
			string="Y";
	     return string;
	}
   
	public static boolean stringToBoolean(String value){
		if (value.equals("Y"))
			return true;
		else
			return false;
	}



	
	
	//Author Imran Ahmed 09/05/2012
	 public static XMLGregorianCalendar convertFromStringDateToXMLGregorianCalendar(String date){
		 
		 DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		 
		 try {             
			 if(CommonUtil.checkForValidValue(date)){
			 	Date d = df.parse(date);
			 	GregorianCalendar gc = new GregorianCalendar();
			 	gc.setTime(d);
			 	return DatatypeFactory.newInstance().newXMLGregorianCalendar(gc); 
			 }
		} catch (ParseException e){ 
			System.err.println("ParseException in CommonUtil.convertFromStringDateToXMLGregorianCalendar() method :" );
			//e.printStackTrace();         
		} 
		catch(DatatypeConfigurationException dtce){
			System.err.println("DatatypeConfigurationException in CommonUtil.convertFromStringDateToXMLGregorianCalendar() method :" );
			//dtce.printStackTrace();
		}
		 return null;
	 }
	

	
	/*
	 * 
	 * @author: Imran
	 */
	public static String convertXMLGregorianCalendarToStringDate(XMLGregorianCalendar xMLGregorianCalendar){
		  
		 	if (xMLGregorianCalendar== null)
		 	{
		 		return null;
		 	}
//			DateFormat df = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		 
		   Date javeDate = new Date(xMLGregorianCalendar.toGregorianCalendar().getTimeInMillis());
		    String stringDate = df.format(javeDate);
		    return stringDate;
	   }

	
	/*
	 * 
	 * @author: Imran
	 */
	public static XMLGregorianCalendar getXMLGregorianCalendarNow()throws DatatypeConfigurationException {
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
		XMLGregorianCalendar now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
		return now;
	}

	

	
	/*
	 * @author: Imran
	 * This method returns date as string by providing the valid date format as input
	 *
	*/
	public static String getFormattedDateAsString(String dateFormat){
		Format fm = new SimpleDateFormat(dateFormat);
		Date d = new Date();		
		String formatDate = fm.format( d);
		return formatDate;
	
	}
	
	/*
	 * @author: Imran
	 * This method mask the creditCardNumber first4 and last 4 digits are visible
	 */
public static String maskCreditCardNumber(String creditCardNumber){
		
		String mask = null;
		char[] temp = creditCardNumber.toCharArray();
		int firstFourDigit = temp.length-(temp.length-4);
		int lastFourDigit = temp.length - 4;
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<temp.length;i++){
			if(i>=firstFourDigit && i<lastFourDigit)
				temp[i]='*';
			sb.append(temp[i]);
			
		}
		mask = sb.toString();
		return  mask;
	}


	
	/**
	 * Description - The generateCdmException method throws RMSException with the provided
	 *               Error Code and Description as input to the method. 
	 * 
	 * @param -  errorCode
	 * @param -  errorMessage
	 * @return - void
	 * 
	 * @throws - RMSException
	 */
	public static void generateCdmException(String errorCode, String errorMessage) throws RMSException {
		
		BaseFault faultInfo = new BaseFault();
		faultInfo.setCode(errorCode);
		faultInfo.setCause(errorMessage);

		throw new RMSException(errorCode, faultInfo);

	}
	
	/**
	 * Description - The getBaseFault method returns BaseFault object with the provided
	 *               Error Code and Description as input to the method. 
	 * 
	 * @param -  errorCode
	 * @param -  errorMessage
	 * @return - BaseFault
	 * 
	 */
	public static BaseFault getBaseFault(String errorCode, String errorMessage) {
		
		BaseFault faultInfo = new BaseFault();
		faultInfo.setCode(errorCode);
		faultInfo.setCause(errorMessage);

		return faultInfo;

	}

	
	 
}
