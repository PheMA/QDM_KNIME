//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 01:40:43 PM EST 
//


package edu.phema.jaxb.uvqm.hl7v3;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for x_ActRelationshipDocumentSPL.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActRelationshipDocumentSPL">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="APND"/>
 *     &lt;enumeration value="DRIV"/>
 *     &lt;enumeration value="RPLC"/>
 *     &lt;enumeration value="XCRPT"/>
 *     &lt;enumeration value="XFRM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum XActRelationshipDocumentSPL {

    APND,
    DRIV,
    RPLC,
    XCRPT,
    XFRM;

    public String value() {
        return name();
    }

    public static XActRelationshipDocumentSPL fromValue(String v) {
        return valueOf(v);
    }

}
