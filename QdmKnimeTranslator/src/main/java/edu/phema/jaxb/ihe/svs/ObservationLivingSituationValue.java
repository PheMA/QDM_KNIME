//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.15 at 03:09:44 PM CST 
//


package edu.phema.jaxb.ihe.svs;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for ObservationLivingSituationValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationLivingSituationValue">
 *   &lt;restriction base="{urn:ihe:iti:svs:2008}cs">
 *     &lt;enumeration value="LIVSIT"/>
 *     &lt;enumeration value="ALONE"/>
 *     &lt;enumeration value="DEPCHD"/>
 *     &lt;enumeration value="DEPSPS"/>
 *     &lt;enumeration value="DEPYGCHD"/>
 *     &lt;enumeration value="FAM"/>
 *     &lt;enumeration value="RELAT"/>
 *     &lt;enumeration value="SPS"/>
 *     &lt;enumeration value="UNREL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ObservationLivingSituationValue {

    LIVSIT,
    ALONE,
    DEPCHD,
    DEPSPS,
    DEPYGCHD,
    FAM,
    RELAT,
    SPS,
    UNREL;

    public String value() {
        return name();
    }

    public static ObservationLivingSituationValue fromValue(String v) {
        return valueOf(v);
    }

}
