package org.ydy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 姚端阳
 * @date 2018/10/15 16:07
 * 关系表
 */
public class Activity implements Serializable {
    private Integer Atv_id; //记录编号
    private String Atv_cust_no; //客户编号
    private String Atv_cust_name; //客户姓名
    private Date Atv_date; //交往时间
    private String Atv_place; //地点
    private String Atv_title; //概要
    private String Atv_desc; //详细信息
    private String Atv_beizhu; //备注

    public String getAtv_beizhu() {
        return Atv_beizhu;
    }

    public void setAtv_beizhu(String atv_beizhu) {
        Atv_beizhu = atv_beizhu;
    }

    public Integer getAtv_id() {
        return Atv_id;
    }

    public void setAtv_id(Integer atv_id) {
        Atv_id = atv_id;
    }

    public String getAtv_cust_no() {
        return Atv_cust_no;
    }

    public void setAtv_cust_no(String atv_cust_no) {
        Atv_cust_no = atv_cust_no;
    }

    public String getAtv_cust_name() {
        return Atv_cust_name;
    }

    public void setAtv_cust_name(String atv_cust_name) {
        Atv_cust_name = atv_cust_name;
    }

    public Date getAtv_date() {
        return Atv_date;
    }

    public void setAtv_date(Date atv_date) {
        Atv_date = atv_date;
    }

    public String getAtv_place() {
        return Atv_place;
    }

    public void setAtv_place(String atv_place) {
        Atv_place = atv_place;
    }

    public String getAtv_title() {
        return Atv_title;
    }

    public void setAtv_title(String atv_title) {
        Atv_title = atv_title;
    }

    public String getAtv_desc() {
        return Atv_desc;
    }

    public void setAtv_desc(String atv_desc) {
        Atv_desc = atv_desc;
    }
}
