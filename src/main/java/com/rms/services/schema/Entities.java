package com.rms.services.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Entities entity.
 * 
 * <p>
 * Java class for Entities complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Entities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entities", propOrder = { "entityId", "action", "date" })
public class Entities {

	@XmlElement(required = true)
	protected BigInteger entityId;
	@XmlElement(required = true)
	protected String action;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar date;

	/**
	 * Gets the value of the entityId property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getEntityId() {
		return entityId;
	}

	/**
	 * Sets the value of the entityId property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setEntityId(BigInteger value) {
		this.entityId = value;
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

}
