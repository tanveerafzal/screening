package com.rms.services.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * CompanyDetails entity.
 * 
 * <p>
 * Java class for CompanyDetails complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="addressline" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addresscity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addresscountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyDetails", propOrder = { "id", "addressline",
		"addresscity", "addresscountry", "url", "comments" })
public class CompanyDetails {

	@XmlElement(required = true)
	protected BigInteger id;
	@XmlElement(required = true)
	protected String addressline;
	@XmlElement(required = true)
	protected String addresscity;
	@XmlElement(required = true)
	protected String addresscountry;
	@XmlElement(required = true)
	protected String url;
	@XmlElement(required = true)
	protected String comments;

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
	 * Gets the value of the addressline property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAddressline() {
		return addressline;
	}

	/**
	 * Sets the value of the addressline property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAddressline(String value) {
		this.addressline = value;
	}

	/**
	 * Gets the value of the addresscity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAddresscity() {
		return addresscity;
	}

	/**
	 * Sets the value of the addresscity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAddresscity(String value) {
		this.addresscity = value;
	}

	/**
	 * Gets the value of the addresscountry property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAddresscountry() {
		return addresscountry;
	}

	/**
	 * Sets the value of the addresscountry property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAddresscountry(String value) {
		this.addresscountry = value;
	}

	/**
	 * Gets the value of the url property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the value of the url property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUrl(String value) {
		this.url = value;
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

}
