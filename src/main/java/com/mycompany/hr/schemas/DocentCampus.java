//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.12 at 12:14:28 PM CEST 
//


package com.mycompany.hr.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for docentCampus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="docentCampus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="voornaam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="familienaam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="campusnaam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "docentCampus", propOrder = {
    "id",
    "voornaam",
    "familienaam",
    "campusnaam"
})
public class DocentCampus {

    protected long id;
    @XmlElement(required = true)
    protected String voornaam;
    @XmlElement(required = true)
    protected String familienaam;
    @XmlElement(required = true)
    protected String campusnaam;
    
    public DocentCampus() {
		super();
	}

	public DocentCampus(long id, String voornaam, String familienaam, String campusnaam) {
		super();
		this.id = id;
		this.voornaam = voornaam;
		this.familienaam = familienaam;
		this.campusnaam = campusnaam;
	}

	/**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the voornaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoornaam() {
        return voornaam;
    }

    /**
     * Sets the value of the voornaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoornaam(String value) {
        this.voornaam = value;
    }

    /**
     * Gets the value of the familienaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilienaam() {
        return familienaam;
    }

    /**
     * Sets the value of the familienaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilienaam(String value) {
        this.familienaam = value;
    }

    /**
     * Gets the value of the campusnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampusnaam() {
        return campusnaam;
    }

    /**
     * Sets the value of the campusnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampusnaam(String value) {
        this.campusnaam = value;
    }

}
