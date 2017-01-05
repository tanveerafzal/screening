package com.rms.services.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for BaseType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="BaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdByUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusUpdateDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalReference2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalReference3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseType", namespace = "http://www.remitservices.com/common", propOrder = {
		"createdByUser", "createdDate", "sourceSystem", "status",
		"statusUpdateDate", "comments", "externalReference",
		"externalReference2", "externalReference3", "action" })
public class BaseType {

	protected String createdByUser;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar createdDate;
	protected String sourceSystem;
	@XmlElement(required = true)
	protected String status;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar statusUpdateDate;
	@XmlElement(required = true)
	protected String comments;
	protected String externalReference;
	protected String externalReference2;
	protected String externalReference3;
	protected String action;

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
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets the value of the createdDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCreatedDate(XMLGregorianCalendar value) {
		this.createdDate = value;
	}

	/**
	 * Gets the value of the sourceSystem property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSourceSystem() {
		return sourceSystem;
	}

	/**
	 * Sets the value of the sourceSystem property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSourceSystem(String value) {
		this.sourceSystem = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatus(String value) {
		this.status = value;
	}

	/**
	 * Gets the value of the statusUpdateDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getStatusUpdateDate() {
		return statusUpdateDate;
	}

	/**
	 * Sets the value of the statusUpdateDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setStatusUpdateDate(XMLGregorianCalendar value) {
		this.statusUpdateDate = value;
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
	 * Gets the value of the externalReference property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExternalReference() {
		return externalReference;
	}

	/**
	 * Sets the value of the externalReference property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExternalReference(String value) {
		this.externalReference = value;
	}

	/**
	 * Gets the value of the externalReference2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExternalReference2() {
		return externalReference2;
	}

	/**
	 * Sets the value of the externalReference2 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExternalReference2(String value) {
		this.externalReference2 = value;
	}

	/**
	 * Gets the value of the externalReference3 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExternalReference3() {
		return externalReference3;
	}

	/**
	 * Sets the value of the externalReference3 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExternalReference3(String value) {
		this.externalReference3 = value;
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

}
