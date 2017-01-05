package com.rms.services.common.log;

import org.apache.commons.configuration.XMLConfiguration;



public class LogConfig  {
	
	
	 
	  

	    public static XMLConfiguration getConfig() throws Exception{
	    	XMLConfiguration config = AppConfigurator.getInstance().getConfiguration();
	    	System.out.println("this is next step");
	    	System.out.println(config);
	        return config;
	    }
	

}
