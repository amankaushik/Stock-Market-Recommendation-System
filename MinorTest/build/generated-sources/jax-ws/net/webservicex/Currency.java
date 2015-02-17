
package net.webservicex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Currency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Currency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AFA"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="DZD"/>
 *     &lt;enumeration value="ARS"/>
 *     &lt;enumeration value="AWG"/>
 *     &lt;enumeration value="AUD"/>
 *     &lt;enumeration value="BSD"/>
 *     &lt;enumeration value="BHD"/>
 *     &lt;enumeration value="BDT"/>
 *     &lt;enumeration value="BBD"/>
 *     &lt;enumeration value="BZD"/>
 *     &lt;enumeration value="BMD"/>
 *     &lt;enumeration value="BTN"/>
 *     &lt;enumeration value="BOB"/>
 *     &lt;enumeration value="BWP"/>
 *     &lt;enumeration value="BRL"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="BND"/>
 *     &lt;enumeration value="BIF"/>
 *     &lt;enumeration value="XOF"/>
 *     &lt;enumeration value="XAF"/>
 *     &lt;enumeration value="KHR"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="CVE"/>
 *     &lt;enumeration value="KYD"/>
 *     &lt;enumeration value="CLP"/>
 *     &lt;enumeration value="CNY"/>
 *     &lt;enumeration value="COP"/>
 *     &lt;enumeration value="KMF"/>
 *     &lt;enumeration value="CRC"/>
 *     &lt;enumeration value="HRK"/>
 *     &lt;enumeration value="CUP"/>
 *     &lt;enumeration value="CYP"/>
 *     &lt;enumeration value="CZK"/>
 *     &lt;enumeration value="DKK"/>
 *     &lt;enumeration value="DJF"/>
 *     &lt;enumeration value="DOP"/>
 *     &lt;enumeration value="XCD"/>
 *     &lt;enumeration value="EGP"/>
 *     &lt;enumeration value="SVC"/>
 *     &lt;enumeration value="EEK"/>
 *     &lt;enumeration value="ETB"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="FKP"/>
 *     &lt;enumeration value="GMD"/>
 *     &lt;enumeration value="GHC"/>
 *     &lt;enumeration value="GIP"/>
 *     &lt;enumeration value="XAU"/>
 *     &lt;enumeration value="GTQ"/>
 *     &lt;enumeration value="GNF"/>
 *     &lt;enumeration value="GYD"/>
 *     &lt;enumeration value="HTG"/>
 *     &lt;enumeration value="HNL"/>
 *     &lt;enumeration value="HKD"/>
 *     &lt;enumeration value="HUF"/>
 *     &lt;enumeration value="ISK"/>
 *     &lt;enumeration value="INR"/>
 *     &lt;enumeration value="IDR"/>
 *     &lt;enumeration value="IQD"/>
 *     &lt;enumeration value="ILS"/>
 *     &lt;enumeration value="JMD"/>
 *     &lt;enumeration value="JPY"/>
 *     &lt;enumeration value="JOD"/>
 *     &lt;enumeration value="KZT"/>
 *     &lt;enumeration value="KES"/>
 *     &lt;enumeration value="KRW"/>
 *     &lt;enumeration value="KWD"/>
 *     &lt;enumeration value="LAK"/>
 *     &lt;enumeration value="LVL"/>
 *     &lt;enumeration value="LBP"/>
 *     &lt;enumeration value="LSL"/>
 *     &lt;enumeration value="LRD"/>
 *     &lt;enumeration value="LYD"/>
 *     &lt;enumeration value="LTL"/>
 *     &lt;enumeration value="MOP"/>
 *     &lt;enumeration value="MKD"/>
 *     &lt;enumeration value="MGF"/>
 *     &lt;enumeration value="MWK"/>
 *     &lt;enumeration value="MYR"/>
 *     &lt;enumeration value="MVR"/>
 *     &lt;enumeration value="MTL"/>
 *     &lt;enumeration value="MRO"/>
 *     &lt;enumeration value="MUR"/>
 *     &lt;enumeration value="MXN"/>
 *     &lt;enumeration value="MDL"/>
 *     &lt;enumeration value="MNT"/>
 *     &lt;enumeration value="MAD"/>
 *     &lt;enumeration value="MZM"/>
 *     &lt;enumeration value="MMK"/>
 *     &lt;enumeration value="NAD"/>
 *     &lt;enumeration value="NPR"/>
 *     &lt;enumeration value="ANG"/>
 *     &lt;enumeration value="NZD"/>
 *     &lt;enumeration value="NIO"/>
 *     &lt;enumeration value="NGN"/>
 *     &lt;enumeration value="KPW"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="OMR"/>
 *     &lt;enumeration value="XPF"/>
 *     &lt;enumeration value="PKR"/>
 *     &lt;enumeration value="XPD"/>
 *     &lt;enumeration value="PAB"/>
 *     &lt;enumeration value="PGK"/>
 *     &lt;enumeration value="PYG"/>
 *     &lt;enumeration value="PEN"/>
 *     &lt;enumeration value="PHP"/>
 *     &lt;enumeration value="XPT"/>
 *     &lt;enumeration value="PLN"/>
 *     &lt;enumeration value="QAR"/>
 *     &lt;enumeration value="ROL"/>
 *     &lt;enumeration value="RUB"/>
 *     &lt;enumeration value="WST"/>
 *     &lt;enumeration value="STD"/>
 *     &lt;enumeration value="SAR"/>
 *     &lt;enumeration value="SCR"/>
 *     &lt;enumeration value="SLL"/>
 *     &lt;enumeration value="XAG"/>
 *     &lt;enumeration value="SGD"/>
 *     &lt;enumeration value="SKK"/>
 *     &lt;enumeration value="SIT"/>
 *     &lt;enumeration value="SBD"/>
 *     &lt;enumeration value="SOS"/>
 *     &lt;enumeration value="ZAR"/>
 *     &lt;enumeration value="LKR"/>
 *     &lt;enumeration value="SHP"/>
 *     &lt;enumeration value="SDD"/>
 *     &lt;enumeration value="SRG"/>
 *     &lt;enumeration value="SZL"/>
 *     &lt;enumeration value="SEK"/>
 *     &lt;enumeration value="CHF"/>
 *     &lt;enumeration value="SYP"/>
 *     &lt;enumeration value="TWD"/>
 *     &lt;enumeration value="TZS"/>
 *     &lt;enumeration value="THB"/>
 *     &lt;enumeration value="TOP"/>
 *     &lt;enumeration value="TTD"/>
 *     &lt;enumeration value="TND"/>
 *     &lt;enumeration value="TRL"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="AED"/>
 *     &lt;enumeration value="UGX"/>
 *     &lt;enumeration value="UAH"/>
 *     &lt;enumeration value="UYU"/>
 *     &lt;enumeration value="VUV"/>
 *     &lt;enumeration value="VEB"/>
 *     &lt;enumeration value="VND"/>
 *     &lt;enumeration value="YER"/>
 *     &lt;enumeration value="YUM"/>
 *     &lt;enumeration value="ZMK"/>
 *     &lt;enumeration value="ZWD"/>
 *     &lt;enumeration value="TRY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Currency")
@XmlEnum
public enum Currency {

    AFA,
    ALL,
    DZD,
    ARS,
    AWG,
    AUD,
    BSD,
    BHD,
    BDT,
    BBD,
    BZD,
    BMD,
    BTN,
    BOB,
    BWP,
    BRL,
    GBP,
    BND,
    BIF,
    XOF,
    XAF,
    KHR,
    CAD,
    CVE,
    KYD,
    CLP,
    CNY,
    COP,
    KMF,
    CRC,
    HRK,
    CUP,
    CYP,
    CZK,
    DKK,
    DJF,
    DOP,
    XCD,
    EGP,
    SVC,
    EEK,
    ETB,
    EUR,
    FKP,
    GMD,
    GHC,
    GIP,
    XAU,
    GTQ,
    GNF,
    GYD,
    HTG,
    HNL,
    HKD,
    HUF,
    ISK,
    INR,
    IDR,
    IQD,
    ILS,
    JMD,
    JPY,
    JOD,
    KZT,
    KES,
    KRW,
    KWD,
    LAK,
    LVL,
    LBP,
    LSL,
    LRD,
    LYD,
    LTL,
    MOP,
    MKD,
    MGF,
    MWK,
    MYR,
    MVR,
    MTL,
    MRO,
    MUR,
    MXN,
    MDL,
    MNT,
    MAD,
    MZM,
    MMK,
    NAD,
    NPR,
    ANG,
    NZD,
    NIO,
    NGN,
    KPW,
    NOK,
    OMR,
    XPF,
    PKR,
    XPD,
    PAB,
    PGK,
    PYG,
    PEN,
    PHP,
    XPT,
    PLN,
    QAR,
    ROL,
    RUB,
    WST,
    STD,
    SAR,
    SCR,
    SLL,
    XAG,
    SGD,
    SKK,
    SIT,
    SBD,
    SOS,
    ZAR,
    LKR,
    SHP,
    SDD,
    SRG,
    SZL,
    SEK,
    CHF,
    SYP,
    TWD,
    TZS,
    THB,
    TOP,
    TTD,
    TND,
    TRL,
    USD,
    AED,
    UGX,
    UAH,
    UYU,
    VUV,
    VEB,
    VND,
    YER,
    YUM,
    ZMK,
    ZWD,
    TRY;

    public String value() {
        return name();
    }

    public static Currency fromValue(String v) {
        return valueOf(v);
    }

}
