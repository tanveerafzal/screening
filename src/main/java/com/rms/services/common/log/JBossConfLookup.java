package com.rms.services.common.log;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

public class JBossConfLookup extends LookupStrategy {
	
	public JBossConfLookup(String systemName) {
		super(systemName);
	} 

	public XMLConfiguration lookup() throws ConfigurationException {
		// Properties[jboss.server.config.url] = [file:/C:/bin/jboss-4.2.2.GA/server/default/conf/]
		String folder = System.getProperty("jboss.server.config.url");
        log.info("Trying JBoss conf property 'jboss.server.config.url'='" + folder + "'");
		if (folder == null) {
			return null;
		}

		folder = folder.replace("/", AppConfigurator.FILE_SEPARATOR);

		String path = folder + getSystemName() + AppConfigurator.FILE_SEPARATOR;
        log.info("\tTrying JBoss conf folder '"+path+"'");
		
		try {
			return folderToConfiguration(path);
		} catch (ConfigurationException e) {
			log.warn(e);
			if (e.getCause() != null) {
				log.warn(e.getCause());
			}
			return null;
		}
		
	}

}
