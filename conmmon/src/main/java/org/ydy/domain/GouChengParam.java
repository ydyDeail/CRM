package org.ydy.domain;

/**
 * @author 姚端阳
 * @date 2018/10/22 11:41
 */
public class GouChengParam {
    private String cust_level_label; // 客户等级
    private Integer cll; //客户等级个数

    private Integer cust_credit; //信用度
    private Integer cc; //信用度个数

    private Integer cust_satisfy; //满意度
    private Integer cs; //满意度个数

    public String getCust_level_label() {
        return cust_level_label;
    }

    public void setCust_level_label(String cust_level_label) {
        this.cust_level_label = cust_level_label;
    }

    public Integer getCll() {
        return cll;
    }

    public void setCll(Integer cll) {
        this.cll = cll;
    }

    public Integer getCust_credit() {
        return cust_credit;
    }

    public void setCust_credit(Integer cust_credit) {
        this.cust_credit = cust_credit;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public Integer getCust_satisfy() {
        return cust_satisfy;
    }

    public void setCust_satisfy(Integer cust_satisfy) {
        this.cust_satisfy = cust_satisfy;
    }

    public Integer getCs() {
        return cs;
    }

    public void setCs(Integer cs) {
        this.cs = cs;
    }
}
