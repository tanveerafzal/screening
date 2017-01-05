package com.rms.services.common.log;
import java.io.File;
import java.util.Properties;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.apache.log4j.Logger;
 
public class AppConfigurator {

	protected static Logger logger = Logger.getLogger(AppConfigurator.class);

	public static final String FILE_NAME = "configuration.xml";

	public static final String FILE_SEPARATOR = System.getProperty("file.separator");
	
    private static AppConfigurator ourInstance = null;
    private XMLConfiguration configuration;
    public AppConfigurator() throws Exception{
    	System.out.println("AppConfigurator() constructor called :");
    	Properties prop = System.getProperties();
    	//System.out.println("System.getProperties "+prop);
    	String fileName=prop.getProperty("commonconfig");
    	System.out.println("fileName for Common Config: "+fileName);
    	if (fileName==null)
    	{
    		System.out.println("commonconfig not found in server path : setting it to /apps/appconfig/RMSWebServices/commonconfig.xml "+fileName);
			fileName="/apps/appconfig/RMSWebServices/commonconfig.xml";
    	}
    		
    		
    	System.out.println("fileName"+fileName);
    	
    	try {
    		File file=new File(fileName);
			configuration=new XMLConfiguration(file);
			System.out.println("configuration is created successfully");
		} catch (ConfigurationException e) {
			logger.error("Exception in AppConfigurator() :",e);
			
			//e.printStackTrace();
			throw new Exception("configuration file is not found");
		}
    }
   /* public static AppConfigurator getInstance(String systemName) {
        return getInstance(systemName, (Servlet) null);
    }*/
    
    public static AppConfigurator getInstance() throws Exception{
    	System.out.println("AppConfigurator().getInstance() method called :");
    	if (ourInstance == null) {
            ourInstance = new AppConfigurator();
	        System.out.println("Configuration file loaded:  " + ourInstance.configuration.getURL());
        }    
        return ourInstance;
       
    }

   /* public static AppConfigurator getInstance(String systemName, Servlet servlet) {
        if (ourInstance == null) {
            ourInstance = new AppConfigurator(systemName, servlet);
	        log.info("Configuration file loaded:  " + ourInstance.configuration.getURL());
        }    
        return ourInstance;
    }

    public static AppConfigurator getInstance(String systemName, ServletContext servletCtx) {
        if (ourInstance == null) {
            ourInstance = new AppConfigurator(systemName, servletCtx);
            log.info("Configuration file loaded:  " + ourInstance.configuration.getURL());
        }    
        return ourInstance;
    }*/

  

 /*   private AppConfigurator(String systemName, Servlet servlet) {
    	LookupStrategy strategy;
    	
    	try {
			strategy = new SystemLookup(systemName);
			if ((configuration = strategy.lookup()) != null) {
				return;
			}
			
			strategy = new WebInfLookup(systemName, servlet);
			if ((configuration = strategy.lookup()) != null) {
				return;
			}
			
//NOTE: JBossConf lookup not needed now
			strategy = new JBossConfLookup(systemName);
			if ((configuration = strategy.lookup()) != null) {
				return;
			}
			
			strategy = new EnvironmentLookup(systemName);
			if ((configuration = strategy.lookup()) != null) {
				return;
			}

//			this strategy needs to be properly defined for a multi-app system			
//			strategy = new ClasspathLookup(SYSTEM_NAME);
//			if ((configuration = strategy.lookup()) != null) {
//				return;
//			}
 
			String msg = "No configuration found for system '" + systemName + "'";
	        log.error(msg);
	        throw new Error(msg);
			
		} catch (ConfigurationException e) {
            String msg = "ERROR: Unable to configure system '" + systemName + "'";
	        log.error(e);
	        log.error(msg);
			throw new Error(msg, e);
		}
    }

    private AppConfigurator(String systemName, ServletContext servletCtx) {
        LookupStrategy strategy;
        
        try {
            strategy = new SystemLookup(systemName);
            if ((configuration = strategy.lookup()) != null) {
                return;
            }
            
            strategy = new WebInfLookup(systemName, servletCtx);
            if ((configuration = strategy.lookup()) != null) {
                return;
            }
            
//NOTE: JBossConf lookup not needed now
            strategy = new JBossConfLookup(systemName);
            if ((configuration = strategy.lookup()) != null) {
                return;
            }
            
            strategy = new EnvironmentLookup(systemName);
            if ((configuration = strategy.lookup()) != null) {
                return;
            }

//          this strategy needs to be properly defined for a multi-app system           
//          strategy = new ClasspathLookup(SYSTEM_NAME);
//          if ((configuration = strategy.lookup()) != null) {
//              return;
//          }

            String msg = "No configuration found for system '" + systemName + "'";
            log.error(msg);
            throw new Error(msg);
            
        } catch (ConfigurationException e) {
            String msg = "ERROR: Unable to configure system '" + systemName + "'";
            log.error(e);
            log.error(msg);
            throw new Error(msg, e);
        }
    }*/

    public XMLConfiguration getConfiguration() {
        return configuration;
    }

    //replaces typical environment variable naming convention to system property naming convention
    //e.g. ABC_DEF_HOME will be changed to abcDefHome
    public static String convertToSystemPropertyNamingConvention(String name) {
        int i;
        char c;

        StringBuffer sb = new StringBuffer();
        for(i = 0 ; i < name.length() ; i++) {
            c = name.charAt(i);
            if (c != '_') {  //check if '_'
                c = Character.toLowerCase(c);
                sb.append(c);
            } else {
                i++;    //skip '_'
                if (i < name.length()) {   //this checks for possible '_' as last char
                    c = name.charAt(i); //get char after '_'
                    c = Character.toUpperCase(c);
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
