
package com.manishjavadev.schema.account;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="READY"/>
 *     &lt;enumeration value="INPROGRESS"/>
 *     &lt;enumeration value="FAILD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountStatusType")
@XmlEnum
public enum AccountStatusType {

    READY,
    INPROGRESS,
    FAILD;

    public String value() {
        return name();
    }

    public static AccountStatusType fromValue(String v) {
        return valueOf(v);
    }

}
