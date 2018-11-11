package org.ydy.mapper;

import org.apache.ibatis.annotations.*;
import org.ydy.domain.BasParam;
import org.ydy.domain.ProductParam;
import org.ydy.domain.StorageParam;
import org.ydy.entity.Bas;
import org.ydy.entity.Product;
import org.ydy.entity.Storage;

import java.util.List;

/**
 * @author 姚端阳
 * @date 2018/10/21 14:51
 */
public interface JiChuMapper {
    //字典表
    @Select("<script>" +
            "SELECT * FROM bas_activity\n" +
            "WHERE 1=1\n" +
            "<if test='Dict_type!=null'>AND Dict_type LIKE CONCAT('%',#{Dict_type},'%')\n</if>" +
            "<if test='Dict_item!=null'>AND Dict_item LIKE CONCAT('%',#{Dict_item},'%')\n</if>" +
            "<if test='Dict_value!=null'>AND Dict_value LIKE CONCAT('%',#{Dict_value},'%')</if>" +
            "LIMIT #{from},#{offset}" +
            "</script>")
    public List<Bas> findAllBas(BasParam basParam);
    @Select("<script>" +
            "SELECT count(1) FROM bas_activity\n" +
            "WHERE 1=1\n" +
            "<if test='Dict_type!=null'>AND Dict_type LIKE CONCAT('%',#{Dict_type},'%')\n</if>" +
            "<if test='Dict_item!=null'>AND Dict_item LIKE CONCAT('%',#{Dict_item},'%')\n</if>" +
            "<if test='Dict_value!=null'>AND Dict_value LIKE CONCAT('%',#{Dict_value},'%')</if>" +
            "</script>")
    public int findAllBasCount(BasParam basParam);

    @Insert("INSERT INTO bas_activity(Dict_type,Dict_item,Dict_value,Dict_id_editable) VALUE(#{Dict_type},#{Dict_item},#{Dict_value},#{Dict_id_editable})")
    public int AddBas(Bas bas);

    @Select("SELECT * FROM bas_activity\n" +
            "WHERE Dict_id=#{Dict_id}")
    public Bas findBasById(@Param("Dict_id") int dict_id);

    @Delete("DELETE FROM bas_activity WHERE Dict_id=#{Dict_id}")
    public int deleteBas(@Param("Dict_id") int dict_id);
    @Update("<script>" +
            "UPDATE bas_activity SET\n" +
            "<if test='Dict_type!=null'>Dict_type=#{Dict_type},\n</if>" +
            "<if test='Dict_item!=null'>Dict_item=#{Dict_item},\n</if>" +
            "<if test='Dict_value!=null'>Dict_value=#{Dict_value},\n</if>" +
            "Dict_id_editable=#{Dict_id_editable}" +
            " WHERE Dict_id=#{Dict_id}" +
            "</script>")
    public int updateBas(Bas bas);
    @Select("SELECT * FROM bas_activity ORDER BY Dict_id DESC LIMIT 0,1")
    public Bas newBasId();


    //商品表
    @Select("<script>" +
            "SELECT * FROM orders_product\n" +
            "WHERE 1=1\n" +
            "<if test='Prod_name!=null'>AND Prod_name LIKE CONCAT('%',#{Prod_name},'%') \n</if>" +
            "<if test='Prod_type!=null'>AND Prod_type LIKE CONCAT('%',#{Prod_type},'%') \n</if>" +
            "<if test='Prod_batch!=null'>AND Prod_batch LIKE CONCAT('%',#{Prod_batch},'%')\n</if>" +
            "LIMIT #{from},#{offset} \n" +
            "</script>")
    public List<Product> findAllProduct(ProductParam productParam);
    @Select("<script>" +
            "SELECT count(1) FROM orders_product\n" +
            "WHERE 1=1\n" +
            "<if test='Prod_name!=null'>AND Prod_name LIKE CONCAT('%',#{Prod_name},'%') \n</if>" +
            "<if test='Prod_type!=null'>AND Prod_type LIKE CONCAT('%',#{Prod_type},'%') \n</if>" +
            "<if test='Prod_batch!=null'>AND Prod_batch LIKE CONCAT('%',#{Prod_batch},'%')\n</if>" +
            "</script>")
    public int findProductCount(ProductParam productParam);

    //库存表
    @Select("<script>" +
            "SELECT s.*,(SELECT CONCAT_WS('-',o.Prod_name,o.Prod_type,o.Prod_batch)) AS chanPin FROM `storage` s\n" +
            "INNER JOIN orders_product o ON o.Prod_id=s.Stk_prod_id\n" +
            "WHERE 1=1\n" +
            "AND (SELECT CONCAT_WS('-',o.Prod_name,o.Prod_type,o.Prod_batch)) LIKE CONCAT('%',#{chanPin},'%')\n" +
            "AND s.Stk_warehouse LIKE CONCAT('%',#{Stk_warehouse},'%')" +
            "LIMIT #{from},#{offset}" +
            "</script>")
    public List<Storage> findAllStorage(StorageParam storageParam);
    @Select("<script>" +
            "SELECT COUNT(s.Stk_id) FROM `storage` s\n" +
            "INNER JOIN orders_product o ON o.Prod_id=s.Stk_prod_id\n" +
            "WHERE 1=1\n" +
            "AND (SELECT CONCAT_WS('-',o.Prod_name,o.Prod_type,o.Prod_batch)) LIKE CONCAT('%',#{chanPin},'%')\n" +
            "AND s.Stk_warehouse LIKE CONCAT('%',#{Stk_warehouse},'%')" +
            "</script>")
    public int findStorageCount(StorageParam storageParam);
}
