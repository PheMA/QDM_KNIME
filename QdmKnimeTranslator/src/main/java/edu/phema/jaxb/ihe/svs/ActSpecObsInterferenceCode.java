//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.15 at 03:09:44 PM CST 
//


package edu.phema.jaxb.ihe.svs;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for ActSpecObsInterferenceCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActSpecObsInterferenceCode">
 *   &lt;restriction base="{urn:ihe:iti:svs:2008}cs">
 *     &lt;enumeration value="INTFR"/>
 *     &lt;enumeration value="FIBRIN"/>
 *     &lt;enumeration value="HEMOLYSIS"/>
 *     &lt;enumeration value="ICTERUS"/>
 *     &lt;enumeration value="LIPEMIA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ActSpecObsInterferenceCode {

    INTFR,
    FIBRIN,
    HEMOLYSIS,
    ICTERUS,
    LIPEMIA;

    public String value() {
        return name();
    }

    public static ActSpecObsInterferenceCode fromValue(String v) {
        return valueOf(v);
    }

}
