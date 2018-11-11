package org.ydy.entity;

import java.io.Serializable;

/**
 * @author 姚端阳
 * @date 2018/10/24 17:06
 */
public class OrderInfo implements Serializable {
    private String chanpin;
    private int Odd_count;
    private String Odd_unit;
    private Double Odd_price;
    private Double Prod_price;

    public String getChanpin() {
        return chanpin;
    }

    public void setChanpin(String chanpin) {
        this.chanpin = chanpin;
    }

    public int getOdd_count() {
        return Odd_count;
    }

    public void setOdd_count(int odd_count) {
        Odd_count = odd_count;
    }

    public String getOdd_unit() {
        return Odd_unit;
    }

    public void setOdd_unit(String odd_unit) {
        Odd_unit = odd_unit;
    }

    public Double getOdd_price() {
        return Odd_price;
    }

    public void setOdd_price(Double odd_price) {
        Odd_price = odd_price;
    }

    public Double getProd_price() {
        return Prod_price;
    }

    public void setProd_price(Double prod_price) {
        Prod_price = prod_price;
    }
}
