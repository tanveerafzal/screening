package com.rms.services.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * AddressDetail entity.
 * 
 * <p>
 * Java class for AddressDetail complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AddressDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="addrType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addressline" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addresscity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addresscountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="countyId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
@XmlType(name = "AddressDetail", propOrder = { "addressId", "addrType",
		"addressline", "addresscity", "addresscountry", "countyId", "comments",
		"createdByUser", "createdDate" })
public class AddressDetail {

	@XmlElement(required = true)
	protected BigInteger addressId;
	@XmlElement(required = true)
	protected String addrType;
	@XmlElement(required = true)
	protected String addressline;
	@XmlElement(required = true)
	protected String addresscity;
	@XmlElement(required = true)
	protected String addresscountry;
	@XmlElement(required = true)
	protected BigInteger countyId;
	@XmlElement(required = true)
	protected String comments;
	@XmlElement(required = true)
	protected String createdByUser;
	@XmlElement(required = true)
	protected String createdDate;

	/**
	 * Gets the value of the addressId property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getAddressId() {
		return addressId;
	}

	/**
	 * Sets the value of the addressId property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setAddressId(BigInteger value) {
		this.addressId = value;
	}

	/**
	 * Gets the value of the addrType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAddrType() {
		return addrType;
	}

	/**
	 * Sets the value of the addrType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAddrType(String value) {
		this.addrType = value;
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
	 * Gets the value of the countyId property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getCountyId() {
		return countyId;
	}

	/**
	 * Sets the value of the countyId property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setCountyId(BigInteger value) {
		this.countyId = value;
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
