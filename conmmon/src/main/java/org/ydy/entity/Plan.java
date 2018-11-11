package org.ydy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 姚端阳
 * @date 2018/10/18 15:18
 */
public class Plan implements Serializable {
    private Integer Pla_id; //计划编号
    private Integer Pla_chc_id; //机会编号
    private Date Pla_date; //计划制定时间
    private String Pla_todo; //计划项
    private String Pla_result; //执行结果

    public Integer getPla_id() {
        return Pla_id;
    }

    public void setPla_id(Integer pla_id) {
        Pla_id = pla_id;
    }

    public Integer getPla_chc_id() {
        return Pla_chc_id;
    }

    public void setPla_chc_id(Integer pla_chc_id) {
        Pla_chc_id = pla_chc_id;
    }

    public Date getPla_date() {
        return Pla_date;
    }

    public void setPla_date(Date pla_date) {
        Pla_date = pla_date;
    }

    public String getPla_todo() {
        return Pla_todo;
    }

    public void setPla_todo(String pla_todo) {
        Pla_todo = pla_todo;
    }

    public String getPla_result() {
        return Pla_result;
    }

    public void setPla_result(String pla_result) {
        Pla_result = pla_result;
    }
}
