package org.ydy.domain;

import org.ydy.entity.Product;

import java.util.List;

/**
 * @author 姚端阳
 * @date 2018/10/21 21:06
 */
public class ProductParam {
    private int pageNo = 1;
    private int pageSize = 3;
    private int count;
    private int pageCount;
    private List<Product> list;
    private Integer from;
    private Integer offset;
    private String Prod_name; //产品名称
    private String Prod_type; //产品型号
    private String Prod_batch; //产品批次

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

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
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

    public String getProd_name() {
        return Prod_name;
    }

    public void setProd_name(String prod_name) {
        Prod_name = prod_name;
    }

    public String getProd_type() {
        return Prod_type;
    }

    public void setProd_type(String prod_type) {
        Prod_type = prod_type;
    }

    public String getProd_batch() {
        return Prod_batch;
    }

    public void setProd_batch(String prod_batch) {
        Prod_batch = prod_batch;
    }
}
