package org.ydy.domain;

import org.ydy.entity.Lost;

import java.io.Serializable;
import java.util.List;

/**
 * @author 姚端阳
 * @date 2018/10/24 20:14
 */
public class LostParam implements Serializable {
    private int pageNo = 1;
    private int pageSize = 3;
    private int count;
    private int pageCount;
    private List<Lost> list;
    private Integer from;
    private Integer offset;
    private String Lst_cust_name; //客户姓名
    private String Lst_manager_name; //客户经理
    private String Lst_status; //状态

    public int getPageNo() {
        if(pageNo>this.getPageCount()){
            pageNo=this.getPageCount();
        }
        if(pageNo<1){
            pageNo=1;
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
        pageCount=count%pageSize==0?count/pageSize:count/pageSize+1;
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<Lost> getList() {
        return list;
    }

    public void setList(List<Lost> list) {
        this.list = list;
    }

    public Integer getFrom() {
        from=(getPageNo()-1)*pageSize;
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getOffset() {
        offset=pageSize;
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getLst_cust_name() {
        return Lst_cust_name;
    }

    public void setLst_cust_name(String lst_cust_name) {
        Lst_cust_name = lst_cust_name;
    }

    public String getLst_manager_name() {
        return Lst_manager_name;
    }

    public void setLst_manager_name(String lst_manager_name) {
        Lst_manager_name = lst_manager_name;
    }

    public String getLst_status() {
        return Lst_status;
    }

    public void setLst_status(String lst_status) {
        Lst_status = lst_status;
    }
}
