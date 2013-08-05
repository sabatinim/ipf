//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.05.19 at 10:15:07 AM CEST 
//


package org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs21.query;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}IntClause"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}FloatClause"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}DateTimeClause"/>
 *       &lt;/choice>
 *       &lt;attribute name="logicalPredicate" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="LE"/>
 *             &lt;enumeration value="LT"/>
 *             &lt;enumeration value="GE"/>
 *             &lt;enumeration value="GT"/>
 *             &lt;enumeration value="EQ"/>
 *             &lt;enumeration value="NE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "intClause",
    "floatClause",
    "dateTimeClause"
})
@XmlRootElement(name = "RationalClause")
public class RationalClause {

    @XmlElement(name = "IntClause")
    protected BigInteger intClause;
    @XmlElement(name = "FloatClause")
    protected Float floatClause;
    @XmlElement(name = "DateTimeClause")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeClause;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String logicalPredicate;

    /**
     * Gets the value of the intClause property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntClause() {
        return intClause;
    }

    /**
     * Sets the value of the intClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntClause(BigInteger value) {
        this.intClause = value;
    }

    /**
     * Gets the value of the floatClause property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFloatClause() {
        return floatClause;
    }

    /**
     * Sets the value of the floatClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFloatClause(Float value) {
        this.floatClause = value;
    }

    /**
     * Gets the value of the dateTimeClause property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeClause() {
        return dateTimeClause;
    }

    /**
     * Sets the value of the dateTimeClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeClause(XMLGregorianCalendar value) {
        this.dateTimeClause = value;
    }

    /**
     * Gets the value of the logicalPredicate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalPredicate() {
        return logicalPredicate;
    }

    /**
     * Sets the value of the logicalPredicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalPredicate(String value) {
        this.logicalPredicate = value;
    }

}
