
package com.manishjavadev.schema.account;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SAVING"/>
 *     &lt;enumeration value="CURRENT"/>
 *     &lt;enumeration value="SALARY"/>
 *     &lt;enumeration value="CREDIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountType")
@XmlEnum
public enum AccountType {

    SAVING,
    CURRENT,
    SALARY,
    CREDIT;

    public String value() {
        return name();
    }

    public static AccountType fromValue(String v) {
        return valueOf(v);
    }

}
