//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.15 at 03:09:44 PM CST 
//


package edu.phema.jaxb.ihe.svs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for DataTypePeriodicIntervalOfTime.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypePeriodicIntervalOfTime">
 *   &lt;restriction base="{urn:ihe:iti:svs:2008}cs">
 *     &lt;enumeration value="PIVL&lt;TS>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum DataTypePeriodicIntervalOfTime {

    @XmlEnumValue("PIVL<TS>")
    PIVL_TS("PIVL<TS>");
    private final String value;

    DataTypePeriodicIntervalOfTime(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypePeriodicIntervalOfTime fromValue(String v) {
        for (DataTypePeriodicIntervalOfTime c: DataTypePeriodicIntervalOfTime.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
