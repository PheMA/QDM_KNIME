//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.15 at 03:09:44 PM CST 
//


package edu.phema.jaxb.ihe.svs;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for ActInvoiceDetailGenericProviderCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInvoiceDetailGenericProviderCode">
 *   &lt;restriction base="{urn:ihe:iti:svs:2008}cs">
 *     &lt;enumeration value="CANCAPT"/>
 *     &lt;enumeration value="DSC"/>
 *     &lt;enumeration value="ESA"/>
 *     &lt;enumeration value="FFSTOP"/>
 *     &lt;enumeration value="FNLFEE"/>
 *     &lt;enumeration value="FRSTFEE"/>
 *     &lt;enumeration value="MARKUP"/>
 *     &lt;enumeration value="MISSAPT"/>
 *     &lt;enumeration value="PERMBNS"/>
 *     &lt;enumeration value="PERFEE"/>
 *     &lt;enumeration value="RESTOCK"/>
 *     &lt;enumeration value="TRAVEL"/>
 *     &lt;enumeration value="URGENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ActInvoiceDetailGenericProviderCode {

    CANCAPT,
    DSC,
    ESA,
    FFSTOP,
    FNLFEE,
    FRSTFEE,
    MARKUP,
    MISSAPT,
    PERMBNS,
    PERFEE,
    RESTOCK,
    TRAVEL,
    URGENT;

    public String value() {
        return name();
    }

    public static ActInvoiceDetailGenericProviderCode fromValue(String v) {
        return valueOf(v);
    }

}
