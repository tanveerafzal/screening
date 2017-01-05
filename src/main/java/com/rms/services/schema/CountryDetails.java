package com.rms.services.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * CountryDetails entity.
 * 
 * <p>
 * Java class for CountryDetails complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CountryDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="person" type="{http://www.remitservices.com/dowjone}Person"/>
 *         &lt;element name="entities" type="{http://www.remitservices.com/dowjone}Entities"/>
 *         &lt;element name="countryType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryDetails", propOrder = { "id", "person", "entities",
		"countryType", "code", "value" })
public class CountryDetails {

	@XmlElement(required = true)
	protected BigInteger id;
	@XmlElement(required = true)
	protected Person person;
	@XmlElement(required = true)
	protected Entities entities;
	@XmlElement(required = true)
	protected String countryType;
	@XmlElement(required = true)
	protected String code;
	@XmlElement(required = true)
	protected String value;

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
	 * Gets the value of the person property.
	 * 
	 * @return possible object is {@link Person }
	 * 
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * Sets the value of the person property.
	 * 
	 * @param value
	 *            allowed object is {@link Person }
	 * 
	 */
	public void setPerson(Person value) {
		this.person = value;
	}

	/**
	 * Gets the value of the entities property.
	 * 
	 * @return possible object is {@link Entities }
	 * 
	 */
	public Entities getEntities() {
		return entities;
	}

	/**
	 * Sets the value of the entities property.
	 * 
	 * @param value
	 *            allowed object is {@link Entities }
	 * 
	 */
	public void setEntities(Entities value) {
		this.entities = value;
	}

	/**
	 * Gets the value of the countryType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCountryType() {
		return countryType;
	}

	/**
	 * Sets the value of the countryType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCountryType(String value) {
		this.countryType = value;
	}

	/**
	 * Gets the value of the code property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the value of the code property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCode(String value) {
		this.code = value;
	}

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
