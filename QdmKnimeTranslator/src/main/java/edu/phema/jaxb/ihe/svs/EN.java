//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.15 at 03:09:44 PM CST 
//


package edu.phema.jaxb.ihe.svs;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A name for a person, organization, place or thing. A
 *             sequence of name parts, such as given name or family
 *             name, prefix, suffix, etc. Examples for entity name
 *             values are "Jim Bob Walton, Jr.", "Health Level Seven,
 *             Inc.", "Lake Tahoe", etc. An entity name may be as simple
 *             as a character string or may consist of several entity name
 *             parts, such as, "Jim", "Bob", "Walton", and "Jr.", "Health
 *             Level Seven" and "Inc.", "Lake" and "Tahoe".
 *          
 * 
 * <p>Java class for EN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EN">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ihe:iti:svs:2008}ANY">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="delimiter" type="{urn:ihe:iti:svs:2008}en.delimiter"/>
 *           &lt;element name="family" type="{urn:ihe:iti:svs:2008}en.family"/>
 *           &lt;element name="given" type="{urn:ihe:iti:svs:2008}en.given"/>
 *           &lt;element name="prefix" type="{urn:ihe:iti:svs:2008}en.prefix"/>
 *           &lt;element name="suffix" type="{urn:ihe:iti:svs:2008}en.suffix"/>
 *         &lt;/choice>
 *         &lt;element name="validTime" type="{urn:ihe:iti:svs:2008}IVL_TS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="use" type="{urn:ihe:iti:svs:2008}set_EntityNameUse" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EN", propOrder = {
    "content"
})
public class EN {

    @XmlElementRefs({
        @XmlElementRef(name = "validTime", namespace = "urn:ihe:iti:svs:2008", type = JAXBElement.class),
        @XmlElementRef(name = "family", namespace = "urn:ihe:iti:svs:2008", type = JAXBElement.class),
        @XmlElementRef(name = "delimiter", namespace = "urn:ihe:iti:svs:2008", type = JAXBElement.class),
        @XmlElementRef(name = "suffix", namespace = "urn:ihe:iti:svs:2008", type = JAXBElement.class),
        @XmlElementRef(name = "given", namespace = "urn:ihe:iti:svs:2008", type = JAXBElement.class),
        @XmlElementRef(name = "prefix", namespace = "urn:ihe:iti:svs:2008", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute
    protected List<String> use;

    /**
     * 
     *             A name for a person, organization, place or thing. A
     *             sequence of name parts, such as given name or family
     *             name, prefix, suffix, etc. Examples for entity name
     *             values are "Jim Bob Walton, Jr.", "Health Level Seven,
     *             Inc.", "Lake Tahoe", etc. An entity name may be as simple
     *             as a character string or may consist of several entity name
     *             parts, such as, "Jim", "Bob", "Walton", and "Jr.", "Health
     *             Level Seven" and "Inc.", "Lake" and "Tahoe".
     *          Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link IVLTS }{@code >}
     * {@link JAXBElement }{@code <}{@link EnFamily }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link EnDelimiter }{@code >}
     * {@link JAXBElement }{@code <}{@link EnSuffix }{@code >}
     * {@link JAXBElement }{@code <}{@link EnGiven }{@code >}
     * {@link JAXBElement }{@code <}{@link EnPrefix }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the use property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the use property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUse() {
        if (use == null) {
            use = new ArrayList<String>();
        }
        return this.use;
    }

}
