package com.rms.services.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * SourceDescription entity.
 * 
 * <p>
 * Java class for SourceDescription complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SourceDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="entiryId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceDescription", propOrder = { "id", "entiryId" })
public class SourceDescription {

	@XmlElement(required = true)
	protected BigInteger id;
	@XmlElement(required = true)
	protected BigInteger entiryId;

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

}
