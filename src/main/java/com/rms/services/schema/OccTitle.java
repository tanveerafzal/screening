package com.rms.services.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * OccTitle entity.
 * 
 * <p>
 * Java class for OccTitle complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="OccTitle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="occTitleId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="occCat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sinceday" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sincemonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sinceyear" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="today" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tomonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toyear" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OccTitle", propOrder = { "occTitleId", "occCat", "sinceday",
		"sincemonth", "sinceyear", "today", "tomonth", "toyear" })
public class OccTitle {

	@XmlElement(required = true)
	protected BigInteger occTitleId;
	@XmlElement(required = true)
	protected String occCat;
	@XmlElement(required = true)
	protected String sinceday;
	@XmlElement(required = true)
	protected String sincemonth;
	@XmlElement(required = true)
	protected String sinceyear;
	@XmlElement(required = true)
	protected String today;
	@XmlElement(required = true)
	protected String tomonth;
	@XmlElement(required = true)
	protected String toyear;

	/**
	 * Gets the value of the occTitleId property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getOccTitleId() {
		return occTitleId;
	}

	/**
	 * Sets the value of the occTitleId property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setOccTitleId(BigInteger value) {
		this.occTitleId = value;
	}

	/**
	 * Gets the value of the occCat property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOccCat() {
		return occCat;
	}

	/**
	 * Sets the value of the occCat property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOccCat(String value) {
		this.occCat = value;
	}

	/**
	 * Gets the value of the sinceday property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSinceday() {
		return sinceday;
	}

	/**
	 * Sets the value of the sinceday property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSinceday(String value) {
		this.sinceday = value;
	}

	/**
	 * Gets the value of the sincemonth property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSincemonth() {
		return sincemonth;
	}

	/**
	 * Sets the value of the sincemonth property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSincemonth(String value) {
		this.sincemonth = value;
	}

	/**
	 * Gets the value of the sinceyear property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSinceyear() {
		return sinceyear;
	}

	/**
	 * Sets the value of the sinceyear property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSinceyear(String value) {
		this.sinceyear = value;
	}

	/**
	 * Gets the value of the today property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getToday() {
		return today;
	}

	/**
	 * Sets the value of the today property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setToday(String value) {
		this.today = value;
	}

	/**
	 * Gets the value of the tomonth property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTomonth() {
		return tomonth;
	}

	/**
	 * Sets the value of the tomonth property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTomonth(String value) {
		this.tomonth = value;
	}

	/**
	 * Gets the value of the toyear property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getToyear() {
		return toyear;
	}

	/**
	 * Sets the value of the toyear property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setToyear(String value) {
		this.toyear = value;
	}

}
