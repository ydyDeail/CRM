package org.ydy.entity;

import java.io.Serializable;

/**
 * @author 姚端阳
 * @date 2018/10/17 21:18
 */
public class Cust_name implements Serializable {
    private String cust_no; //客户ID

    public String getCust_no() {
        return cust_no;
    }

    public void setCust_no(String cust_no) {
        this.cust_no = cust_no;
    }

    private String cust_name; //客户姓名
    private String lkm_name; //联系人姓名
    private String lkm_mobile; //联系人电话

    public String getLkm_name() {
        return lkm_name;
    }

    public void setLkm_name(String lkm_name) {
        this.lkm_name = lkm_name;
    }

    public String getLkm_mobile() {
        return lkm_mobile;
    }

    public void setLkm_mobile(String lkm_mobile) {
        this.lkm_mobile = lkm_mobile;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }
}
