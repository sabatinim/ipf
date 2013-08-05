//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.05.19 at 10:15:07 AM CEST 
//


package org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs21.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}ResponseOption"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}FilterQuery"/>
 *           &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}SQLQuery"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "responseOption",
    "filterQuery",
    "sqlQuery"
})
@XmlRootElement(name = "AdhocQueryRequest")
public class AdhocQueryRequest {

    @XmlElement(name = "ResponseOption", required = true)
    protected ResponseOptionType responseOption;
    @XmlElement(name = "FilterQuery")
    protected FilterQuery filterQuery;
    @XmlElement(name = "SQLQuery")
    protected String sqlQuery;

    /**
     * Gets the value of the responseOption property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseOptionType }
     *     
     */
    public ResponseOptionType getResponseOption() {
        return responseOption;
    }

    /**
     * Sets the value of the responseOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseOptionType }
     *     
     */
    public void setResponseOption(ResponseOptionType value) {
        this.responseOption = value;
    }

    /**
     * Gets the value of the filterQuery property.
     * 
     * @return
     *     possible object is
     *     {@link FilterQuery }
     *     
     */
    public FilterQuery getFilterQuery() {
        return filterQuery;
    }

    /**
     * Sets the value of the filterQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterQuery }
     *     
     */
    public void setFilterQuery(FilterQuery value) {
        this.filterQuery = value;
    }

    /**
     * Gets the value of the sqlQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSQLQuery() {
        return sqlQuery;
    }

    /**
     * Sets the value of the sqlQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSQLQuery(String value) {
        this.sqlQuery = value;
    }

}
