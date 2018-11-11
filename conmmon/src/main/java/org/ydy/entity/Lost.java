package org.ydy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 姚端阳
 * @date 2018/10/16 15:20
 */
public class Lost implements Serializable {
    private Integer Lst_id; //流失编号
    private String Lst_cust_no; //客户编号
    private String Lst_cust_name; //客户姓名
    private Integer Lst_manager_id; //客户经理编号
    private String Lst_manager_name; //客户经理
    private Date Lst_last_order_date; //上次下单时间
    private Date Lst_lost_date; //确认流失时间
    private String Lst_delay; //暂缓措施
    private String Lst_reason; //流失原因
    private String Lst_status; //状态

    public Integer getLst_id() {
        return Lst_id;
    }

    public void setLst_id(Integer lst_id) {
        Lst_id = lst_id;
    }

    public String getLst_cust_no() {
        return Lst_cust_no;
    }

    public void setLst_cust_no(String lst_cust_no) {
        Lst_cust_no = lst_cust_no;
    }

    public String getLst_cust_name() {
        return Lst_cust_name;
    }

    public void setLst_cust_name(String lst_cust_name) {
        Lst_cust_name = lst_cust_name;
    }

    public Integer getLst_manager_id() {
        return Lst_manager_id;
    }

    public void setLst_manager_id(Integer lst_manager_id) {
        Lst_manager_id = lst_manager_id;
    }

    public String getLst_manager_name() {
        return Lst_manager_name;
    }

    public void setLst_manager_name(String lst_manager_name) {
        Lst_manager_name = lst_manager_name;
    }

    public Date getLst_last_order_date() {
        return Lst_last_order_date;
    }

    public void setLst_last_order_date(Date lst_last_order_date) {
        Lst_last_order_date = lst_last_order_date;
    }

    public Date getLst_lost_date() {
        return Lst_lost_date;
    }

    public void setLst_lost_date(Date lst_lost_date) {
        Lst_lost_date = lst_lost_date;
    }

    public String getLst_delay() {
        return Lst_delay;
    }

    public void setLst_delay(String lst_delay) {
        Lst_delay = lst_delay;
    }

    public String getLst_reason() {
        return Lst_reason;
    }

    public void setLst_reason(String lst_reason) {
        Lst_reason = lst_reason;
    }

    public String getLst_status() {
        return Lst_status;
    }

    public void setLst_status(String lst_status) {
        Lst_status = lst_status;
    }
}
