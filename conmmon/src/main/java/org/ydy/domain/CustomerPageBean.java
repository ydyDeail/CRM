package org.ydy.domain;

import org.ydy.entity.Customer;

import java.util.List;

/**
 * @author 姚端阳
 * @date 2018/10/4 15:39
 */
public class CustomerPageBean {
    private int pageNo = 1;
    private int pageSize = 3;
    private int count;
    private int pageCount;
    private List<Customer> list;
    private Integer from;
    private Integer offset;
    private String cust_no; //客户编号
    private String cust_name; //客户名称
    private String cust_region; //地区
    private String Cust_manager_name; //客户经理
    private String cust_level_label; //客户等级

    public String getCust_no() {
        return cust_no;
    }

    public void setCust_no(String cust_no) {
        this.cust_no = cust_no;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_region() {
        return cust_region;
    }

    public void setCust_region(String cust_region) {
        this.cust_region = cust_region;
    }

    public String getCust_manager_name() {
        return Cust_manager_name;
    }

    public void setCust_manager_name(String cust_manager_name) {
        Cust_manager_name = cust_manager_name;
    }

    public String getCust_level_label() {
        return cust_level_label;
    }

    public void setCust_level_label(String cust_level_label) {
        this.cust_level_label = cust_level_label;
    }

    public int getPageNo() {
        if (pageNo > getPageCount()) {
            pageNo = getPageCount();
        }
        if (pageNo < 1) {
            pageNo = 1;
        }
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPageCount() {
        pageCount = count % pageNo == 0 ? count / pageSize : count / pageSize + 1;
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<Customer> getList() {
        return list;
    }

    public void setList(List<Customer> list) {
        this.list = list;
    }

    public Integer getFrom() {
        from = (this.getPageNo() - 1) * pageSize;
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getOffset() {
        offset = pageSize;
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
