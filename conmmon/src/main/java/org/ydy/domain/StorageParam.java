package org.ydy.domain;

import org.ydy.entity.Storage;

import java.util.List;

/**
 * @author 姚端阳
 * @date 2018/10/21 21:41
 */
public class StorageParam {
    private int pageNo = 1;
    private int pageSize = 3;
    private int count;
    private int pageCount;
    private List<Storage> list;
    private Integer from;
    private Integer offset;
    private String chanPin; //产品
    private String Stk_warehouse; //仓库

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

    public List<Storage> getList() {
        return list;
    }

    public void setList(List<Storage> list) {
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

    public String getChanPin() {
        return chanPin;
    }

    public void setChanPin(String chanPin) {
        this.chanPin = chanPin;
    }

    public String getStk_warehouse() {
        return Stk_warehouse;
    }

    public void setStk_warehouse(String stk_warehouse) {
        Stk_warehouse = stk_warehouse;
    }
}
