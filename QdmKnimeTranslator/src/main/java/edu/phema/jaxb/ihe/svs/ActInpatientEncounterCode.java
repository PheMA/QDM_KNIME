//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.15 at 03:09:44 PM CST 
//


package edu.phema.jaxb.ihe.svs;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for ActInpatientEncounterCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInpatientEncounterCode">
 *   &lt;restriction base="{urn:ihe:iti:svs:2008}cs">
 *     &lt;enumeration value="IMP"/>
 *     &lt;enumeration value="ACUTE"/>
 *     &lt;enumeration value="NONAC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ActInpatientEncounterCode {

    IMP,
    ACUTE,
    NONAC;

    public String value() {
        return name();
    }

    public static ActInpatientEncounterCode fromValue(String v) {
        return valueOf(v);
    }

}
