package com.rms.services.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="context" type="{http://www.remitservices.com/common}Context"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "entityId", "context" })
@XmlRootElement(name = "getEntityDetail", namespace = "http://www.remitservices.com/ScreeningService/")
public class GetEntityDetail {

	protected Integer entityId;
	@XmlElement(required = true)
	protected Context context;

	/**
	 * Gets the value of the entityId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getEntityId() {
		return entityId;
	}

	/**
	 * Sets the value of the entityId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setEntityId(Integer value) {
		this.entityId = value;
	}

	/**
	 * Gets the value of the context property.
	 * 
	 * @return possible object is {@link Context }
	 * 
	 */
	public Context getContext() {
		return context;
	}

	/**
	 * Sets the value of the context property.
	 * 
	 * @param value
	 *            allowed object is {@link Context }
	 * 
	 */
	public void setContext(Context value) {
		this.context = value;
	}

}
