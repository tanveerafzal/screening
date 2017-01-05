package com.rms.services.common.log;

import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

public class WebInfLookup extends LookupStrategy {
	
	private static final String WEB_PATH = "/WEB-INF/configuration.xml"; 
	private final Servlet servlet;
    private final ServletContext servletCtx;
	
	public WebInfLookup(String systemName, Servlet servlet) {
		super(systemName);
		this.servlet = servlet;
		this.servletCtx = null;
	}
    
    public WebInfLookup(String systemName, ServletContext servletCtx) {
        super(systemName);
        this.servletCtx = servletCtx;
        this.servlet = null;
    }
	
	public Servlet getServlet() {
		return servlet;
	}
    
    public ServletContext getServletContext() {
        return servletCtx;
    }

	public XMLConfiguration lookup() throws ConfigurationException {
		if (servlet == null) {
			return null;
		}
        log.info("Trying servlet path '" + WEB_PATH + "'");
    	try {
			URL url = servlet.getServletConfig().getServletContext().getResource(WEB_PATH);
			if (url == null) {
				return null;
			}
			return new XMLConfiguration(url);
	    } catch (MalformedURLException e) {
	    	log.warn(e);
	    	log.warn("configuration file not found at " + WEB_PATH);
	    	return null;
		}
	}

}

