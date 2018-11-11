package org.ydy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 姚端阳
 * @date 2018/10/24 15:24
 */
public class Order implements Serializable {
    private Integer Odr_id; //订单编号
    private String Odr_customer; //客户姓名
    private Date Odr_date; //下单时间
    private String Odr_addr; //送货地址
    private Integer Odr_status; //状态

    public Integer getOdr_id() {
        return Odr_id;
    }

    public void setOdr_id(Integer odr_id) {
        Odr_id = odr_id;
    }

    public String getOdr_customer() {
        return Odr_customer;
    }

    public void setOdr_customer(String odr_customer) {
        Odr_customer = odr_customer;
    }

    public Date getOdr_date() {
        return Odr_date;
    }

    public void setOdr_date(Date odr_date) {
        Odr_date = odr_date;
    }

    public String getOdr_addr() {
        return Odr_addr;
    }

    public void setOdr_addr(String odr_addr) {
        Odr_addr = odr_addr;
    }

    public Integer getOdr_status() {
        return Odr_status;
    }

    public void setOdr_status(Integer odr_status) {
        Odr_status = odr_status;
    }
}
