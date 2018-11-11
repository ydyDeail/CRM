package org.ydy.domain;

import org.ydy.entity.Bas;

import java.util.List;

/**
 * @author 姚端阳
 * @date 2018/10/21 14:44
 */
public class BasParam {
    private int pageNo = 1;
    private int pageSize = 3;
    private int count;
    private int pageCount;
    private List<Bas> list;
    private Integer from;
    private Integer offset;
    private String Dict_type; //类别
    private String Dict_item; //条目
    private String Dict_value; //值

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

    public List<Bas> getList() {
        return list;
    }

    public void setList(List<Bas> list) {
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

    public String getDict_type() {
        return Dict_type;
    }

    public void setDict_type(String dict_type) {
        Dict_type = dict_type;
    }

    public String getDict_item() {
        return Dict_item;
    }

    public void setDict_item(String dict_item) {
        Dict_item = dict_item;
    }

    public String getDict_value() {
        return Dict_value;
    }

    public void setDict_value(String dict_value) {
        Dict_value = dict_value;
    }
}
