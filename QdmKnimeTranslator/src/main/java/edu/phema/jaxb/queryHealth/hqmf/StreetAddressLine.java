//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 03:59:37 PM EST 
//


package edu.phema.jaxb.queryHealth.hqmf;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for StreetAddressLine.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StreetAddressLine">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SAL"/>
 *     &lt;enumeration value="BNR"/>
 *     &lt;enumeration value="BNN"/>
 *     &lt;enumeration value="BNS"/>
 *     &lt;enumeration value="DIR"/>
 *     &lt;enumeration value="STR"/>
 *     &lt;enumeration value="STB"/>
 *     &lt;enumeration value="STTYP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum StreetAddressLine {

    SAL,
    BNR,
    BNN,
    BNS,
    DIR,
    STR,
    STB,
    STTYP;

    public String value() {
        return name();
    }

    public static StreetAddressLine fromValue(String v) {
        return valueOf(v);
    }

}
