//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.04.30 at 06:20:20 PM CEST 
//


package org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs30.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType">
 *       &lt;sequence>
 *         &lt;element name="AddressFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TelephoneNumberFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmailAddressFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ParentQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}OrganizationQueryType" minOccurs="0"/>
 *         &lt;element name="ChildOrganizationQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}OrganizationQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrimaryContactQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}PersonQueryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationQueryType", propOrder = {
    "addressFilter",
    "telephoneNumberFilter",
    "emailAddressFilter",
    "parentQuery",
    "childOrganizationQuery",
    "primaryContactQuery"
})
public class OrganizationQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "AddressFilter")
    protected List<FilterType> addressFilter;
    @XmlElement(name = "TelephoneNumberFilter")
    protected List<FilterType> telephoneNumberFilter;
    @XmlElement(name = "EmailAddressFilter")
    protected List<FilterType> emailAddressFilter;
    @XmlElement(name = "ParentQuery")
    protected OrganizationQueryType parentQuery;
    @XmlElement(name = "ChildOrganizationQuery")
    protected List<OrganizationQueryType> childOrganizationQuery;
    @XmlElement(name = "PrimaryContactQuery")
    protected PersonQueryType primaryContactQuery;

    /**
     * Gets the value of the addressFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     */
    public List<FilterType> getAddressFilter() {
        if (addressFilter == null) {
            addressFilter = new ArrayList<FilterType>();
        }
        return this.addressFilter;
    }

    /**
     * Gets the value of the telephoneNumberFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneNumberFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneNumberFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     */
    public List<FilterType> getTelephoneNumberFilter() {
        if (telephoneNumberFilter == null) {
            telephoneNumberFilter = new ArrayList<FilterType>();
        }
        return this.telephoneNumberFilter;
    }

    /**
     * Gets the value of the emailAddressFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddressFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddressFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     */
    public List<FilterType> getEmailAddressFilter() {
        if (emailAddressFilter == null) {
            emailAddressFilter = new ArrayList<FilterType>();
        }
        return this.emailAddressFilter;
    }

    /**
     * Gets the value of the parentQuery property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationQueryType }
     *     
     */
    public OrganizationQueryType getParentQuery() {
        return parentQuery;
    }

    /**
     * Sets the value of the parentQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationQueryType }
     *     
     */
    public void setParentQuery(OrganizationQueryType value) {
        this.parentQuery = value;
    }

    /**
     * Gets the value of the childOrganizationQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childOrganizationQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildOrganizationQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationQueryType }
     * 
     * 
     */
    public List<OrganizationQueryType> getChildOrganizationQuery() {
        if (childOrganizationQuery == null) {
            childOrganizationQuery = new ArrayList<OrganizationQueryType>();
        }
        return this.childOrganizationQuery;
    }

    /**
     * Gets the value of the primaryContactQuery property.
     * 
     * @return
     *     possible object is
     *     {@link PersonQueryType }
     *     
     */
    public PersonQueryType getPrimaryContactQuery() {
        return primaryContactQuery;
    }

    /**
     * Sets the value of the primaryContactQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonQueryType }
     *     
     */
    public void setPrimaryContactQuery(PersonQueryType value) {
        this.primaryContactQuery = value;
    }

}
