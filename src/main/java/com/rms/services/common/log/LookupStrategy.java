package com.rms.services.common.log;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.apache.log4j.Logger;

public abstract class LookupStrategy {
	
	protected static Logger log = Logger.getLogger(AppConfigurator.class);
 
	private final String systemName;
	
	public LookupStrategy(String systemName) {
		this.systemName = systemName;
	}

	public abstract XMLConfiguration lookup() throws ConfigurationException;

	public String getSystemName() {
		return systemName;
	}

	public final String trimLeadingAndTrailingQuotes(String string) {
		if (string == null || string.length() == 0) {
			return string;
		}
		
        if (string.startsWith("\"")) {
            string = string.substring(1, string.length());
        }
        
        if (string.endsWith("\"")) {
            string = string.substring(0, string.length()-1);
        }

		return string;
	}

	public final String ensureTrailingSeparator(String string) {
		if (string == null) {
			string = "";
		}
		
		if (!string.endsWith(AppConfigurator.FILE_SEPARATOR)) {
            string += AppConfigurator.FILE_SEPARATOR;
        }
		return string;
	}

	public final URL pathToUrl(String path) throws MalformedURLException {
		if (path == null) {
			return null;
		}
		
        //commented out as .toURI().toURL() assumes that file is relative to app server bin directory
//      confURL = (new File(configHome)).toURI().toURL();

      //system property has to be absolute path to directry containing configuration.xml
      //we will force 'file:\' protocol
      //NOTE:
      //      "file:\\" works ok in JBOSS, but failes if run as standalone app
      //      "file:\" works ok in JBOSS, as well as if run as standalone app
      //NOTE:
      //  if path starts with '/', dont add another '/'
		if (!path.startsWith("file:")) {
			if(path.startsWith(AppConfigurator.FILE_SEPARATOR)) {
			    path = "file:" + path;
			} else {
			    path = "file:" + AppConfigurator.FILE_SEPARATOR + path;
			}
		}
		return new URL(path);
	}
	
	public final XMLConfiguration folderToConfiguration(String folder) throws ConfigurationException {
		if (folder == null) {
	    	return null;
	    }
	    
	    folder = trimLeadingAndTrailingQuotes(folder);
	    folder = ensureTrailingSeparator(folder);
	    
	    String path = folder + AppConfigurator.FILE_NAME;
	    try {
	    	URL url = pathToUrl(path);
	        log.info("\tTrying configuration file '" + url + "'");
	        return new XMLConfiguration(url);
	    } catch (MalformedURLException e) {
	    	log.warn(e);
	    	log.warn("configuration file not found at " + path);
	    	return null;
	    }
	}
	
    public final String convertToSystemPropertyNamingConvention(String name) {
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

