//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.15 at 03:09:44 PM CST 
//


package edu.phema.jaxb.ihe.svs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for UnorderedListStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnorderedListStyle">
 *   &lt;restriction base="{urn:ihe:iti:svs:2008}cs">
 *     &lt;enumeration value="Circle"/>
 *     &lt;enumeration value="Disc"/>
 *     &lt;enumeration value="Square"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum UnorderedListStyle {

    @XmlEnumValue("Circle")
    CIRCLE("Circle"),
    @XmlEnumValue("Disc")
    DISC("Disc"),
    @XmlEnumValue("Square")
    SQUARE("Square");
    private final String value;

    UnorderedListStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnorderedListStyle fromValue(String v) {
        for (UnorderedListStyle c: UnorderedListStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
