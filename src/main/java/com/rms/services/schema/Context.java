package com.rms.services.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Context complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Context">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="applicationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Context", namespace = "http://www.remitservices.com/common", propOrder = {
		"language", "token", "ipaddress", "loginName", "loginId",
		"applicationCode", "clientId", "password" })
public class Context {

	protected String language;
	protected String token;
	protected String ipaddress;
	protected String loginName;
	protected Integer loginId;
	protected String applicationCode;
	protected Integer clientId;
	protected String password;

	/**
	 * Gets the value of the language property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the value of the language property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLanguage(String value) {
		this.language = value;
	}

	/**
	 * Gets the value of the token property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getToken() {
		return token;
	}

	/**
	 * Sets the value of the token property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setToken(String value) {
		this.token = value;
	}

	/**
	 * Gets the value of the ipaddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIpaddress() {
		return ipaddress;
	}

	/**
	 * Sets the value of the ipaddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIpaddress(String value) {
		this.ipaddress = value;
	}

	/**
	 * Gets the value of the loginName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * Sets the value of the loginName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLoginName(String value) {
		this.loginName = value;
	}

	/**
	 * Gets the value of the loginId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getLoginId() {
		return loginId;
	}

	/**
	 * Sets the value of the loginId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setLoginId(Integer value) {
		this.loginId = value;
	}

	/**
	 * Gets the value of the applicationCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getApplicationCode() {
		return applicationCode;
	}

	/**
	 * Sets the value of the applicationCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setApplicationCode(String value) {
		this.applicationCode = value;
	}

	/**
	 * Gets the value of the clientId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getClientId() {
		return clientId;
	}

	/**
	 * Sets the value of the clientId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setClientId(Integer value) {
		this.clientId = value;
	}

	/**
	 * Gets the value of the password property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the value of the password property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPassword(String value) {
		this.password = value;
	}

}
