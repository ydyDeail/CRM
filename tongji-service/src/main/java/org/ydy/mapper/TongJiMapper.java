package org.ydy.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.ydy.domain.FuWuParam;
import org.ydy.domain.GongXianParam;
import org.ydy.domain.GouChengParam;
import org.ydy.domain.LostParam;
import org.ydy.entity.Bas;
import org.ydy.entity.Lost;

import java.util.List;

public interface TongJiMapper {
    @Select("<script>" +
            "SELECT l.Odd_id,o.Odr_customer,l.Odd_price FROM orders o\n" +
            "INNER JOIN orders_line l ON l.Odd_order_id=o.Odr_id\n" +
            "WHERE 1=1\n" +
            "AND o.Odr_date LIKE CONCAT('%',#{Odr_date},'%')\n" +
            "<if test='Odr_customer!=null'>AND o.Odr_customer LIKE CONCAT('%',#{Odr_customer},'%')</if>" +
            "</script>")
    public List<GongXianParam> findAllGongXian(GongXianParam gongXianParam);

    @Select("SELECT cust_level_label,COUNT(cust_level_label) AS cll\n" +
            "FROM cst_customer GROUP BY cust_level_label")
    public List<GouChengParam> findAllLevel(GouChengParam gouChengParam);

    @Select("SELECT cust_credit,COUNT(cust_credit) AS cc\n" +
            "FROM cst_customer GROUP BY cust_credit")
    public List<GouChengParam> findAllManYi(GouChengParam gouChengParam);

    @Select("SELECT cust_satisfy,COUNT(cust_satisfy) AS cs\n" +
            "FROM cst_customer GROUP BY cust_satisfy")
    public List<GouChengParam> findAllXinYong(GouChengParam gouChengParam);

    @Select("<script>" +
            "SELECT s.svr_type,COUNT(s.svr_type) AS num \n" +
            "FROM \n" +
            "(SELECT svr_type FROM cst_service \n" +
            "WHERE 1=1\n" +
            "<if test='stime!=null'><![CDATA[AND svr_create_date<#{stime}\n]]></if>" +
            "<if test='xtime!=null'><![CDATA[AND svr_create_date>=#{xtime}\n]]></if>" +
            ") s " +
            "GROUP BY s.svr_type" +
            "</script>")
    public List<FuWuParam> findAllFuWu(FuWuParam fuWuParam);

    @Select("SELECT * FROM bas_activity WHERE Dict_type='服务类型'")
    public List<Bas> findService();

    @Select("<script>" +
            "SELECT * FROM cst_lost \n" +
            "WHERE 1=1\n" +
            "<if test='Lst_cust_name!=null'>AND Lst_cust_name LIKE CONCAT('%',#{Lst_cust_name},'%') \n</if>" +
            "<if test='Lst_manager_name!=null'>AND Lst_manager_name LIKE CONCAT('%',#{Lst_manager_name},'%')\n</if>" +
            "LIMIT #{from},#{offset}" +
            "</script>")
    public List<Lost> findAllLost(LostParam lostParam);
    @Select("<script>" +
            "SELECT count(1) FROM cst_lost \n" +
            "WHERE 1=1\n" +
            "<if test='Lst_cust_name!=null'>AND Lst_cust_name LIKE CONCAT('%',#{Lst_cust_name},'%') \n</if>" +
            "<if test='Lst_manager_name!=null'>AND Lst_manager_name LIKE CONCAT('%',#{Lst_manager_name},'%')\n</if>" +
            "</script>")
    public int findLostCount(LostParam lostParam);
}
