//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 03:59:37 PM EST 
//


package edu.phema.jaxb.queryHealth.hqmf;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for ParticipationInformationGenerator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationInformationGenerator">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AUT"/>
 *     &lt;enumeration value="INF"/>
 *     &lt;enumeration value="TRANS"/>
 *     &lt;enumeration value="ENT"/>
 *     &lt;enumeration value="WIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ParticipationInformationGenerator {

    AUT,
    INF,
    TRANS,
    ENT,
    WIT;

    public String value() {
        return name();
    }

    public static ParticipationInformationGenerator fromValue(String v) {
        return valueOf(v);
    }

}
