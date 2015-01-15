//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 01:40:43 PM EST 
//


package edu.phema.jaxb.uvqm.hl7v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PPD_PQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PPD_PQ">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}PQ">
 *       &lt;sequence>
 *         &lt;element name="standardDeviation" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="distributionType" type="{urn:hl7-org:v3}ProbabilityDistributionType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PPD_PQ", propOrder = {
    "standardDeviation"
})
public class PPDPQ
    extends PQ
{

    protected PQ standardDeviation;
    @XmlAttribute
    protected ProbabilityDistributionType distributionType;

    /**
     * Gets the value of the standardDeviation property.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getStandardDeviation() {
        return standardDeviation;
    }

    /**
     * Sets the value of the standardDeviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setStandardDeviation(PQ value) {
        this.standardDeviation = value;
    }

    /**
     * Gets the value of the distributionType property.
     * 
     * @return
     *     possible object is
     *     {@link ProbabilityDistributionType }
     *     
     */
    public ProbabilityDistributionType getDistributionType() {
        return distributionType;
    }

    /**
     * Sets the value of the distributionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbabilityDistributionType }
     *     
     */
    public void setDistributionType(ProbabilityDistributionType value) {
        this.distributionType = value;
    }

}
