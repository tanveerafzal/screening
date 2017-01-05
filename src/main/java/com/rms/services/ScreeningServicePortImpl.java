package com.rms.services;

import java.util.ArrayList;
import java.util.List;

import com.rms.services.processor.DownJonesProcessor;
import com.rms.services.schema.Context;
import com.rms.services.schema.RMSException;
import com.rms.services.schema.SearchCriteria;
import com.rms.services.schema.SearchResults;

@javax.jws.WebService(endpointInterface = "com.rms.services.schema.ScreeningService", targetNamespace = "http://www.remitservices.com/ScreeningService/", serviceName = "ScreeningService", portName = "ScreeningServicePort")
public class ScreeningServicePortImpl {

	public SearchResults getEntityDetail(Integer entityId, Context context)
			throws RMSException {
		
		SearchResults results = new SearchResults();
		return results;
	}

	public List<SearchResults> searchEntities(Context context,
			SearchCriteria searchCriteria) throws RMSException {
		DownJonesProcessor processor = new DownJonesProcessor();
		
		List<SearchResults> results = processor.searchEntities(context, searchCriteria);
		
		return results;
	}

}