package com.rms.services.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * DateDetail entity.
 * 
 * <p>
 * Java class for DateDetail complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DateDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateDetailId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="roleType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateDetail", propOrder = { "dateDetailId", "roleType", "day",
		"month", "year", "notes" })
public class DateDetail {

	@XmlElement(required = true)
	protected BigInteger dateDetailId;
	@XmlElement(required = true)
	protected String roleType;
	@XmlElement(required = true)
	protected String day;
	@XmlElement(required = true)
	protected String month;
	@XmlElement(required = true)
	protected String year;
	@XmlElement(required = true)
	protected String notes;

	/**
	 * Gets the value of the dateDetailId property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getDateDetailId() {
		return dateDetailId;
	}

	/**
	 * Sets the value of the dateDetailId property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setDateDetailId(BigInteger value) {
		this.dateDetailId = value;
	}

	/**
	 * Gets the value of the roleType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRoleType() {
		return roleType;
	}

	/**
	 * Sets the value of the roleType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRoleType(String value) {
		this.roleType = value;
	}

	/**
	 * Gets the value of the day property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDay() {
		return day;
	}

	/**
	 * Sets the value of the day property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDay(String value) {
		this.day = value;
	}

	/**
	 * Gets the value of the month property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMonth() {
		return month;
	}

	/**
	 * Sets the value of the month property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMonth(String value) {
		this.month = value;
	}

	/**
	 * Gets the value of the year property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getYear() {
		return year;
	}

	/**
	 * Sets the value of the year property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setYear(String value) {
		this.year = value;
	}

	/**
	 * Gets the value of the notes property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * Sets the value of the notes property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNotes(String value) {
		this.notes = value;
	}

}
