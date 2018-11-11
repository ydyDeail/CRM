package org.ydy.entity;

import java.io.Serializable;

/**
 * @author 姚端阳
 * @date 2018/10/21 14:39
 * 商品表
 */
public class Product implements Serializable {
    private Integer Prod_id; //产品编号
    private String Prod_name; //产品名称
    private String Prod_type; //产品型号
    private String Prod_batch; //产品批次
    private String Prod_unit; //产品单位
    private Double Prod_price; //产品单价
    private String Prod_memo; //备注

    public Integer getProd_id() {
        return Prod_id;
    }

    public void setProd_id(Integer prod_id) {
        Prod_id = prod_id;
    }

    public String getProd_name() {
        return Prod_name;
    }

    public void setProd_name(String prod_name) {
        Prod_name = prod_name;
    }

    public String getProd_type() {
        return Prod_type;
    }

    public void setProd_type(String prod_type) {
        Prod_type = prod_type;
    }

    public String getProd_batch() {
        return Prod_batch;
    }

    public void setProd_batch(String prod_batch) {
        Prod_batch = prod_batch;
    }

    public String getProd_unit() {
        return Prod_unit;
    }

    public void setProd_unit(String prod_unit) {
        Prod_unit = prod_unit;
    }

    public Double getProd_price() {
        return Prod_price;
    }

    public void setProd_price(Double prod_price) {
        Prod_price = prod_price;
    }

    public String getProd_memo() {
        return Prod_memo;
    }

    public void setProd_memo(String prod_memo) {
        Prod_memo = prod_memo;
    }
}
