package org.ydy.mapper;

import org.apache.ibatis.annotations.*;
import org.ydy.domain.ChanceParam;
import org.ydy.entity.Chance;
import org.ydy.entity.Cust_name;
import org.ydy.entity.Maneger;
import org.ydy.entity.Plan;

import java.util.List;

public interface ChanceMapper {
    @Select("<script>SELECT * FROM sal_chance\n" +
            "WHERE 1=1\n" +
            "<if test='Chc_cust_name!=null'>AND Chc_cust_name=#{Chc_cust_name}</if>\n" +
            "<if test='chc_title!=null'>AND chc_title=#{chc_title}</if>\n" +
            "<if test='chc_linkman!=null'>AND chc_linkman=#{chc_linkman}</if>\n" +
            "LIMIT #{from},#{offset}" +
            "</script>")
    public List<Chance> getAll(ChanceParam chanceParam);
    @Select("<script>SELECT count(1) FROM sal_chance\n" +
            "WHERE 1=1\n" +
            "<if test='Chc_cust_name!=null'>AND Chc_cust_name=#{Chc_cust_name}</if>\n" +
            "<if test='chc_title!=null'>AND chc_title=#{chc_title}</if>\n" +
            "<if test='chc_linkman!=null'>AND chc_linkman=#{chc_linkman}</if>\n" +
            "</script>")
    public int getCount(ChanceParam chanceParam);
    @Select("SELECT * FROM sal_chance WHERE Chc_id=#{Chc_id}")
    public Chance findCPById(@Param("Chc_id") int Chc_id);
    @Update("<script>UPDATE sal_chance <set> chc_due_id=#{chc_due_id},chc_due_to=#{chc_due_to},chc_due_date=NOW()\n" +
            "</set>WHERE Chc_id=#{Chc_id}" +
            "</script>")
    public int updateChance(Chance chance);
    @Select("SELECT cust_manager_id,Cust_manager_name FROM cst_customer GROUP BY cust_manager_id")
    public List<Maneger> findAllManeger();

    @Select("SELECT cust_name FROM cst_customer")
    public List<Cust_name> getAllCustName();

    @Select("SELECT lkm_name,lkm_mobile FROM cst_linkman")
    public List<Cust_name> getAllLkmName();

    @Insert("INSERT INTO sal_chance(Chc_source,Chc_cust_name,chc_title,chc_rate,chc_linkman,chc_tel,chc_desc,chc_create_id,chc_create_by,chc_create_date,chc_due_id,chc_due_to,chc_due_date,chc_status) " +
            "VALUE(#{Chc_source},#{Chc_cust_name},#{chc_title},#{chc_rate},#{chc_linkman},#{chc_tel},#{chc_desc},#{chc_create_id},#{chc_create_by},NOW(),#{chc_due_id},#{chc_due_to},NOW(),1)")
    public int addChance(Chance chance);
    @Select("SELECT usr_id FROM sys_user WHERE usr_name=#{usr_name}")
    public int findUserId(@Param("usr_name") String userName);
    @Update("<script>UPDATE sal_chance <set>" +
            "<if test='Chc_source!=null'>Chc_source=#{Chc_source},</if>\n" +
            "<if test='Chc_cust_name!=null'>Chc_cust_name=#{Chc_cust_name},</if>\n" +
            "<if test='chc_title!=null'>chc_title=#{chc_title},</if>\n" +
            "<if test='chc_rate!=null'>chc_rate=#{chc_rate},</if>\n" +
            "chc_linkman=#{chc_linkman},\n" +
            "<if test='chc_tel!=null'>chc_tel=#{chc_tel},</if>\n" +
            "<if test='chc_desc!=null'>chc_desc=#{chc_desc},</if>\n" +
            "chc_due_date=NOW(),\n" +
            "<if test='chc_due_id!=0'>chc_due_id=#{chc_due_id},</if>\n" +
            "<if test='chc_due_to!=null'>chc_due_to=#{chc_due_to},</if>\n" +
            "chc_due_date=NOW()\n" +
            "</set>WHERE Chc_id=#{Chc_id}" +
            "</script>")
    public int updateChance2(Chance chance);
    @Select("SELECT * FROM sal_plan WHERE Pla_chc_id=#{Pla_chc_id} ORDER BY Pla_date DESC")
    public List<Plan> findAllPlan(@Param("Pla_chc_id") int Pla_chc_id);
    @Insert("INSERT INTO sal_plan(Pla_chc_id,Pla_date,Pla_todo,Pla_result) VALUE(#{Pla_chc_id},#{Pla_date},#{Pla_todo},'')")
    public int updatePlan(Plan plan);
    @Delete("delete from sal_plan where Pla_id=#{Pla_id}")
    public int deletePlan(@Param("Pla_id") int Pla_id);
    @Update("UPDATE sal_plan SET Pla_result=#{Pla_result}\n" +
            "WHERE Pla_id=#{Pla_id}")
    public int updatePlanResult(Plan plan);
    @Update("UPDATE sal_chance SET chc_status=#{chc_status}\n" +
            "WHERE Chc_id=#{Chc_id}")
    public int updateChanceStatus(Chance chance);
    @Delete("DELETE FROM sal_plan WHERE Pla_chc_id=#{Pla_chc_id}")
    public int deletePlan2(@Param("Pla_chc_id") int Pla_chc_id);

    @Delete("DELETE FROM sal_chance WHERE Chc_id=#{Chc_id}")
    public int deleteChance(@Param("Chc_id") int Chc_id);
}
