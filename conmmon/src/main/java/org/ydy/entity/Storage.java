package org.ydy.entity;

import java.io.Serializable;

/**
 * @author 姚端阳
 * @date 2018/10/21 14:42
 * 库存表
 */
public class Storage implements Serializable {
    private Integer Stk_id; //库存编号
    private Integer Stk_prod_id; //产品编号
    private String Stk_warehouse; //仓库
    private String Stk_ware; //货位
    private Integer Stk_count; //件数
    private String Stk_memo; //备注
   private String chanpin; //产品
    public String getChanpin() {
        return chanpin;
    }

    public void setChanpin(String chanpin) {
        this.chanpin = chanpin;
    }

    public Integer getStk_id() {
        return Stk_id;
    }

    public void setStk_id(Integer stk_id) {
        Stk_id = stk_id;
    }

    public Integer getStk_prod_id() {
        return Stk_prod_id;
    }

    public void setStk_prod_id(Integer stk_prod_id) {
        Stk_prod_id = stk_prod_id;
    }

    public String getStk_warehouse() {
        return Stk_warehouse;
    }

    public void setStk_warehouse(String stk_warehouse) {
        Stk_warehouse = stk_warehouse;
    }

    public String getStk_ware() {
        return Stk_ware;
    }

    public void setStk_ware(String stk_ware) {
        Stk_ware = stk_ware;
    }

    public Integer getStk_count() {
        return Stk_count;
    }

    public void setStk_count(Integer stk_count) {
        Stk_count = stk_count;
    }

    public String getStk_memo() {
        return Stk_memo;
    }

    public void setStk_memo(String stk_memo) {
        Stk_memo = stk_memo;
    }
}
