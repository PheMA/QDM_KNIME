//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 03:59:37 PM EST 
//


package edu.phema.jaxb.queryHealth.hqmf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POQM_MT000001UV.Component4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POQM_MT000001UV.Component4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;choice>
 *           &lt;element name="allTrue" type="{urn:hl7-org:v3}POQM_MT000002UV.AllTrue"/>
 *           &lt;element name="allFalse" type="{urn:hl7-org:v3}POQM_MT000002UV.AllFalse"/>
 *           &lt;element name="atLeastOneTrue" type="{urn:hl7-org:v3}POQM_MT000002UV.AtLeastOneTrue"/>
 *           &lt;element name="atLeastOneFalse" type="{urn:hl7-org:v3}POQM_MT000002UV.AtLeastOneFalse"/>
 *           &lt;element name="onlyOneTrue" type="{urn:hl7-org:v3}POQM_MT000002UV.OnlyOneTrue"/>
 *           &lt;element name="onlyOneFalse" type="{urn:hl7-org:v3}POQM_MT000002UV.OnlyOneFalse"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="contextConductionInd" type="{urn:hl7-org:v3}bl" fixed="true" />
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="typeCode" type="{urn:hl7-org:v3}ActRelationshipHasComponent" fixed="COMP" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POQM_MT000001UV.Component4", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "allTrue",
    "allFalse",
    "atLeastOneTrue",
    "atLeastOneFalse",
    "onlyOneTrue",
    "onlyOneFalse"
})
public class POQMMT000001UVComponent4 {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected POQMMT000002UVAllTrue allTrue;
    protected POQMMT000002UVAllFalse allFalse;
    protected POQMMT000002UVAtLeastOneTrue atLeastOneTrue;
    protected POQMMT000002UVAtLeastOneFalse atLeastOneFalse;
    protected POQMMT000002UVOnlyOneTrue onlyOneTrue;
    protected POQMMT000002UVOnlyOneFalse onlyOneFalse;
    @XmlAttribute
    protected Boolean contextConductionInd;
    @XmlAttribute
    protected NullFlavor nullFlavor;
    @XmlAttribute
    protected ActRelationshipHasComponent typeCode;

    /**
     * Gets the value of the realmCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realmCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealmCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CS }
     * 
     * 
     */
    public List<CS> getRealmCode() {
        if (realmCode == null) {
            realmCode = new ArrayList<CS>();
        }
        return this.realmCode;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setTypeId(II value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<II>();
        }
        return this.templateId;
    }

    /**
     * Gets the value of the allTrue property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVAllTrue }
     *     
     */
    public POQMMT000002UVAllTrue getAllTrue() {
        return allTrue;
    }

    /**
     * Sets the value of the allTrue property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVAllTrue }
     *     
     */
    public void setAllTrue(POQMMT000002UVAllTrue value) {
        this.allTrue = value;
    }

    /**
     * Gets the value of the allFalse property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVAllFalse }
     *     
     */
    public POQMMT000002UVAllFalse getAllFalse() {
        return allFalse;
    }

    /**
     * Sets the value of the allFalse property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVAllFalse }
     *     
     */
    public void setAllFalse(POQMMT000002UVAllFalse value) {
        this.allFalse = value;
    }

    /**
     * Gets the value of the atLeastOneTrue property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVAtLeastOneTrue }
     *     
     */
    public POQMMT000002UVAtLeastOneTrue getAtLeastOneTrue() {
        return atLeastOneTrue;
    }

    /**
     * Sets the value of the atLeastOneTrue property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVAtLeastOneTrue }
     *     
     */
    public void setAtLeastOneTrue(POQMMT000002UVAtLeastOneTrue value) {
        this.atLeastOneTrue = value;
    }

    /**
     * Gets the value of the atLeastOneFalse property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVAtLeastOneFalse }
     *     
     */
    public POQMMT000002UVAtLeastOneFalse getAtLeastOneFalse() {
        return atLeastOneFalse;
    }

    /**
     * Sets the value of the atLeastOneFalse property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVAtLeastOneFalse }
     *     
     */
    public void setAtLeastOneFalse(POQMMT000002UVAtLeastOneFalse value) {
        this.atLeastOneFalse = value;
    }

    /**
     * Gets the value of the onlyOneTrue property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVOnlyOneTrue }
     *     
     */
    public POQMMT000002UVOnlyOneTrue getOnlyOneTrue() {
        return onlyOneTrue;
    }

    /**
     * Sets the value of the onlyOneTrue property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVOnlyOneTrue }
     *     
     */
    public void setOnlyOneTrue(POQMMT000002UVOnlyOneTrue value) {
        this.onlyOneTrue = value;
    }

    /**
     * Gets the value of the onlyOneFalse property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVOnlyOneFalse }
     *     
     */
    public POQMMT000002UVOnlyOneFalse getOnlyOneFalse() {
        return onlyOneFalse;
    }

    /**
     * Sets the value of the onlyOneFalse property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVOnlyOneFalse }
     *     
     */
    public void setOnlyOneFalse(POQMMT000002UVOnlyOneFalse value) {
        this.onlyOneFalse = value;
    }

    /**
     * Gets the value of the contextConductionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContextConductionInd() {
        if (contextConductionInd == null) {
            return true;
        } else {
            return contextConductionInd;
        }
    }

    /**
     * Sets the value of the contextConductionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContextConductionInd(Boolean value) {
        this.contextConductionInd = value;
    }

    /**
     * Gets the value of the nullFlavor property.
     * 
     * @return
     *     possible object is
     *     {@link NullFlavor }
     *     
     */
    public NullFlavor getNullFlavor() {
        return nullFlavor;
    }

    /**
     * Sets the value of the nullFlavor property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullFlavor }
     *     
     */
    public void setNullFlavor(NullFlavor value) {
        this.nullFlavor = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActRelationshipHasComponent }
     *     
     */
    public ActRelationshipHasComponent getTypeCode() {
        if (typeCode == null) {
            return ActRelationshipHasComponent.COMP;
        } else {
            return typeCode;
        }
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActRelationshipHasComponent }
     *     
     */
    public void setTypeCode(ActRelationshipHasComponent value) {
        this.typeCode = value;
    }

}
