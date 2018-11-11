package org.ydy.entity;

import java.io.Serializable;

/**
 * @author 姚端阳
 * @date 2018/10/8 13:48
 */
public class Level implements Serializable {
    private String cust_level; //客户等级ID
    private String cust_level_label; //客户等级


    public String getCust_level() {
        return cust_level;
    }

    public void setCust_level(String cust_level) {
        this.cust_level = cust_level;
    }

    public String getCust_level_label() {
        return cust_level_label;
    }

    public void setCust_level_label(String cust_level_label) {
        this.cust_level_label = cust_level_label;
    }
}
