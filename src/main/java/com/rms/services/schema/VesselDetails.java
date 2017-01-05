package com.rms.services.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * VesselDetails entity.
 * 
 * <p>
 * Java class for VesselDetails complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="VesselDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="vesselcallsign" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vesseltype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vesseltonnage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vesselgrt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vesselowner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vesselflag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VesselDetails", propOrder = { "id", "vesselcallsign",
		"vesseltype", "vesseltonnage", "vesselgrt", "vesselowner", "vesselflag" })
public class VesselDetails {

	@XmlElement(required = true)
	protected BigInteger id;
	@XmlElement(required = true)
	protected String vesselcallsign;
	@XmlElement(required = true)
	protected String vesseltype;
	@XmlElement(required = true)
	protected String vesseltonnage;
	@XmlElement(required = true)
	protected String vesselgrt;
	@XmlElement(required = true)
	protected String vesselowner;
	@XmlElement(required = true)
	protected String vesselflag;

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
	 * Gets the value of the vesselcallsign property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVesselcallsign() {
		return vesselcallsign;
	}

	/**
	 * Sets the value of the vesselcallsign property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVesselcallsign(String value) {
		this.vesselcallsign = value;
	}

	/**
	 * Gets the value of the vesseltype property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVesseltype() {
		return vesseltype;
	}

	/**
	 * Sets the value of the vesseltype property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVesseltype(String value) {
		this.vesseltype = value;
	}

	/**
	 * Gets the value of the vesseltonnage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVesseltonnage() {
		return vesseltonnage;
	}

	/**
	 * Sets the value of the vesseltonnage property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVesseltonnage(String value) {
		this.vesseltonnage = value;
	}

	/**
	 * Gets the value of the vesselgrt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVesselgrt() {
		return vesselgrt;
	}

	/**
	 * Sets the value of the vesselgrt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVesselgrt(String value) {
		this.vesselgrt = value;
	}

	/**
	 * Gets the value of the vesselowner property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVesselowner() {
		return vesselowner;
	}

	/**
	 * Sets the value of the vesselowner property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVesselowner(String value) {
		this.vesselowner = value;
	}

	/**
	 * Gets the value of the vesselflag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVesselflag() {
		return vesselflag;
	}

	/**
	 * Sets the value of the vesselflag property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVesselflag(String value) {
		this.vesselflag = value;
	}

}
