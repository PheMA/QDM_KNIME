//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 01:40:43 PM EST 
//


package edu.phema.jaxb.uvqm.hl7v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POQM_MT000002UV.PatientParticipant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POQM_MT000002UV.PatientParticipant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="name" type="{urn:hl7-org:v3}EN" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="addr" type="{urn:hl7-org:v3}AD" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="telecom" type="{urn:hl7-org:v3}TEL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/>
 *         &lt;element name="certificateText" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;element name="confidentialityCode" type="{urn:hl7-org:v3}CE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quantity" type="{urn:hl7-org:v3}RTO_PQ_PQ" minOccurs="0"/>
 *         &lt;element name="positionNumber" type="{urn:hl7-org:v3}INT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="veryImportantPersonCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="patientContainer" type="{urn:hl7-org:v3}POQM_MT000002UV.Container" minOccurs="0"/>
 *           &lt;element name="patientManufacturedMaterial" type="{urn:hl7-org:v3}POQM_MT000002UV.ManufacturedMaterial" minOccurs="0"/>
 *           &lt;element name="patientDevice" type="{urn:hl7-org:v3}POQM_MT000002UV.Device" minOccurs="0"/>
 *           &lt;element name="patientPerson" type="{urn:hl7-org:v3}POQM_MT000002UV.Person" minOccurs="0"/>
 *           &lt;element name="patientNonPersonLivingSubject" type="{urn:hl7-org:v3}POQM_MT000002UV.NonPersonLivingSubject" minOccurs="0"/>
 *           &lt;element name="patientEntity" type="{urn:hl7-org:v3}POQM_MT000002UV.Entity" minOccurs="0"/>
 *           &lt;element name="patientMaterial" type="{urn:hl7-org:v3}POQM_MT000002UV.Material" minOccurs="0"/>
 *           &lt;element name="patientOrganization" type="{urn:hl7-org:v3}POQM_MT000002UV.Organization" minOccurs="0"/>
 *           &lt;element name="patientPlace" type="{urn:hl7-org:v3}POQM_MT000002UV.Place" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="providerContainer" type="{urn:hl7-org:v3}POQM_MT000002UV.Container" minOccurs="0"/>
 *           &lt;element name="providerManufacturedMaterial" type="{urn:hl7-org:v3}POQM_MT000002UV.ManufacturedMaterial" minOccurs="0"/>
 *           &lt;element name="providerDevice" type="{urn:hl7-org:v3}POQM_MT000002UV.Device" minOccurs="0"/>
 *           &lt;element name="providerPerson" type="{urn:hl7-org:v3}POQM_MT000002UV.Person" minOccurs="0"/>
 *           &lt;element name="providerNonPersonLivingSubject" type="{urn:hl7-org:v3}POQM_MT000002UV.NonPersonLivingSubject" minOccurs="0"/>
 *           &lt;element name="providerEntity" type="{urn:hl7-org:v3}POQM_MT000002UV.Entity" minOccurs="0"/>
 *           &lt;element name="providerMaterial" type="{urn:hl7-org:v3}POQM_MT000002UV.Material" minOccurs="0"/>
 *           &lt;element name="providerOrganization" type="{urn:hl7-org:v3}POQM_MT000002UV.Organization" minOccurs="0"/>
 *           &lt;element name="providerPlace" type="{urn:hl7-org:v3}POQM_MT000002UV.Place" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="sourceOf" type="{urn:hl7-org:v3}POQM_MT000002UV.SourceOf3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="targetOf" type="{urn:hl7-org:v3}POQM_MT000002UV.SourceOf4" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClass" />
 *       &lt;attribute name="negationInd" type="{urn:hl7-org:v3}bl" />
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POQM_MT000002UV.PatientParticipant", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "name",
    "addr",
    "telecom",
    "statusCode",
    "effectiveTime",
    "certificateText",
    "confidentialityCode",
    "quantity",
    "positionNumber",
    "veryImportantPersonCode",
    "patientContainer",
    "patientManufacturedMaterial",
    "patientDevice",
    "patientPerson",
    "patientNonPersonLivingSubject",
    "patientEntity",
    "patientMaterial",
    "patientOrganization",
    "patientPlace",
    "providerContainer",
    "providerManufacturedMaterial",
    "providerDevice",
    "providerPerson",
    "providerNonPersonLivingSubject",
    "providerEntity",
    "providerMaterial",
    "providerOrganization",
    "providerPlace",
    "sourceOf",
    "targetOf"
})
public class POQMMT000002UVPatientParticipant {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected List<II> id;
    protected CE code;
    protected List<EN> name;
    protected List<AD> addr;
    protected List<TEL> telecom;
    protected CS statusCode;
    protected IVLTS effectiveTime;
    protected ED certificateText;
    protected List<CE> confidentialityCode;
    protected RTOPQPQ quantity;
    protected List<INT> positionNumber;
    protected CE veryImportantPersonCode;
    protected POQMMT000002UVContainer patientContainer;
    protected POQMMT000002UVManufacturedMaterial patientManufacturedMaterial;
    protected POQMMT000002UVDevice patientDevice;
    protected POQMMT000002UVPerson patientPerson;
    protected POQMMT000002UVNonPersonLivingSubject patientNonPersonLivingSubject;
    protected POQMMT000002UVEntity patientEntity;
    protected POQMMT000002UVMaterial patientMaterial;
    protected POQMMT000002UVOrganization patientOrganization;
    protected POQMMT000002UVPlace patientPlace;
    protected POQMMT000002UVContainer providerContainer;
    protected POQMMT000002UVManufacturedMaterial providerManufacturedMaterial;
    protected POQMMT000002UVDevice providerDevice;
    protected POQMMT000002UVPerson providerPerson;
    protected POQMMT000002UVNonPersonLivingSubject providerNonPersonLivingSubject;
    protected POQMMT000002UVEntity providerEntity;
    protected POQMMT000002UVMaterial providerMaterial;
    protected POQMMT000002UVOrganization providerOrganization;
    protected POQMMT000002UVPlace providerPlace;
    protected List<POQMMT000002UVSourceOf3> sourceOf;
    protected List<POQMMT000002UVSourceOf4> targetOf;
    @XmlAttribute(required = true)
    protected RoleClass classCode;
    @XmlAttribute
    protected Boolean negationInd;
    @XmlAttribute
    protected NullFlavor nullFlavor;

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
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getId() {
        if (id == null) {
            id = new ArrayList<II>();
        }
        return this.id;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setCode(CE value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EN }
     * 
     * 
     */
    public List<EN> getName() {
        if (name == null) {
            name = new ArrayList<EN>();
        }
        return this.name;
    }

    /**
     * Gets the value of the addr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AD }
     * 
     * 
     */
    public List<AD> getAddr() {
        if (addr == null) {
            addr = new ArrayList<AD>();
        }
        return this.addr;
    }

    /**
     * Gets the value of the telecom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TEL }
     * 
     * 
     */
    public List<TEL> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<TEL>();
        }
        return this.telecom;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setStatusCode(CS value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the effectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setEffectiveTime(IVLTS value) {
        this.effectiveTime = value;
    }

    /**
     * Gets the value of the certificateText property.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getCertificateText() {
        return certificateText;
    }

    /**
     * Sets the value of the certificateText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setCertificateText(ED value) {
        this.certificateText = value;
    }

    /**
     * Gets the value of the confidentialityCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confidentialityCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfidentialityCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CE }
     * 
     * 
     */
    public List<CE> getConfidentialityCode() {
        if (confidentialityCode == null) {
            confidentialityCode = new ArrayList<CE>();
        }
        return this.confidentialityCode;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link RTOPQPQ }
     *     
     */
    public RTOPQPQ getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTOPQPQ }
     *     
     */
    public void setQuantity(RTOPQPQ value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the positionNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INT }
     * 
     * 
     */
    public List<INT> getPositionNumber() {
        if (positionNumber == null) {
            positionNumber = new ArrayList<INT>();
        }
        return this.positionNumber;
    }

    /**
     * Gets the value of the veryImportantPersonCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getVeryImportantPersonCode() {
        return veryImportantPersonCode;
    }

    /**
     * Sets the value of the veryImportantPersonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setVeryImportantPersonCode(CE value) {
        this.veryImportantPersonCode = value;
    }

    /**
     * Gets the value of the patientContainer property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVContainer }
     *     
     */
    public POQMMT000002UVContainer getPatientContainer() {
        return patientContainer;
    }

    /**
     * Sets the value of the patientContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVContainer }
     *     
     */
    public void setPatientContainer(POQMMT000002UVContainer value) {
        this.patientContainer = value;
    }

    /**
     * Gets the value of the patientManufacturedMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVManufacturedMaterial }
     *     
     */
    public POQMMT000002UVManufacturedMaterial getPatientManufacturedMaterial() {
        return patientManufacturedMaterial;
    }

    /**
     * Sets the value of the patientManufacturedMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVManufacturedMaterial }
     *     
     */
    public void setPatientManufacturedMaterial(POQMMT000002UVManufacturedMaterial value) {
        this.patientManufacturedMaterial = value;
    }

    /**
     * Gets the value of the patientDevice property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVDevice }
     *     
     */
    public POQMMT000002UVDevice getPatientDevice() {
        return patientDevice;
    }

    /**
     * Sets the value of the patientDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVDevice }
     *     
     */
    public void setPatientDevice(POQMMT000002UVDevice value) {
        this.patientDevice = value;
    }

    /**
     * Gets the value of the patientPerson property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVPerson }
     *     
     */
    public POQMMT000002UVPerson getPatientPerson() {
        return patientPerson;
    }

    /**
     * Sets the value of the patientPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVPerson }
     *     
     */
    public void setPatientPerson(POQMMT000002UVPerson value) {
        this.patientPerson = value;
    }

    /**
     * Gets the value of the patientNonPersonLivingSubject property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVNonPersonLivingSubject }
     *     
     */
    public POQMMT000002UVNonPersonLivingSubject getPatientNonPersonLivingSubject() {
        return patientNonPersonLivingSubject;
    }

    /**
     * Sets the value of the patientNonPersonLivingSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVNonPersonLivingSubject }
     *     
     */
    public void setPatientNonPersonLivingSubject(POQMMT000002UVNonPersonLivingSubject value) {
        this.patientNonPersonLivingSubject = value;
    }

    /**
     * Gets the value of the patientEntity property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVEntity }
     *     
     */
    public POQMMT000002UVEntity getPatientEntity() {
        return patientEntity;
    }

    /**
     * Sets the value of the patientEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVEntity }
     *     
     */
    public void setPatientEntity(POQMMT000002UVEntity value) {
        this.patientEntity = value;
    }

    /**
     * Gets the value of the patientMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVMaterial }
     *     
     */
    public POQMMT000002UVMaterial getPatientMaterial() {
        return patientMaterial;
    }

    /**
     * Sets the value of the patientMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVMaterial }
     *     
     */
    public void setPatientMaterial(POQMMT000002UVMaterial value) {
        this.patientMaterial = value;
    }

    /**
     * Gets the value of the patientOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVOrganization }
     *     
     */
    public POQMMT000002UVOrganization getPatientOrganization() {
        return patientOrganization;
    }

    /**
     * Sets the value of the patientOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVOrganization }
     *     
     */
    public void setPatientOrganization(POQMMT000002UVOrganization value) {
        this.patientOrganization = value;
    }

    /**
     * Gets the value of the patientPlace property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVPlace }
     *     
     */
    public POQMMT000002UVPlace getPatientPlace() {
        return patientPlace;
    }

    /**
     * Sets the value of the patientPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVPlace }
     *     
     */
    public void setPatientPlace(POQMMT000002UVPlace value) {
        this.patientPlace = value;
    }

    /**
     * Gets the value of the providerContainer property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVContainer }
     *     
     */
    public POQMMT000002UVContainer getProviderContainer() {
        return providerContainer;
    }

    /**
     * Sets the value of the providerContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVContainer }
     *     
     */
    public void setProviderContainer(POQMMT000002UVContainer value) {
        this.providerContainer = value;
    }

    /**
     * Gets the value of the providerManufacturedMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVManufacturedMaterial }
     *     
     */
    public POQMMT000002UVManufacturedMaterial getProviderManufacturedMaterial() {
        return providerManufacturedMaterial;
    }

    /**
     * Sets the value of the providerManufacturedMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVManufacturedMaterial }
     *     
     */
    public void setProviderManufacturedMaterial(POQMMT000002UVManufacturedMaterial value) {
        this.providerManufacturedMaterial = value;
    }

    /**
     * Gets the value of the providerDevice property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVDevice }
     *     
     */
    public POQMMT000002UVDevice getProviderDevice() {
        return providerDevice;
    }

    /**
     * Sets the value of the providerDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVDevice }
     *     
     */
    public void setProviderDevice(POQMMT000002UVDevice value) {
        this.providerDevice = value;
    }

    /**
     * Gets the value of the providerPerson property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVPerson }
     *     
     */
    public POQMMT000002UVPerson getProviderPerson() {
        return providerPerson;
    }

    /**
     * Sets the value of the providerPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVPerson }
     *     
     */
    public void setProviderPerson(POQMMT000002UVPerson value) {
        this.providerPerson = value;
    }

    /**
     * Gets the value of the providerNonPersonLivingSubject property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVNonPersonLivingSubject }
     *     
     */
    public POQMMT000002UVNonPersonLivingSubject getProviderNonPersonLivingSubject() {
        return providerNonPersonLivingSubject;
    }

    /**
     * Sets the value of the providerNonPersonLivingSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVNonPersonLivingSubject }
     *     
     */
    public void setProviderNonPersonLivingSubject(POQMMT000002UVNonPersonLivingSubject value) {
        this.providerNonPersonLivingSubject = value;
    }

    /**
     * Gets the value of the providerEntity property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVEntity }
     *     
     */
    public POQMMT000002UVEntity getProviderEntity() {
        return providerEntity;
    }

    /**
     * Sets the value of the providerEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVEntity }
     *     
     */
    public void setProviderEntity(POQMMT000002UVEntity value) {
        this.providerEntity = value;
    }

    /**
     * Gets the value of the providerMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVMaterial }
     *     
     */
    public POQMMT000002UVMaterial getProviderMaterial() {
        return providerMaterial;
    }

    /**
     * Sets the value of the providerMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVMaterial }
     *     
     */
    public void setProviderMaterial(POQMMT000002UVMaterial value) {
        this.providerMaterial = value;
    }

    /**
     * Gets the value of the providerOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVOrganization }
     *     
     */
    public POQMMT000002UVOrganization getProviderOrganization() {
        return providerOrganization;
    }

    /**
     * Sets the value of the providerOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVOrganization }
     *     
     */
    public void setProviderOrganization(POQMMT000002UVOrganization value) {
        this.providerOrganization = value;
    }

    /**
     * Gets the value of the providerPlace property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVPlace }
     *     
     */
    public POQMMT000002UVPlace getProviderPlace() {
        return providerPlace;
    }

    /**
     * Sets the value of the providerPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVPlace }
     *     
     */
    public void setProviderPlace(POQMMT000002UVPlace value) {
        this.providerPlace = value;
    }

    /**
     * Gets the value of the sourceOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POQMMT000002UVSourceOf3 }
     * 
     * 
     */
    public List<POQMMT000002UVSourceOf3> getSourceOf() {
        if (sourceOf == null) {
            sourceOf = new ArrayList<POQMMT000002UVSourceOf3>();
        }
        return this.sourceOf;
    }

    /**
     * Gets the value of the targetOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POQMMT000002UVSourceOf4 }
     * 
     * 
     */
    public List<POQMMT000002UVSourceOf4> getTargetOf() {
        if (targetOf == null) {
            targetOf = new ArrayList<POQMMT000002UVSourceOf4>();
        }
        return this.targetOf;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link RoleClass }
     *     
     */
    public RoleClass getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClass }
     *     
     */
    public void setClassCode(RoleClass value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the negationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegationInd() {
        return negationInd;
    }

    /**
     * Sets the value of the negationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegationInd(Boolean value) {
        this.negationInd = value;
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

}
