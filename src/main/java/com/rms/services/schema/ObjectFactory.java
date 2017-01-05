package com.rms.services.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.rms.services.schema package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _SourceDescription_QNAME = new QName(
			"http://www.remitservices.com/dowjone", "SourceDescription");
	private final static QName _RoleDetail_QNAME = new QName(
			"http://www.remitservices.com/dowjone", "RoleDetail");
	private final static QName _AddressDetail_QNAME = new QName(
			"http://www.remitservices.com/dowjone", "AddressDetail");
	private final static QName _NameDetail_QNAME = new QName(
			"http://www.remitservices.com/dowjone", "NameDetail");
	private final static QName _SanctionsReferences_QNAME = new QName(
			"http://www.remitservices.com/dowjone", "SanctionsReferences");
	private final static QName _EntityDescription_QNAME = new QName(
			"http://www.remitservices.com/dowjone", "EntityDescription");
	private final static QName _OccTitle_QNAME = new QName(
			"http://www.remitservices.com/dowjone", "OccTitle");
	private final static QName _DateOfBirth_QNAME = new QName(
			"http://www.remitservices.com/dowjone", "DateOfBirth");
	private final static QName _Person_QNAME = new QName(
			"http://www.remitservices.com/dowjone", "Person");
	private final static QName _CompanyDetails_QNAME = new QName(
			"http://www.remitservices.com/dowjone", "CompanyDetails");
	private final static QName _IdnumberTypes_QNAME = new QName(
			"http://www.remitservices.com/dowjone", "IdnumberTypes");
	private final static QName _SearchResults_QNAME = new QName(
			"http://www.remitservices.com/dowjone", "SearchResults");
	private final static QName _VesselDetails_QNAME = new QName(
			"http://www.remitservices.com/dowjone", "VesselDetails");
	private final static QName _Entities_QNAME = new QName(
			"http://www.remitservices.com/dowjone", "Entities");
	private final static QName _DateDetail_QNAME = new QName(
			"http://www.remitservices.com/dowjone", "DateDetail");
	private final static QName _Fault_QNAME = new QName(
			"http://www.remitservices.com/ScreeningService/", "fault");
	private final static QName _SearchCriteria_QNAME = new QName(
			"http://www.remitservices.com/dowjone", "SearchCriteria");
	private final static QName _CountryDetails_QNAME = new QName(
			"http://www.remitservices.com/dowjone", "CountryDetails");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.rms.services.schema
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link DateRange }
	 * 
	 */
	public DateRange createDateRange() {
		return new DateRange();
	}

	/**
	 * Create an instance of {@link DateOfBirth }
	 * 
	 */
	public DateOfBirth createDateOfBirth() {
		return new DateOfBirth();
	}

	/**
	 * Create an instance of {@link SanctionsReferences }
	 * 
	 */
	public SanctionsReferences createSanctionsReferences() {
		return new SanctionsReferences();
	}

	/**
	 * Create an instance of {@link CompanyDetails }
	 * 
	 */
	public CompanyDetails createCompanyDetails() {
		return new CompanyDetails();
	}

	/**
	 * Create an instance of {@link Person }
	 * 
	 */
	public Person createPerson() {
		return new Person();
	}

	/**
	 * Create an instance of {@link EntityDescription }
	 * 
	 */
	public EntityDescription createEntityDescription() {
		return new EntityDescription();
	}

	/**
	 * Create an instance of {@link AddressDetail }
	 * 
	 */
	public AddressDetail createAddressDetail() {
		return new AddressDetail();
	}

	/**
	 * Create an instance of {@link Entities }
	 * 
	 */
	public Entities createEntities() {
		return new Entities();
	}

	/**
	 * Create an instance of {@link Context }
	 * 
	 */
	public Context createContext() {
		return new Context();
	}

	/**
	 * Create an instance of {@link SearchEntities }
	 * 
	 */
	public SearchEntities createSearchEntities() {
		return new SearchEntities();
	}

	/**
	 * Create an instance of {@link DateDetail }
	 * 
	 */
	public DateDetail createDateDetail() {
		return new DateDetail();
	}

	/**
	 * Create an instance of {@link CountryDetails }
	 * 
	 */
	public CountryDetails createCountryDetails() {
		return new CountryDetails();
	}

	/**
	 * Create an instance of {@link VesselDetails }
	 * 
	 */
	public VesselDetails createVesselDetails() {
		return new VesselDetails();
	}

	/**
	 * Create an instance of {@link ServiceResponse }
	 * 
	 */
	public ServiceResponse createServiceResponse() {
		return new ServiceResponse();
	}

	/**
	 * Create an instance of {@link OccTitle }
	 * 
	 */
	public OccTitle createOccTitle() {
		return new OccTitle();
	}

	/**
	 * Create an instance of {@link BaseType }
	 * 
	 */
	public BaseType createBaseType() {
		return new BaseType();
	}

	/**
	 * Create an instance of {@link SearchCriteria }
	 * 
	 */
	public SearchCriteria createSearchCriteria() {
		return new SearchCriteria();
	}

	/**
	 * Create an instance of {@link SearchResults }
	 * 
	 */
	public SearchResults createSearchResults() {
		return new SearchResults();
	}

	/**
	 * Create an instance of {@link SourceDescription }
	 * 
	 */
	public SourceDescription createSourceDescription() {
		return new SourceDescription();
	}

	/**
	 * Create an instance of {@link SearchEntitiesResponse }
	 * 
	 */
	public SearchEntitiesResponse createSearchEntitiesResponse() {
		return new SearchEntitiesResponse();
	}

	/**
	 * Create an instance of {@link RoleDetail }
	 * 
	 */
	public RoleDetail createRoleDetail() {
		return new RoleDetail();
	}

	/**
	 * Create an instance of {@link GetEntityDetail }
	 * 
	 */
	public GetEntityDetail createGetEntityDetail() {
		return new GetEntityDetail();
	}

	/**
	 * Create an instance of {@link IdnumberTypes }
	 * 
	 */
	public IdnumberTypes createIdnumberTypes() {
		return new IdnumberTypes();
	}

	/**
	 * Create an instance of {@link Description }
	 * 
	 */
	public Description createDescription() {
		return new Description();
	}

	/**
	 * Create an instance of {@link BaseFault }
	 * 
	 */
	public BaseFault createBaseFault() {
		return new BaseFault();
	}

	/**
	 * Create an instance of {@link NameDetail }
	 * 
	 */
	public NameDetail createNameDetail() {
		return new NameDetail();
	}

	/**
	 * Create an instance of {@link Attribute }
	 * 
	 */
	public Attribute createAttribute() {
		return new Attribute();
	}

	/**
	 * Create an instance of {@link GetEntityDetailResponse }
	 * 
	 */
	public GetEntityDetailResponse createGetEntityDetailResponse() {
		return new GetEntityDetailResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SourceDescription }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.remitservices.com/dowjone", name = "SourceDescription")
	public JAXBElement<SourceDescription> createSourceDescription(
			SourceDescription value) {
		return new JAXBElement<SourceDescription>(_SourceDescription_QNAME,
				SourceDescription.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link RoleDetail }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.remitservices.com/dowjone", name = "RoleDetail")
	public JAXBElement<RoleDetail> createRoleDetail(RoleDetail value) {
		return new JAXBElement<RoleDetail>(_RoleDetail_QNAME, RoleDetail.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AddressDetail }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.remitservices.com/dowjone", name = "AddressDetail")
	public JAXBElement<AddressDetail> createAddressDetail(AddressDetail value) {
		return new JAXBElement<AddressDetail>(_AddressDetail_QNAME,
				AddressDetail.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link NameDetail }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.remitservices.com/dowjone", name = "NameDetail")
	public JAXBElement<NameDetail> createNameDetail(NameDetail value) {
		return new JAXBElement<NameDetail>(_NameDetail_QNAME, NameDetail.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SanctionsReferences }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.remitservices.com/dowjone", name = "SanctionsReferences")
	public JAXBElement<SanctionsReferences> createSanctionsReferences(
			SanctionsReferences value) {
		return new JAXBElement<SanctionsReferences>(_SanctionsReferences_QNAME,
				SanctionsReferences.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link EntityDescription }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.remitservices.com/dowjone", name = "EntityDescription")
	public JAXBElement<EntityDescription> createEntityDescription(
			EntityDescription value) {
		return new JAXBElement<EntityDescription>(_EntityDescription_QNAME,
				EntityDescription.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link OccTitle }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.remitservices.com/dowjone", name = "OccTitle")
	public JAXBElement<OccTitle> createOccTitle(OccTitle value) {
		return new JAXBElement<OccTitle>(_OccTitle_QNAME, OccTitle.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DateOfBirth }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.remitservices.com/dowjone", name = "DateOfBirth")
	public JAXBElement<DateOfBirth> createDateOfBirth(DateOfBirth value) {
		return new JAXBElement<DateOfBirth>(_DateOfBirth_QNAME,
				DateOfBirth.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.remitservices.com/dowjone", name = "Person")
	public JAXBElement<Person> createPerson(Person value) {
		return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CompanyDetails }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.remitservices.com/dowjone", name = "CompanyDetails")
	public JAXBElement<CompanyDetails> createCompanyDetails(CompanyDetails value) {
		return new JAXBElement<CompanyDetails>(_CompanyDetails_QNAME,
				CompanyDetails.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link IdnumberTypes }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.remitservices.com/dowjone", name = "IdnumberTypes")
	public JAXBElement<IdnumberTypes> createIdnumberTypes(IdnumberTypes value) {
		return new JAXBElement<IdnumberTypes>(_IdnumberTypes_QNAME,
				IdnumberTypes.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SearchResults }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.remitservices.com/dowjone", name = "SearchResults")
	public JAXBElement<SearchResults> createSearchResults(SearchResults value) {
		return new JAXBElement<SearchResults>(_SearchResults_QNAME,
				SearchResults.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link VesselDetails }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.remitservices.com/dowjone", name = "VesselDetails")
	public JAXBElement<VesselDetails> createVesselDetails(VesselDetails value) {
		return new JAXBElement<VesselDetails>(_VesselDetails_QNAME,
				VesselDetails.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Entities }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.remitservices.com/dowjone", name = "Entities")
	public JAXBElement<Entities> createEntities(Entities value) {
		return new JAXBElement<Entities>(_Entities_QNAME, Entities.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DateDetail }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.remitservices.com/dowjone", name = "DateDetail")
	public JAXBElement<DateDetail> createDateDetail(DateDetail value) {
		return new JAXBElement<DateDetail>(_DateDetail_QNAME, DateDetail.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link BaseFault }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.remitservices.com/ScreeningService/", name = "fault")
	public JAXBElement<BaseFault> createFault(BaseFault value) {
		return new JAXBElement<BaseFault>(_Fault_QNAME, BaseFault.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SearchCriteria }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.remitservices.com/dowjone", name = "SearchCriteria")
	public JAXBElement<SearchCriteria> createSearchCriteria(SearchCriteria value) {
		return new JAXBElement<SearchCriteria>(_SearchCriteria_QNAME,
				SearchCriteria.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CountryDetails }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.remitservices.com/dowjone", name = "CountryDetails")
	public JAXBElement<CountryDetails> createCountryDetails(CountryDetails value) {
		return new JAXBElement<CountryDetails>(_CountryDetails_QNAME,
				CountryDetails.class, null, value);
	}

}
