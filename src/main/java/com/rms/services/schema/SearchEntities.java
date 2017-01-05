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
 *         &lt;element name="context" type="{http://www.remitservices.com/common}Context"/>
 *         &lt;element name="searchCriteria" type="{http://www.remitservices.com/dowjone}SearchCriteria"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "context", "searchCriteria" })
@XmlRootElement(name = "searchEntities", namespace = "http://www.remitservices.com/ScreeningService/")
public class SearchEntities {

	@XmlElement(required = true)
	protected Context context;
	@XmlElement(required = true)
	protected SearchCriteria searchCriteria;

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

	/**
	 * Gets the value of the searchCriteria property.
	 * 
	 * @return possible object is {@link SearchCriteria }
	 * 
	 */
	public SearchCriteria getSearchCriteria() {
		return searchCriteria;
	}

	/**
	 * Sets the value of the searchCriteria property.
	 * 
	 * @param value
	 *            allowed object is {@link SearchCriteria }
	 * 
	 */
	public void setSearchCriteria(SearchCriteria value) {
		this.searchCriteria = value;
	}

}
