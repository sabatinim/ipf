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

import org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs21.rim.RegistryObjectListType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}FilterQueryResult"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}SQLQueryResult"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "filterQueryResult",
    "sqlQueryResult"
})
@XmlRootElement(name = "AdhocQueryResponse")
public class AdhocQueryResponse {

    @XmlElement(name = "FilterQueryResult")
    protected FilterQueryResult filterQueryResult;
    @XmlElement(name = "SQLQueryResult")
    protected RegistryObjectListType sqlQueryResult;

    /**
     * Gets the value of the filterQueryResult property.
     * 
     * @return
     *     possible object is
     *     {@link FilterQueryResult }
     *     
     */
    public FilterQueryResult getFilterQueryResult() {
        return filterQueryResult;
    }

    /**
     * Sets the value of the filterQueryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterQueryResult }
     *     
     */
    public void setFilterQueryResult(FilterQueryResult value) {
        this.filterQueryResult = value;
    }

    /**
     * Gets the value of the sqlQueryResult property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectListType }
     *     
     */
    public RegistryObjectListType getSQLQueryResult() {
        return sqlQueryResult;
    }

    /**
     * Sets the value of the sqlQueryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectListType }
     *     
     */
    public void setSQLQueryResult(RegistryObjectListType value) {
        this.sqlQueryResult = value;
    }

}
