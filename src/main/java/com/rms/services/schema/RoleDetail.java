package com.rms.services.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * RoleDetail entity.
 * 
 * <p>
 * Java class for RoleDetail complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RoleDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roleDetailId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="roleType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleDetail", propOrder = { "roleDetailId", "roleType" })
public class RoleDetail {

	@XmlElement(required = true)
	protected BigInteger roleDetailId;
	@XmlElement(required = true)
	protected String roleType;

	/**
	 * Gets the value of the roleDetailId property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getRoleDetailId() {
		return roleDetailId;
	}

	/**
	 * Sets the value of the roleDetailId property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setRoleDetailId(BigInteger value) {
		this.roleDetailId = value;
	}

	/**
	 * Gets the value of the roleType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRoleType() {
		return roleType;
	}

	/**
	 * Sets the value of the roleType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRoleType(String value) {
		this.roleType = value;
	}

}
