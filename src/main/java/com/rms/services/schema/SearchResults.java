package com.rms.services.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SearchResults complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activestatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profileNotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maidenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RoleDetail" type="{http://www.remitservices.com/dowjone}RoleDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CompanyDetails" type="{http://www.remitservices.com/dowjone}CompanyDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CountryDetails" type="{http://www.remitservices.com/dowjone}CountryDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VesselDetails" type="{http://www.remitservices.com/dowjone}VesselDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DateDetail" type="{http://www.remitservices.com/dowjone}DateDetail"/>
 *         &lt;element name="OccTitle" type="{http://www.remitservices.com/dowjone}OccTitle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddressDetail" type="{http://www.remitservices.com/dowjone}AddressDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SanctionsReferences" type="{http://www.remitservices.com/dowjone}SanctionsReferences" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResults", propOrder = { "entityId", "entityType",
		"date", "gender", "activestatus", "birthPlace", "profileNotes",
		"firstName", "lastName", "middleName", "maidenName", "entityName",
		"roleDetail", "companyDetails", "countryDetails", "vesselDetails",
		"dateDetail", "occTitle", "addressDetail", "sanctionsReferences" })
public class SearchResults {

	@XmlElement(required = true)
	protected String entityId;
	@XmlElement(required = true)
	protected String entityType;
	@XmlElement(required = true)
	protected String date;
	protected String gender;
	protected String activestatus;
	protected String birthPlace;
	@XmlElement(required = true)
	protected String profileNotes;
	@XmlElement(required = true)
	protected String firstName;
	@XmlElement(required = true)
	protected String lastName;
	@XmlElement(required = true)
	protected String middleName;
	@XmlElement(required = true)
	protected String maidenName;
	@XmlElement(required = true)
	protected String entityName;
	@XmlElement(name = "RoleDetail")
	protected List<RoleDetail> roleDetail;
	@XmlElement(name = "CompanyDetails")
	protected List<CompanyDetails> companyDetails;
	@XmlElement(name = "CountryDetails")
	protected List<CountryDetails> countryDetails;
	@XmlElement(name = "VesselDetails")
	protected List<VesselDetails> vesselDetails;
	@XmlElement(name = "DateDetail", required = true)
	protected DateDetail dateDetail;
	@XmlElement(name = "OccTitle")
	protected List<OccTitle> occTitle;
	@XmlElement(name = "AddressDetail")
	protected List<AddressDetail> addressDetail;
	@XmlElement(name = "SanctionsReferences")
	protected List<SanctionsReferences> sanctionsReferences;

	/**
	 * Gets the value of the entityId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEntityId() {
		return entityId;
	}

	/**
	 * Sets the value of the entityId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEntityId(String value) {
		this.entityId = value;
	}

	/**
	 * Gets the value of the entityType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEntityType() {
		return entityType;
	}

	/**
	 * Sets the value of the entityType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEntityType(String value) {
		this.entityType = value;
	}

	/**
	 * Gets the value of the date property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Sets the value of the date property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDate(String value) {
		this.date = value;
	}

	/**
	 * Gets the value of the gender property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the value of the gender property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGender(String value) {
		this.gender = value;
	}

	/**
	 * Gets the value of the activestatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getActivestatus() {
		return activestatus;
	}

	/**
	 * Sets the value of the activestatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setActivestatus(String value) {
		this.activestatus = value;
	}

	/**
	 * Gets the value of the birthPlace property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBirthPlace() {
		return birthPlace;
	}

	/**
	 * Sets the value of the birthPlace property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBirthPlace(String value) {
		this.birthPlace = value;
	}

	/**
	 * Gets the value of the profileNotes property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProfileNotes() {
		return profileNotes;
	}

	/**
	 * Sets the value of the profileNotes property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProfileNotes(String value) {
		this.profileNotes = value;
	}

	/**
	 * Gets the value of the firstName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the value of the firstName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFirstName(String value) {
		this.firstName = value;
	}

	/**
	 * Gets the value of the lastName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the value of the lastName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLastName(String value) {
		this.lastName = value;
	}

	/**
	 * Gets the value of the middleName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * Sets the value of the middleName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMiddleName(String value) {
		this.middleName = value;
	}

	/**
	 * Gets the value of the maidenName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMaidenName() {
		return maidenName;
	}

	/**
	 * Sets the value of the maidenName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMaidenName(String value) {
		this.maidenName = value;
	}

	/**
	 * Gets the value of the entityName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEntityName() {
		return entityName;
	}

	/**
	 * Sets the value of the entityName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEntityName(String value) {
		this.entityName = value;
	}

	/**
	 * Gets the value of the roleDetail property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the roleDetail property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRoleDetail().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link RoleDetail }
	 * 
	 * 
	 */
	public List<RoleDetail> getRoleDetail() {
		if (roleDetail == null) {
			roleDetail = new ArrayList<RoleDetail>();
		}
		return this.roleDetail;
	}

	/**
	 * Gets the value of the companyDetails property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the companyDetails property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getCompanyDetails().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CompanyDetails }
	 * 
	 * 
	 */
	public List<CompanyDetails> getCompanyDetails() {
		if (companyDetails == null) {
			companyDetails = new ArrayList<CompanyDetails>();
		}
		return this.companyDetails;
	}

	/**
	 * Gets the value of the countryDetails property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the countryDetails property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getCountryDetails().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CountryDetails }
	 * 
	 * 
	 */
	public List<CountryDetails> getCountryDetails() {
		if (countryDetails == null) {
			countryDetails = new ArrayList<CountryDetails>();
		}
		return this.countryDetails;
	}

	/**
	 * Gets the value of the vesselDetails property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the vesselDetails property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getVesselDetails().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link VesselDetails }
	 * 
	 * 
	 */
	public List<VesselDetails> getVesselDetails() {
		if (vesselDetails == null) {
			vesselDetails = new ArrayList<VesselDetails>();
		}
		return this.vesselDetails;
	}

	/**
	 * Gets the value of the dateDetail property.
	 * 
	 * @return possible object is {@link DateDetail }
	 * 
	 */
	public DateDetail getDateDetail() {
		return dateDetail;
	}

	/**
	 * Sets the value of the dateDetail property.
	 * 
	 * @param value
	 *            allowed object is {@link DateDetail }
	 * 
	 */
	public void setDateDetail(DateDetail value) {
		this.dateDetail = value;
	}

	/**
	 * Gets the value of the occTitle property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the occTitle property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getOccTitle().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link OccTitle }
	 * 
	 * 
	 */
	public List<OccTitle> getOccTitle() {
		if (occTitle == null) {
			occTitle = new ArrayList<OccTitle>();
		}
		return this.occTitle;
	}

	/**
	 * Gets the value of the addressDetail property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the addressDetail property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAddressDetail().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AddressDetail }
	 * 
	 * 
	 */
	public List<AddressDetail> getAddressDetail() {
		if (addressDetail == null) {
			addressDetail = new ArrayList<AddressDetail>();
		}
		return this.addressDetail;
	}

	/**
	 * Gets the value of the sanctionsReferences property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the sanctionsReferences property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSanctionsReferences().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link SanctionsReferences }
	 * 
	 * 
	 */
	public List<SanctionsReferences> getSanctionsReferences() {
		if (sanctionsReferences == null) {
			sanctionsReferences = new ArrayList<SanctionsReferences>();
		}
		return this.sanctionsReferences;
	}

}
