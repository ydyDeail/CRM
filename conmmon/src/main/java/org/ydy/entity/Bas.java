package org.ydy.entity;

import java.io.Serializable;

/**
 * @author 姚端阳
 * @date 2018/10/21 14:28
 * 数据字典类
 */
public class Bas implements Serializable {
    private Integer Dict_id; //编号
    private String Dict_type; //类别
    private String Dict_item; //条目
    private String Dict_value; //值
    private Integer Dict_id_editable; //是否可编辑

    public Integer getDict_id() {
        return Dict_id;
    }

    public void setDict_id(Integer dict_id) {
        Dict_id = dict_id;
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

    public Integer getDict_id_editable() {
        return Dict_id_editable;
    }

    public void setDict_id_editable(Integer dict_id_editable) {
        Dict_id_editable = dict_id_editable;
    }
}
