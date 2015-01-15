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
 * <p>Java class for POQM_MT000001UV.Component2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POQM_MT000001UV.Component2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;choice>
 *           &lt;element name="section" type="{urn:hl7-org:v3}POQM_MT000001UV.Section"/>
 *           &lt;element name="measureDescriptionSection" type="{urn:hl7-org:v3}POQM_MT000001UV.MeasureDescriptionSection"/>
 *           &lt;element name="dataCriteriaSection" type="{urn:hl7-org:v3}POQM_MT000001UV.DataCriteriaSection"/>
 *           &lt;element name="populationCriteriaSection" type="{urn:hl7-org:v3}POQM_MT000001UV.Section"/>
 *           &lt;element name="measureObservationSection" type="{urn:hl7-org:v3}POQM_MT000001UV.Section"/>
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
@XmlType(name = "POQM_MT000001UV.Component2", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "section",
    "measureDescriptionSection",
    "dataCriteriaSection",
    "populationCriteriaSection",
    "measureObservationSection"
})
public class POQMMT000001UVComponent2 {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected POQMMT000001UVSection section;
    protected POQMMT000001UVMeasureDescriptionSection measureDescriptionSection;
    protected POQMMT000001UVDataCriteriaSection dataCriteriaSection;
    protected POQMMT000001UVSection populationCriteriaSection;
    protected POQMMT000001UVSection measureObservationSection;
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
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000001UVSection }
     *     
     */
    public POQMMT000001UVSection getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000001UVSection }
     *     
     */
    public void setSection(POQMMT000001UVSection value) {
        this.section = value;
    }

    /**
     * Gets the value of the measureDescriptionSection property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000001UVMeasureDescriptionSection }
     *     
     */
    public POQMMT000001UVMeasureDescriptionSection getMeasureDescriptionSection() {
        return measureDescriptionSection;
    }

    /**
     * Sets the value of the measureDescriptionSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000001UVMeasureDescriptionSection }
     *     
     */
    public void setMeasureDescriptionSection(POQMMT000001UVMeasureDescriptionSection value) {
        this.measureDescriptionSection = value;
    }

    /**
     * Gets the value of the dataCriteriaSection property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000001UVDataCriteriaSection }
     *     
     */
    public POQMMT000001UVDataCriteriaSection getDataCriteriaSection() {
        return dataCriteriaSection;
    }

    /**
     * Sets the value of the dataCriteriaSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000001UVDataCriteriaSection }
     *     
     */
    public void setDataCriteriaSection(POQMMT000001UVDataCriteriaSection value) {
        this.dataCriteriaSection = value;
    }

    /**
     * Gets the value of the populationCriteriaSection property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000001UVSection }
     *     
     */
    public POQMMT000001UVSection getPopulationCriteriaSection() {
        return populationCriteriaSection;
    }

    /**
     * Sets the value of the populationCriteriaSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000001UVSection }
     *     
     */
    public void setPopulationCriteriaSection(POQMMT000001UVSection value) {
        this.populationCriteriaSection = value;
    }

    /**
     * Gets the value of the measureObservationSection property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000001UVSection }
     *     
     */
    public POQMMT000001UVSection getMeasureObservationSection() {
        return measureObservationSection;
    }

    /**
     * Sets the value of the measureObservationSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000001UVSection }
     *     
     */
    public void setMeasureObservationSection(POQMMT000001UVSection value) {
        this.measureObservationSection = value;
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
