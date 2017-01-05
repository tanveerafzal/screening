package com.rms.services.common.log;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

public class SystemLookup extends LookupStrategy {
	
	public SystemLookup(String systemName) {
		super(systemName);
	} 

	public XMLConfiguration lookup() throws ConfigurationException {
		String systemPropertyName = convertToSystemPropertyNamingConvention(getSystemName());
		String configHome = System.getProperty(systemPropertyName);
		System.out.println("it is getting here "+systemPropertyName);
		System.out.println("it is getting here "+configHome);
        log.info("Trying system property '" + systemPropertyName + "' =  '" + configHome + "'");
		return folderToConfiguration(configHome);
	}

}
