package org.ydy.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.ydy.domain.ServiceParam;
import org.ydy.entity.Bas;
import org.ydy.entity.CstService;
import org.ydy.entity.Cust_name;
import org.ydy.entity.Maneger;

import java.util.List;

public interface CstServiceMapper {
    @Insert("INSERT INTO cst_service(svr_type,svr_title,svr_cust_no,svr_cust_name,svr_status,svr_request,svr_create_id,svr_create_by,svr_create_date)\n" +
            "VALUE(#{svr_type},#{svr_title},#{svr_cust_no},#{svr_cust_name},'新创建',#{svr_request},#{svr_create_id},#{svr_create_by},NOW())")
    public int addCstService(CstService cstService);

    @Select("SELECT svr_id FROM cst_service ORDER BY svr_id DESC LIMIT 0,1")
    public int newId();

    @Select("SELECT * FROM bas_activity WHERE Dict_type='服务类型'")
    public List<Bas> findService();

    @Select("SELECT usr_id FROM sys_user WHERE usr_name=#{usr_name}")
    public int findUserId(@Param("usr_name") String userName);

    @Select("SELECT cust_no FROM cst_customer WHERE cust_name=#{svr_cust_name}")
    public String findCustomerId(@Param("svr_cust_name") String customerName);

    @Select("SELECT cust_no,cust_name FROM cst_customer")
    public List<Cust_name> getAllCustName();


    //分配
    @Select("<script>" +
            "SELECT * FROM cst_service WHERE 1=1\n" +
            "AND svr_status=#{svr_status}\n" +
            "<if test='svr_cust_name!=null'>AND svr_cust_name LIKE CONCAT('%',#{svr_cust_name},'%')\n</if>" +
            "<if test='svr_type!=\"全部\"'>AND svr_type LIKE CONCAT('%',#{svr_type},'%')\n</if>" +
            "<if test='svr_title!=null'>AND svr_title LIKE CONCAT('%',#{svr_title},'%')\n</if>" +
            "<if test='up!=null'><![CDATA[AND svr_create_date < #{up}\n]]></if>" +
            "<if test='down!=null'><![CDATA[AND svr_create_date > #{down}]]></if>" +
            "LIMIT #{from},#{offset}" +
            "</script>")
    public List<CstService> getAllCstService(ServiceParam serviceParam);
    @Select("<script>" +
            "SELECT count(1) FROM cst_service WHERE 1=1\n" +
            "AND svr_status=#{svr_status}\n" +
            "<if test='svr_cust_name!=null'>AND svr_cust_name LIKE CONCAT('%',#{svr_cust_name},'%')\n</if>" +
            "<if test='svr_type!=\"全部\"'>AND svr_type LIKE CONCAT('%',#{svr_type},'%')\n</if>" +
            "<if test='svr_title!=null'>AND svr_title LIKE CONCAT('%',#{svr_title},'%')\n</if>" +
            "<if test='up!=null'><![CDATA[AND svr_create_date < #{up}\n]]></if>" +
            "<if test='down!=null'><![CDATA[AND svr_create_date > #{down}]]></if>" +
            "</script>")
    public int getCstServiceCount(ServiceParam serviceParam);
    @Select("SELECT cust_manager_id,Cust_manager_name FROM cst_customer GROUP BY cust_manager_id")
    public List<Maneger> findAllManeger();
}
