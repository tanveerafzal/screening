package com.rms.services.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SearchCriteria complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfBirth" type="{http://www.remitservices.com/dowjone}DateOfBirth"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteria", propOrder = { "entityId", "firstName",
		"lastName", "middleName", "entityName", "searchType", "dateOfBirth" })
public class SearchCriteria {

	protected Integer entityId;
	protected String firstName;
	protected String lastName;
	protected String middleName;
	protected String entityName;
	protected String searchType;
	@XmlElement(name = "DateOfBirth", required = true)
	protected DateOfBirth dateOfBirth;

	/**
	 * Gets the value of the entityId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getEntityId() {
		return entityId;
	}

	/**
	 * Sets the value of the entityId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setEntityId(Integer value) {
		this.entityId = value;
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
	 * Gets the value of the searchType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSearchType() {
		return searchType;
	}

	/**
	 * Sets the value of the searchType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSearchType(String value) {
		this.searchType = value;
	}

	/**
	 * Gets the value of the dateOfBirth property.
	 * 
	 * @return possible object is {@link DateOfBirth }
	 * 
	 */
	public DateOfBirth getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * Sets the value of the dateOfBirth property.
	 * 
	 * @param value
	 *            allowed object is {@link DateOfBirth }
	 * 
	 */
	public void setDateOfBirth(DateOfBirth value) {
		this.dateOfBirth = value;
	}

}
