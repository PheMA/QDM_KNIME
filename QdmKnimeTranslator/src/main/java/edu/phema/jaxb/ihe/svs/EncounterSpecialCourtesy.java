//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.15 at 03:09:44 PM CST 
//


package edu.phema.jaxb.ihe.svs;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for EncounterSpecialCourtesy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EncounterSpecialCourtesy">
 *   &lt;restriction base="{urn:ihe:iti:svs:2008}cs">
 *     &lt;enumeration value="EXT"/>
 *     &lt;enumeration value="NRM"/>
 *     &lt;enumeration value="PRF"/>
 *     &lt;enumeration value="STF"/>
 *     &lt;enumeration value="VIP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum EncounterSpecialCourtesy {

    EXT,
    NRM,
    PRF,
    STF,
    VIP;

    public String value() {
        return name();
    }

    public static EncounterSpecialCourtesy fromValue(String v) {
        return valueOf(v);
    }

}
