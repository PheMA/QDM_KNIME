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
 * <p>Java class for ActMood.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActMood">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DEF"/>
 *     &lt;enumeration value="EVN"/>
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="CRT"/>
 *     &lt;enumeration value="EXPEC"/>
 *     &lt;enumeration value="GOL"/>
 *     &lt;enumeration value="OPT"/>
 *     &lt;enumeration value="PERM"/>
 *     &lt;enumeration value="PERMRQ"/>
 *     &lt;enumeration value="RSK"/>
 *     &lt;enumeration value="EVN.CRT"/>
 *     &lt;enumeration value="GOL.CRT"/>
 *     &lt;enumeration value="INT.CRT"/>
 *     &lt;enumeration value="RSK.CRT"/>
 *     &lt;enumeration value="APT"/>
 *     &lt;enumeration value="ARQ"/>
 *     &lt;enumeration value="PRMS"/>
 *     &lt;enumeration value="PRP"/>
 *     &lt;enumeration value="RQO"/>
 *     &lt;enumeration value="SLOT"/>
 *     &lt;enumeration value="PRMS.CRT"/>
 *     &lt;enumeration value="RQO.CRT"/>
 *     &lt;enumeration value="RMD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ActMood {

    DEF("DEF"),
    EVN("EVN"),
    INT("INT"),
    CRT("CRT"),
    EXPEC("EXPEC"),
    GOL("GOL"),
    OPT("OPT"),
    PERM("PERM"),
    PERMRQ("PERMRQ"),
    RSK("RSK"),
    @XmlEnumValue("EVN.CRT")
    EVN_CRT("EVN.CRT"),
    @XmlEnumValue("GOL.CRT")
    GOL_CRT("GOL.CRT"),
    @XmlEnumValue("INT.CRT")
    INT_CRT("INT.CRT"),
    @XmlEnumValue("RSK.CRT")
    RSK_CRT("RSK.CRT"),
    APT("APT"),
    ARQ("ARQ"),
    PRMS("PRMS"),
    PRP("PRP"),
    RQO("RQO"),
    SLOT("SLOT"),
    @XmlEnumValue("PRMS.CRT")
    PRMS_CRT("PRMS.CRT"),
    @XmlEnumValue("RQO.CRT")
    RQO_CRT("RQO.CRT"),
    RMD("RMD");
    private final String value;

    ActMood(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActMood fromValue(String v) {
        for (ActMood c: ActMood.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
