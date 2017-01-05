package com.rms.services.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * SanctionsReferences entity.
 * 
 * <p>
 * Java class for SanctionsReferences complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SanctionsReferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="entiryId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="sinceday" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sincemonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sinceyear" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="today" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SanctionsReferences", propOrder = { "id", "entiryId",
		"sinceday", "sincemonth", "sinceyear", "today" })
public class SanctionsReferences {

	@XmlElement(required = true)
	protected BigInteger id;
	@XmlElement(required = true)
	protected BigInteger entiryId;
	@XmlElement(required = true)
	protected String sinceday;
	@XmlElement(required = true)
	protected String sincemonth;
	@XmlElement(required = true)
	protected String sinceyear;
	@XmlElement(required = true)
	protected String today;

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setId(BigInteger value) {
		this.id = value;
	}

	/**
	 * Gets the value of the entiryId property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getEntiryId() {
		return entiryId;
	}

	/**
	 * Sets the value of the entiryId property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setEntiryId(BigInteger value) {
		this.entiryId = value;
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

}
