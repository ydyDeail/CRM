package org.ydy.entity;

import java.io.Serializable;

/**
 * @author 姚端阳
 * @date 2018/10/8 15:25
 */
public class Maneger implements Serializable {
    private String cust_manager_id; //客户经理ID
    private String Cust_manager_name; //客户经理姓名

    public String getCust_manager_id() {
        return cust_manager_id;
    }

    public void setCust_manager_id(String cust_manager_id) {
        this.cust_manager_id = cust_manager_id;
    }

    public String getCust_manager_name() {
        return Cust_manager_name;
    }

    public void setCust_manager_name(String cust_manager_name) {
        Cust_manager_name = cust_manager_name;
    }
}
