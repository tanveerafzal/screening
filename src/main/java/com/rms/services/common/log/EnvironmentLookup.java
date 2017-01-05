package com.rms.services.common.log;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

public class EnvironmentLookup extends LookupStrategy {
	
	public EnvironmentLookup(String systemName) {
		super(systemName);
	} 

	public XMLConfiguration lookup() throws ConfigurationException {
        String envVariableName = getSystemName();
        String configHome = System.getenv(envVariableName);
        log.info("Trying environment variable '" + envVariableName + "' =  '" + configHome + "'");

		return folderToConfiguration(configHome);
	}

}
