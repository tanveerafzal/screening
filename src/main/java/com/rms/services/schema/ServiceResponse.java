package com.rms.services.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ServiceResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fault" type="{http://www.remitservices.com/common}BaseFault" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceResponse", namespace = "http://www.remitservices.com/common", propOrder = {
		"confirmationNumber", "status", "id", "version", "fault" })
public class ServiceResponse {

	protected String confirmationNumber;
	protected String status;
	protected Integer id;
	protected Integer version;
	protected BaseFault fault;

	/**
	 * Gets the value of the confirmationNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConfirmationNumber() {
		return confirmationNumber;
	}

	/**
	 * Sets the value of the confirmationNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConfirmationNumber(String value) {
		this.confirmationNumber = value;
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
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setId(Integer value) {
		this.id = value;
	}

	/**
	 * Gets the value of the version property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * Sets the value of the version property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setVersion(Integer value) {
		this.version = value;
	}

	/**
	 * Gets the value of the fault property.
	 * 
	 * @return possible object is {@link BaseFault }
	 * 
	 */
	public BaseFault getFault() {
		return fault;
	}

	/**
	 * Sets the value of the fault property.
	 * 
	 * @param value
	 *            allowed object is {@link BaseFault }
	 * 
	 */
	public void setFault(BaseFault value) {
		this.fault = value;
	}

}
