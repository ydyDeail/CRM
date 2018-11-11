package org.ydy.domain;

import org.ydy.entity.Chance;

import java.io.Serializable;
import java.util.List;

/**
 * @author 姚端阳
 * @date 2018/10/16 16:09
 */
public class ChanceParam implements Serializable {
    private int pageNo = 1;
    private int pageSize = 3;
    private int count;
    private int pageCount;
    private List<Chance> list;
    private Integer from;
    private Integer offset;
    private String Chc_cust_name; //客户名称
    private String chc_title; //摘要
    private String chc_linkman; //联系人

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

    public List<Chance> getList() {
        return list;
    }

    public void setList(List<Chance> list) {
        this.list = list;
    }

    public Integer getFrom() {
        from=(this.getPageNo()-1)*pageSize;
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

    public String getChc_cust_name() {
        return Chc_cust_name;
    }

    public void setChc_cust_name(String chc_cust_name) {
        Chc_cust_name = chc_cust_name;
    }

    public String getChc_title() {
        return chc_title;
    }

    public void setChc_title(String chc_title) {
        this.chc_title = chc_title;
    }

    public String getChc_linkman() {
        return chc_linkman;
    }

    public void setChc_linkman(String chc_linkman) {
        this.chc_linkman = chc_linkman;
    }
}
