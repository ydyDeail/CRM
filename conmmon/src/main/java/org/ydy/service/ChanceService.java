package org.ydy.service;


import org.ydy.domain.ChanceParam;
import org.ydy.entity.Chance;
import org.ydy.entity.Cust_name;
import org.ydy.entity.Maneger;
import org.ydy.entity.Plan;

import java.util.List;

public interface ChanceService {
    public void serParam(ChanceParam chanceParam);
    public Chance findCPById(int Chc_id);
    public int updateChance(Chance chance); //指派
    public int updateChance2(Chance chance); //编辑机会
    public int addChance(Chance chance);
    public List<Maneger> findAllManeger();
    public List<Cust_name> getAllCustName();
    public List<Cust_name> getAllLkmName();
    public String findUsernameByToken(String token);
    public int findUserId(String userName);
    public List<Plan> findAllPlan(int Pla_chc_id);
    public int updatePlan(Plan plan);
    public int deletePlan(int Pla_id);
    public int deletePlan2(int Pla_chc_id);
    public int updatePlanResult(Plan plan);
    public int updateChanceStatus(Chance chance);
    public int deleteChance(int Chc_id);
}
