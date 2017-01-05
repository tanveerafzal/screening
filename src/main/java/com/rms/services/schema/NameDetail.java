package com.rms.services.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * NameDetail entity.
 * 
 * <p>
 * Java class for NameDetail complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="NameDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="titlehonorific" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="middlename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maidenname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entityname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="singlestringname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originalscriptname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createdByUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameDetail", propOrder = { "nameId", "titlehonorific",
		"firstname", "middlename", "surname", "maidenname", "suffix",
		"entityname", "singlestringname", "originalscriptname", "comments",
		"createdByUser", "createdDate" })
public class NameDetail {

	@XmlElement(required = true)
	protected BigInteger nameId;
	@XmlElement(required = true)
	protected String titlehonorific;
	@XmlElement(required = true)
	protected String firstname;
	@XmlElement(required = true)
	protected String middlename;
	@XmlElement(required = true)
	protected String surname;
	@XmlElement(required = true)
	protected String maidenname;
	@XmlElement(required = true)
	protected String suffix;
	@XmlElement(required = true)
	protected String entityname;
	@XmlElement(required = true)
	protected String singlestringname;
	@XmlElement(required = true)
	protected String originalscriptname;
	@XmlElement(required = true)
	protected String comments;
	@XmlElement(required = true)
	protected String createdByUser;
	@XmlElement(required = true)
	protected String createdDate;

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
	 * Gets the value of the titlehonorific property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTitlehonorific() {
		return titlehonorific;
	}

	/**
	 * Sets the value of the titlehonorific property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTitlehonorific(String value) {
		this.titlehonorific = value;
	}

	/**
	 * Gets the value of the firstname property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Sets the value of the firstname property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFirstname(String value) {
		this.firstname = value;
	}

	/**
	 * Gets the value of the middlename property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMiddlename() {
		return middlename;
	}

	/**
	 * Sets the value of the middlename property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMiddlename(String value) {
		this.middlename = value;
	}

	/**
	 * Gets the value of the surname property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Sets the value of the surname property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSurname(String value) {
		this.surname = value;
	}

	/**
	 * Gets the value of the maidenname property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMaidenname() {
		return maidenname;
	}

	/**
	 * Sets the value of the maidenname property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMaidenname(String value) {
		this.maidenname = value;
	}

	/**
	 * Gets the value of the suffix property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * Sets the value of the suffix property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSuffix(String value) {
		this.suffix = value;
	}

	/**
	 * Gets the value of the entityname property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEntityname() {
		return entityname;
	}

	/**
	 * Sets the value of the entityname property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEntityname(String value) {
		this.entityname = value;
	}

	/**
	 * Gets the value of the singlestringname property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSinglestringname() {
		return singlestringname;
	}

	/**
	 * Sets the value of the singlestringname property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSinglestringname(String value) {
		this.singlestringname = value;
	}

	/**
	 * Gets the value of the originalscriptname property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOriginalscriptname() {
		return originalscriptname;
	}

	/**
	 * Sets the value of the originalscriptname property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOriginalscriptname(String value) {
		this.originalscriptname = value;
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

}
