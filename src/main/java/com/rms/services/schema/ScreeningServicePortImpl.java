package com.rms.services.schema;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@javax.jws.WebService(endpointInterface = "com.rms.services.schema.ScreeningService", targetNamespace = "http://www.remitservices.com/ScreeningService/", serviceName = "ScreeningService", portName = "ScreeningServicePort")
public class ScreeningServicePortImpl {

	public SearchResults getEntityDetail(Integer entityId, Context context)
			throws RMSException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public List<SearchResults> searchEntities(Context context,
			SearchCriteria searchCriteria) throws RMSException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

}