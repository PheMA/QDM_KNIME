//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 01:40:43 PM EST 
//


package edu.phema.jaxb.uvqm.hl7v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for EntityStatusNullified.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityStatusNullified">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="nullified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum EntityStatusNullified {

    @XmlEnumValue("nullified")
    NULLIFIED("nullified");
    private final String value;

    EntityStatusNullified(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityStatusNullified fromValue(String v) {
        for (EntityStatusNullified c: EntityStatusNullified.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
