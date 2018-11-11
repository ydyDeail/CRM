package org.ydy.domain;

import org.ydy.entity.CstService;

import java.io.Serializable;
import java.util.List;

/**
 * @author 姚端阳
 * @date 2018/10/23 15:55
 */
public class ServiceParam implements Serializable {
    private int pageNo = 1;
    private int pageSize = 3;
    private int count;
    private int pageCount;
    private List<CstService> list;
    private Integer from;
    private Integer offset;
    private String svr_cust_name;  //客户姓名
    private String svr_title;  //服务概要
    private String svr_type;  //服务类型
    private String up; //上限时间
    private String down; //下限时间
    private String svr_status;  //状态

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

    public List<CstService> getList() {
        return list;
    }

    public void setList(List<CstService> list) {
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

    public String getSvr_cust_name() {
        return svr_cust_name;
    }

    public void setSvr_cust_name(String svr_cust_name) {
        this.svr_cust_name = svr_cust_name;
    }

    public String getSvr_title() {
        return svr_title;
    }

    public void setSvr_title(String svr_title) {
        this.svr_title = svr_title;
    }

    public String getSvr_type() {
        return svr_type;
    }

    public void setSvr_type(String svr_type) {
        this.svr_type = svr_type;
    }

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }

    public String getDown() {
        return down;
    }

    public void setDown(String down) {
        this.down = down;
    }

    public String getSvr_status() {
        return svr_status;
    }

    public void setSvr_status(String svr_status) {
        this.svr_status = svr_status;
    }
}
