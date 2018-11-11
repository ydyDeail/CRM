package org.ydy.domain;

/**
 * @author 姚端阳
 * @date 2018/10/22 10:24
 */
public class GongXianParam {
    private Integer Odd_id; //订单明细ID

    public Integer getOdd_id() {
        return Odd_id;
    }

    public void setOdd_id(Integer odd_id) {
        Odd_id = odd_id;
    }

    private String Odr_customer; //客户名
    private Double Odd_price; //订单金额
    private String Odr_date; //下单时间

    public String getOdr_date() {
        return Odr_date;
    }

    public void setOdr_date(String odr_date) {
        Odr_date = odr_date;
    }

    public String getOdr_customer() {
        return Odr_customer;
    }

    public void setOdr_customer(String odr_customer) {
        Odr_customer = odr_customer;
    }

    public Double getOdd_price() {
        return Odd_price;
    }

    public void setOdd_price(Double odd_price) {
        Odd_price = odd_price;
    }
}
