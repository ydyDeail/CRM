package org.ydy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 姚端阳
 * @date 2018/10/16 15:29
 */
public class Chance implements Serializable {
    private Integer Chc_id; //机会编号
    private String Chc_source; //机会来源
    private String Chc_cust_name; //客户名称
    private String chc_title; //机会标题
    private Integer chc_rate; //成功几率
    private String chc_linkman; //联系人
    private String chc_tel; //联系电话
    private String chc_desc; //机会描述
    private Integer chc_create_id; //创建人编号
    private String chc_create_by; //创建人
    private Date chc_create_date; //创建时间
    private Integer chc_due_id; //指派对象编号
    private String chc_due_to; //指派对象姓名
    private Date chc_due_date; //指派时间
    private String chc_status; //状态

    public Integer getChc_id() {
        return Chc_id;
    }

    public void setChc_id(Integer chc_id) {
        Chc_id = chc_id;
    }

    public String getChc_source() {
        return Chc_source;
    }

    public void setChc_source(String chc_source) {
        Chc_source = chc_source;
    }

    public String getChc_cust_name() {
        return Chc_cust_name;
    }

    public void setChc_cust_name(String chc_cust_name) {
        Chc_cust_name = chc_cust_name;
    }

    public String getChc_title() {
        return chc_title;
    }

    public void setChc_title(String chc_title) {
        this.chc_title = chc_title;
    }

    public Integer getChc_rate() {
        return chc_rate;
    }

    public void setChc_rate(Integer chc_rate) {
        this.chc_rate = chc_rate;
    }

    public String getChc_linkman() {
        return chc_linkman;
    }

    public void setChc_linkman(String chc_linkman) {
        this.chc_linkman = chc_linkman;
    }

    public String getChc_tel() {
        return chc_tel;
    }

    public void setChc_tel(String chc_tel) {
        this.chc_tel = chc_tel;
    }

    public String getChc_desc() {
        return chc_desc;
    }

    public void setChc_desc(String chc_desc) {
        this.chc_desc = chc_desc;
    }

    public Integer getChc_create_id() {
        return chc_create_id;
    }

    public void setChc_create_id(Integer chc_create_id) {
        this.chc_create_id = chc_create_id;
    }

    public String getChc_create_by() {
        return chc_create_by;
    }

    public void setChc_create_by(String chc_create_by) {
        this.chc_create_by = chc_create_by;
    }

    public Date getChc_create_date() {
        return chc_create_date;
    }

    public void setChc_create_date(Date chc_create_date) {
        this.chc_create_date = chc_create_date;
    }

    public Integer getChc_due_id() {
        return chc_due_id;
    }

    public void setChc_due_id(Integer chc_due_id) {
        this.chc_due_id = chc_due_id;
    }

    public String getChc_due_to() {
        return chc_due_to;
    }

    public void setChc_due_to(String chc_due_to) {
        this.chc_due_to = chc_due_to;
    }

    public Date getChc_due_date() {
        return chc_due_date;
    }

    public void setChc_due_date(Date chc_due_date) {
        this.chc_due_date = chc_due_date;
    }

    public String getChc_status() {
        return chc_status;
    }

    public void setChc_status(String chc_status) {
        this.chc_status = chc_status;
    }
}
