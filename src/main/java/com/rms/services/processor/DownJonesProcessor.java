package com.rms.services.processor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.rms.schema.dao.DateDetail;
import com.rms.schema.dao.EntityManagerHelper;
import com.rms.schema.dao.NameDetail;
import com.rms.schema.dao.PersonEntity;
import com.rms.schema.dao.PersonEntityDAO;
import com.rms.schema.dao.SanctionsReferences;
import com.rms.services.common.enums.SearchType;
import com.rms.services.common.log.ApplicationConstants;
import com.rms.services.common.log.LogConfig;
import com.rms.services.schema.BaseFault;
import com.rms.services.schema.Context;
import com.rms.services.schema.DateOfBirth;
import com.rms.services.schema.RMSException;
import com.rms.services.schema.SearchCriteria;
import com.rms.services.schema.SearchResults;
import com.rms.services.utils.CommonUtil;

public class DownJonesProcessor extends BaseServiceProcessor {

	public List<SearchResults> searchEntities(Context context,
			SearchCriteria searchCriteria) throws RMSException{
		
		List<SearchResults> results = new ArrayList<SearchResults>();
		SearchResults person = new SearchResults();

		PersonEntityDAO personDao = new PersonEntityDAO();
		System.out.println("searchCriteria request is : " + searchCriteria );
		
		List<com.rms.services.schema.SearchResults> finalEntityList =new  ArrayList<com.rms.services.schema.SearchResults>();
		StringBuffer queryString = new StringBuffer();
		String queryValue = null;
		boolean firstParameter = false;
		if(searchCriteria!=null)
		System.out.println("searchEntities .searchCriteria:"		+ searchCriteria);
		try {
			
				if ((searchCriteria.getEntityName() !=null && searchCriteria.getEntityName().length() != 0)) {
					queryString.append("obj.entityname =") .append(" :entityname ").append(" ");
					firstParameter=true;

				}else
				{
		
					if ((searchCriteria.getFirstName() !=null && searchCriteria.getFirstName().length() != 0)) {
						{
							String and = (firstParameter) ? " and " : " ";
						queryString.append(and).append("lower(obj.firstname)=") .append(" :firstname ").append(" ");
							firstParameter=true;
						}
					
					if ((searchCriteria.getLastName() !=null && searchCriteria.getLastName().length() != 0)) {
						String and = (firstParameter) ? " and " : "  ";
						queryString.append(and).append(" lower(obj.surname)=").append(":surname").append(" ");
						firstParameter = true;
					}
					if ((searchCriteria.getMiddleName() !=null && searchCriteria.getMiddleName().length() != 0)) {
						String and = (firstParameter) ? " and " : "  ";
						queryString.append(and).append(" lower(obj.middlename)=").append(":middlename").append(" ");
						firstParameter = true;
					}
					if ((searchCriteria.getEntityName() !=null && searchCriteria.getEntityName().length() != 0)) {
						String and = (firstParameter) ? " and " : "  ";
						queryString.append(and).append(" lower(obj.entityname)=").append(":entityname").append(" ");
						firstParameter = true;
					}
					
				}
					
//					String and = (firstParameter) ? " and " : "  ";
//					queryString.append(and).append(" obj.personEntity.activestatus=").append(":status");
//					firstParameter = true;
					
					
				
//				if (CommonUtil.checkForValidValue(searchCriteria.getMiddleName()) && firstParameter)
//					queryString.append(" and ").append("lower(obj.middlename) like")
//							.append(":middlename");
		}
				
//				else if (SearchType.Advanced.equalsIgnoreCase(searchCriteria.getSearchType()))
//			{
//				
//				if ((searchCriteria.getDateOfBirth() ==null )) {
//					throw (new RMSException("DateOfBirth Is mandatory for Advanced Search", null));
//					}
//				if ((searchCriteria.getDateOfBirth() !=null )) {
//					{
//						String and = (firstParameter) ? " " : " and ";
//						queryString.append(and).append("obj.firstname =") .append(" :firstname ").append(" ");
//						firstParameter=true;
//					}
//			}
					
			
		EntityManager em = EntityManagerHelper.getEntityManager();
	        System.out.println(queryString);
	        queryValue="select obj from NameDetail obj where "+queryString;
	        System.out.println("Search Query : "+queryValue);
	        
			Query query = em.createQuery(queryValue);
			query.setHint("javax.persistence.cache.storeMode", "REFRESH");
			
//			query = query.setParameter("firstname",	searchCriteria.getFirstName());
			
				if ((searchCriteria.getEntityName() !=null && searchCriteria.getEntityName().length() != 0)) 
				{
			        System.out.println("Setting Value: entityname: "+searchCriteria.getEntityName().toLowerCase().trim());
					query = query.setParameter("entityname",(searchCriteria.getEntityName().toLowerCase().trim()));
				}
				else
				{
					if (CommonUtil.checkForValidValue(searchCriteria.getFirstName()))
					{
				        System.out.println("Setting Value: firstname: "+searchCriteria.getFirstName().toLowerCase().trim());
						query = query.setParameter("firstname",(searchCriteria.getFirstName().toLowerCase().trim()));
					}
					if (CommonUtil.checkForValidValue(searchCriteria.getLastName()))
						{
				        System.out.println("Setting Value: surname: "+searchCriteria.getLastName().toLowerCase().trim());
				        query = query.setParameter("surname",(searchCriteria.getLastName().toLowerCase().trim()));
						}
					
					if (CommonUtil.checkForValidValue(searchCriteria.getMiddleName()))
						{
				        System.out.println("Setting Value: middlename: "+searchCriteria.getMiddleName().toLowerCase().trim());
				        query = query.setParameter("middlename",(searchCriteria.getMiddleName().toLowerCase().trim()));
						}
				}
				
			//	query = query.setParameter("status","Active");
				
				

			
			System.out.println("query is :"	+ query.toString());
			//query.setMaxResults(10);	
			
			List<com.rms.schema.dao.NameDetail> personsList =query.getResultList();
			System.out.println("personsList:"+personsList.size());
			
			
			if (personsList!= null && personsList.size() > 0)
			{
				List<String> persons = new ArrayList<String>();
				
				for (int i=0; i< personsList.size(); i++)
				{
					com.rms.schema.dao.NameDetail nameDetail = personsList.get(i);				
					System.out.println("personsList ..PersonId :"+nameDetail.getPersonEntity().getEntityId());
					String entityId = ""+nameDetail.getPersonEntity().getEntityId();
					if (!"Active".equalsIgnoreCase(nameDetail.getPersonEntity().getActivestatus()))
					{
						System.out.println("###############################Status not Active for PersonId :"+nameDetail.getPersonEntity().getEntityId()+"  Status:"+nameDetail.getPersonEntity().getActivestatus());
						continue;
					}
					if (SearchType.Advanced.equalsIgnoreCase(searchCriteria.getSearchType()))
					{
						System.out.println("Search is Advanced Search ... need to compare DOB as well... :"+searchCriteria.getDateOfBirth().getDay()+" "+searchCriteria.getDateOfBirth().getMonth()+" "+searchCriteria.getDateOfBirth().getYear());
						if (nameDetail.getPersonEntity().getDateDetails() == null)
						{
							System.out.println(" DateOfBirth is not provided for EntityId:"+entityId);
							continue;
						}else
						{
							System.out.println(" checking DateOfBirth for EntityId:"+entityId);
							for (DateDetail dateDetail : nameDetail.getPersonEntity().getDateDetails() )
							{
								System.out.println(" DateType for EntityId:"+entityId+"  is "+ dateDetail.getDateType() + " value:"+dateDetail.getDay()+"/"+dateDetail.getMonth()+"/"+dateDetail.getYear()+"/" );
								if (dateDetail.getDateType()!= null && dateDetail.getDateType().equalsIgnoreCase("Date of Birth") && dobMatch(searchCriteria, dateDetail))
								{
									if (!persons.contains(entityId))
										{
											com.rms.services.schema.SearchResults personInst = getPersonFromDB(nameDetail);
											
											if (checkSanctionsReferences(nameDetail.getPersonEntity()))
												{
													finalEntityList.add(personInst);
													persons.add(entityId);
												}
										}
								}
							}
						}
						
					}else
					{
						if (!persons.contains(entityId))
						{
							com.rms.services.schema.SearchResults personInst = getPersonFromDB(nameDetail);
							if (checkSanctionsReferences(nameDetail.getPersonEntity()))
							{
								finalEntityList.add(personInst);
								persons.add(entityId);
							}
							
						}
					}
				}
				
			}
			
			
		} catch (Exception error) {
			BaseFault baseFaultInfo = new BaseFault();
			error.printStackTrace();
			RMSException cmdDMException = new RMSException(error.getMessage(),baseFaultInfo);
			System.out.println("Exception in OrderServiceProcessor.searchOrder() method : "+error);
			throw cmdDMException;
		}
		
		
		
	
		return finalEntityList;
		
	}
/*
 * return true if Sanction References are valid and one of the list in the Configuration. 
 * return false if Sanction References are not valid and not one of the list in the Configuration. 

 */
	
	private boolean checkSanctionsReferences(PersonEntity personEntity) {
		System.out.println(" checkSanctionsReferences called for entity:"+personEntity.getEntityId());
		// if Person donot have SanctionsReferenceses, we should not block him...
		if (personEntity.getSanctionsReferenceses()==null || personEntity.getSanctionsReferenceses().size()==0 )
		{
			return false;
		}
		//status : Current, Suspended
		boolean checkStatus = false;
		for (SanctionsReferences sanctionsReference : personEntity.getSanctionsReferenceses())
		{
			if (sanctionsReference != null && sanctionsReference.getSanctionsReferenceList()!= null 
					&& "Current".equalsIgnoreCase(sanctionsReference.getSanctionsReferenceList().getStatus()) 
					&& sanctionsReferenceDatesValid(sanctionsReference)
					&& matchConfigurationList(sanctionsReference))
			{
				checkStatus=true;
			}
		}
		System.out.println(" checkSanctionsReferences called for entity:"+personEntity.getEntityId()+"  checkStatus:"+checkStatus);

		return checkStatus;
	}

	/*
	 * return true if match found or got an exception...
	 * return true if match found
	 * return false if list in the configuration is empty
	 */
		
	private boolean matchConfigurationList(	SanctionsReferences sanctionsReference) {
		try {
			System.out.println(" matchConfigurationList with sanctionsReference ID:"+sanctionsReference.getId()+" ReferenceCodeDesc:"+sanctionsReference.getReferenceCodeDesc());
			List<String> sanctionsReferences =  LogConfig.getConfig().getList(ApplicationConstants.sanctionsReferences);
			System.out.println(" matchConfigurationList in configuration:"+sanctionsReferences);
			
			if (sanctionsReferences== null && sanctionsReferences.size()==0)
			{
				System.out.println(" matchConfigurationList no list specified in configuration:"+ApplicationConstants.sanctionsReferences);
				return false; 
			}
			
			for (String ref : sanctionsReferences)
			{
				System.out.println(" matchConfigurationList checking ref :"+ref+"   with "+sanctionsReference.getReferenceCodeDesc());
				if (sanctionsReference.getReferenceCodeDesc().contains(ref))
				{
					System.out.println(" matchConfigurationList MATCHED ref :"+ref+"   with "+sanctionsReference.getReferenceCodeDesc());
					return true;
				}

			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return true;
		}
		return false;
	}

	private boolean sanctionsReferenceDatesValid(
			SanctionsReferences sanctionsReference) {
		
		System.out.println(" SanctionsReferenceDatesValid called for ID:"+sanctionsReference.getId()+" Sinceday:"+sanctionsReference.getSinceday()+" Sincedmonth:"+sanctionsReference.getSincemonth()+" Sinceyear:"+sanctionsReference.getSinceyear()
				+" Today:"+sanctionsReference.getToday()+" Todmonth:"+sanctionsReference.getTomonth()+" Toyear:"+sanctionsReference.getToyear());
		Calendar today = new GregorianCalendar();

		Calendar sinceDate = new GregorianCalendar();
		Calendar toDate = new GregorianCalendar();
		if (sanctionsReference.getSinceday()!= null && sanctionsReference.getSinceday().trim().length() > 0)
			sinceDate.set(Calendar.DATE, Integer.parseInt(sanctionsReference.getSinceday()));
		if (sanctionsReference.getSincemonth()!= null && sanctionsReference.getSincemonth().trim().length() > 0)
			sinceDate.set(Calendar.MONTH, (getMonth(sanctionsReference.getSincemonth())-1));
		if (sanctionsReference.getSinceyear()!= null && sanctionsReference.getSinceyear().trim().length() > 0)
			sinceDate.set(Calendar.YEAR, Integer.parseInt(sanctionsReference.getSinceyear()));
		System.out.println(" SanctionsReferenceDatesValid sinceDate:"+sinceDate.getTime());

		
		if (sanctionsReference.getToday()!= null && sanctionsReference.getToday().trim().length() > 0)
			toDate.set(Calendar.DATE, Integer.parseInt(sanctionsReference.getToday()));
		if (sanctionsReference.getTomonth()!= null && sanctionsReference.getTomonth().trim().length() > 0)
			toDate.set(Calendar.MONTH, (getMonth(sanctionsReference.getTomonth())-1));
		if (sanctionsReference.getToyear()!= null && sanctionsReference.getToyear().trim().length() > 0)
			toDate.set(Calendar.YEAR, Integer.parseInt(sanctionsReference.getToyear()));
		System.out.println(" SanctionsReferenceDatesValid toDate:"+toDate.getTime());

	//	System.out.println(" SanctionsReferenceDatesValid checking if toDate is before today:"+toDate);

		if (toDate.before(today))
		{
			System.out.println(" SanctionsReferenceDatesValid toDate is before today:"+toDate.getTime());
			return false;
		}
		return true;
	}

	private boolean dobMatch(SearchCriteria searchCriteria,	DateDetail dateDetail) {
		boolean match=true;
		DateOfBirth dob = searchCriteria.getDateOfBirth();
		if (dob.getDay() != Integer.parseInt(dateDetail.getDay()))
		{
			match=false;
		}
		if (dob.getYear() != Integer.parseInt(dateDetail.getYear()))
		{
			match=false;
		}
		if (dob.getMonth() != getMonth(dateDetail.getMonth()))
		{
			match=false;
		}
		System.out.println("dobMatch : "+match);

		return match;
	}

	private int getMonth(String month) {
		 Date date;
		try {
			date = new SimpleDateFormat("MMM", Locale.ENGLISH).parse(month);
		} catch (ParseException e) {
			return 0;
		}
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(date);
		 int intmonth = cal.get(Calendar.MONTH)+1;
		  System.out.println("Returning month for "+month +"  "+intmonth);
		return intmonth;
	}

	private com.rms.services.schema.SearchResults getPersonFromDB(NameDetail nameDetail) {
		// TODO Auto-generated method stub
		com.rms.services.schema.SearchResults res = new SearchResults();
		res.setEntityId(""+nameDetail.getPersonEntity().getEntityId());
		res.setBirthPlace(""+nameDetail.getPersonEntity().getBirthplace());
		res.setActivestatus(""+nameDetail.getPersonEntity().getActivestatus());
		res.setDate(nameDetail.getPersonEntity().getDate().toString());
		
		res.setFirstName(nameDetail.getFirstname());
		res.setLastName(nameDetail.getSurname());
		res.setMiddleName(nameDetail.getMiddlename());
		res.setMiddleName(nameDetail.getMaidenname());
		res.setEntityName(nameDetail.getEntityname());

		res.setEntityType(nameDetail.getPersonEntity().getEntityType());
		res.setGender(nameDetail.getPersonEntity().getGender());
		
		
		//if (dbCust.getDateDetails()!= null && dbCust.getDateDetails().size() > 0 )
		//res.setDateDetail(dbCust.getDateDetails().);
		// 
		
		
		
		return res;
	}

}
