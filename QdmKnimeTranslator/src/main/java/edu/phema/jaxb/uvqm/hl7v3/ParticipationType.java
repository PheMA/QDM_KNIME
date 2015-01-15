//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 01:40:43 PM EST 
//


package edu.phema.jaxb.uvqm.hl7v3;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for ParticipationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PART"/>
 *     &lt;enumeration value="ADM"/>
 *     &lt;enumeration value="ATND"/>
 *     &lt;enumeration value="CALLBCK"/>
 *     &lt;enumeration value="CON"/>
 *     &lt;enumeration value="DIS"/>
 *     &lt;enumeration value="ESC"/>
 *     &lt;enumeration value="REF"/>
 *     &lt;enumeration value="AUT"/>
 *     &lt;enumeration value="INF"/>
 *     &lt;enumeration value="TRANS"/>
 *     &lt;enumeration value="WIT"/>
 *     &lt;enumeration value="NRD"/>
 *     &lt;enumeration value="RDV"/>
 *     &lt;enumeration value="BBY"/>
 *     &lt;enumeration value="CSM"/>
 *     &lt;enumeration value="DEV"/>
 *     &lt;enumeration value="DON"/>
 *     &lt;enumeration value="EXPAGNT"/>
 *     &lt;enumeration value="EXPART"/>
 *     &lt;enumeration value="PRD"/>
 *     &lt;enumeration value="SBJ"/>
 *     &lt;enumeration value="EXPTRGT"/>
 *     &lt;enumeration value="EXSRC"/>
 *     &lt;enumeration value="BEN"/>
 *     &lt;enumeration value="CAGNT"/>
 *     &lt;enumeration value="COV"/>
 *     &lt;enumeration value="GUAR"/>
 *     &lt;enumeration value="HLD"/>
 *     &lt;enumeration value="RCT"/>
 *     &lt;enumeration value="RCV"/>
 *     &lt;enumeration value="NOT"/>
 *     &lt;enumeration value="PRCP"/>
 *     &lt;enumeration value="REFB"/>
 *     &lt;enumeration value="REFT"/>
 *     &lt;enumeration value="TRC"/>
 *     &lt;enumeration value="DST"/>
 *     &lt;enumeration value="ELOC"/>
 *     &lt;enumeration value="ORG"/>
 *     &lt;enumeration value="RML"/>
 *     &lt;enumeration value="VIA"/>
 *     &lt;enumeration value="CST"/>
 *     &lt;enumeration value="DIR"/>
 *     &lt;enumeration value="IND"/>
 *     &lt;enumeration value="IRCP"/>
 *     &lt;enumeration value="LOC"/>
 *     &lt;enumeration value="PRF"/>
 *     &lt;enumeration value="RESP"/>
 *     &lt;enumeration value="VRF"/>
 *     &lt;enumeration value="DIST"/>
 *     &lt;enumeration value="PPRF"/>
 *     &lt;enumeration value="SPRF"/>
 *     &lt;enumeration value="SPC"/>
 *     &lt;enumeration value="ENT"/>
 *     &lt;enumeration value="AUTHEN"/>
 *     &lt;enumeration value="LA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ParticipationType {

    PART,
    ADM,
    ATND,
    CALLBCK,
    CON,
    DIS,
    ESC,
    REF,
    AUT,
    INF,
    TRANS,
    WIT,
    NRD,
    RDV,
    BBY,
    CSM,
    DEV,
    DON,
    EXPAGNT,
    EXPART,
    PRD,
    SBJ,
    EXPTRGT,
    EXSRC,
    BEN,
    CAGNT,
    COV,
    GUAR,
    HLD,
    RCT,
    RCV,
    NOT,
    PRCP,
    REFB,
    REFT,
    TRC,
    DST,
    ELOC,
    ORG,
    RML,
    VIA,
    CST,
    DIR,
    IND,
    IRCP,
    LOC,
    PRF,
    RESP,
    VRF,
    DIST,
    PPRF,
    SPRF,
    SPC,
    ENT,
    AUTHEN,
    LA;

    public String value() {
        return name();
    }

    public static ParticipationType fromValue(String v) {
        return valueOf(v);
    }

}
