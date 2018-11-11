package org.ydy.domain;

import java.io.Serializable;

/**
 * @author 姚端阳
 * @date 2018/10/24 13:17
 */
public class FuWuParam implements Serializable {
    private String svr_type; //条目
    private Integer num; //服务个数
    private Integer uptime; //上限年份
    private Integer dowmtime; //下限年份
    private String stime;
    private String xtime;

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    public String getXtime() {
        return xtime;
    }

    public void setXtime(String xtime) {
        this.xtime = xtime;
    }

    public Integer getUptime() {
        return uptime;
    }

    public void setUptime(Integer uptime) {
        this.uptime = uptime;
    }

    public Integer getDowmtime() {
        return dowmtime;
    }

    public void setDowmtime(Integer dowmtime) {
        this.dowmtime = dowmtime;
    }

    public String getSvr_type() {
        return svr_type;
    }

    public void setSvr_type(String svr_type) {
        this.svr_type = svr_type;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "FuWuParam{" +
                "svr_type='" + svr_type + '\'' +
                ", num=" + num +
                ", uptime=" + uptime +
                ", dowmtime=" + dowmtime +
                ", stime='" + stime + '\'' +
                ", xtime='" + xtime + '\'' +
                '}';
    }
}
