package com.rms.services.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Person entity.
 * 
 * <p>
 * Java class for Person complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="activestatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deceased" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nameId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="descriptionId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="roleDetailId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="birthplace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createdByUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="profilenotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="countryDetailses" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addressDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = { "personId", "action", "date", "gender",
		"activestatus", "deceased", "nameId", "descriptionId", "roleDetailId",
		"birthplace", "comments", "createdByUser", "createdDate",
		"profilenotes", "dateDetails", "countryDetailses", "addressDetails" })
public class Person {

	@XmlElement(required = true)
	protected BigInteger personId;
	@XmlElement(required = true)
	protected String action;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar date;
	@XmlElement(required = true)
	protected String gender;
	@XmlElement(required = true)
	protected String activestatus;
	@XmlElement(required = true)
	protected String deceased;
	@XmlElement(required = true)
	protected BigInteger nameId;
	@XmlElement(required = true)
	protected BigInteger descriptionId;
	@XmlElement(required = true)
	protected BigInteger roleDetailId;
	@XmlElement(required = true)
	protected String birthplace;
	@XmlElement(required = true)
	protected String comments;
	@XmlElement(required = true)
	protected String createdByUser;
	@XmlElement(required = true)
	protected String createdDate;
	@XmlElement(required = true)
	protected String profilenotes;
	@XmlElement(required = true)
	protected String dateDetails;
	@XmlElement(required = true)
	protected String countryDetailses;
	@XmlElement(required = true)
	protected String addressDetails;

	/**
	 * Gets the value of the personId property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getPersonId() {
		return personId;
	}

	/**
	 * Sets the value of the personId property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setPersonId(BigInteger value) {
		this.personId = value;
	}

	/**
	 * Gets the value of the action property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAction() {
		return action;
	}

	/**
	 * Sets the value of the action property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAction(String value) {
		this.action = value;
	}

	/**
	 * Gets the value of the date property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDate() {
		return date;
	}

	/**
	 * Sets the value of the date property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDate(XMLGregorianCalendar value) {
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
	 * Gets the value of the deceased property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeceased() {
		return deceased;
	}

	/**
	 * Sets the value of the deceased property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDeceased(String value) {
		this.deceased = value;
	}

	/**
	 * Gets the value of the nameId property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getNameId() {
		return nameId;
	}

	/**
	 * Sets the value of the nameId property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setNameId(BigInteger value) {
		this.nameId = value;
	}

	/**
	 * Gets the value of the descriptionId property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getDescriptionId() {
		return descriptionId;
	}

	/**
	 * Sets the value of the descriptionId property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setDescriptionId(BigInteger value) {
		this.descriptionId = value;
	}

	/**
	 * Gets the value of the roleDetailId property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getRoleDetailId() {
		return roleDetailId;
	}

	/**
	 * Sets the value of the roleDetailId property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setRoleDetailId(BigInteger value) {
		this.roleDetailId = value;
	}

	/**
	 * Gets the value of the birthplace property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBirthplace() {
		return birthplace;
	}

	/**
	 * Sets the value of the birthplace property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBirthplace(String value) {
		this.birthplace = value;
	}

	/**
	 * Gets the value of the comments property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * Sets the value of the comments property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setComments(String value) {
		this.comments = value;
	}

	/**
	 * Gets the value of the createdByUser property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreatedByUser() {
		return createdByUser;
	}

	/**
	 * Sets the value of the createdByUser property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreatedByUser(String value) {
		this.createdByUser = value;
	}

	/**
	 * Gets the value of the createdDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets the value of the createdDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreatedDate(String value) {
		this.createdDate = value;
	}

	/**
	 * Gets the value of the profilenotes property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProfilenotes() {
		return profilenotes;
	}

	/**
	 * Sets the value of the profilenotes property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProfilenotes(String value) {
		this.profilenotes = value;
	}

	/**
	 * Gets the value of the dateDetails property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDateDetails() {
		return dateDetails;
	}

	/**
	 * Sets the value of the dateDetails property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDateDetails(String value) {
		this.dateDetails = value;
	}

	/**
	 * Gets the value of the countryDetailses property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCountryDetailses() {
		return countryDetailses;
	}

	/**
	 * Sets the value of the countryDetailses property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCountryDetailses(String value) {
		this.countryDetailses = value;
	}

	/**
	 * Gets the value of the addressDetails property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAddressDetails() {
		return addressDetails;
	}

	/**
	 * Sets the value of the addressDetails property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAddressDetails(String value) {
		this.addressDetails = value;
	}

}
