package org.ydy.entity;

import java.io.Serializable;

/**
 * @author 姚端阳
 * @date 2018/10/14 16:36
 */
public class LianXi implements Serializable {
    private Integer lkm_id; //联系人编号
    private String lkm_cust_no; //客户编号
    private String lkm_cust_name; //客户姓名
    private String lkm_name; //联系人姓名
    private String lkm_sex; //联系人性别
    private String lkm_postion; //联系人职位
    private String lkm_tel; //联系人办公电话
    private String lkm_mobile; //手机
    private String lkm_memo; //备注
    public Integer getLkm_id() {
        return lkm_id;
    }

    public void setLkm_id(Integer lkm_id) {
        this.lkm_id = lkm_id;
    }

    public String getLkm_cust_no() {
        return lkm_cust_no;
    }

    public void setLkm_cust_no(String lkm_cust_no) {
        this.lkm_cust_no = lkm_cust_no;
    }

    public String getLkm_cust_name() {
        return lkm_cust_name;
    }

    public void setLkm_cust_name(String lkm_cust_name) {
        this.lkm_cust_name = lkm_cust_name;
    }

    public String getLkm_name() {
        return lkm_name;
    }

    public void setLkm_name(String lkm_name) {
        this.lkm_name = lkm_name;
    }

    public String getLkm_sex() {
        return lkm_sex;
    }

    public void setLkm_sex(String lkm_sex) {
        this.lkm_sex = lkm_sex;
    }

    public String getLkm_postion() {
        return lkm_postion;
    }

    public void setLkm_postion(String lkm_postion) {
        this.lkm_postion = lkm_postion;
    }

    public String getLkm_tel() {
        return lkm_tel;
    }

    public void setLkm_tel(String lkm_tel) {
        this.lkm_tel = lkm_tel;
    }

    public String getLkm_mobile() {
        return lkm_mobile;
    }

    public void setLkm_mobile(String lkm_mobile) {
        this.lkm_mobile = lkm_mobile;
    }

    public String getLkm_memo() {
        return lkm_memo;
    }

    public void setLkm_memo(String lkm_memo) {
        this.lkm_memo = lkm_memo;
    }
}
