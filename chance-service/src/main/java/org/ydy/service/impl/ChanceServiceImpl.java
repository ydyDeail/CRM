package org.ydy.service.impl;

import com.google.common.base.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.ydy.domain.ChanceParam;
import org.ydy.entity.Chance;
import org.ydy.entity.Cust_name;
import org.ydy.entity.Maneger;
import org.ydy.entity.Plan;
import org.ydy.mapper.ChanceMapper;
import org.ydy.service.ChanceService;
import org.ydy.util.JWTHelper;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author 姚端阳
 * @date 2018/10/16 16:47
 */
@Service
public class ChanceServiceImpl implements ChanceService {
    @Autowired
    private ChanceMapper chanceMapper;

    public ChanceMapper getChanceMapper() {
        return chanceMapper;
    }

    public void setChanceMapper(ChanceMapper chanceMapper) {
        this.chanceMapper = chanceMapper;
    }
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Override
    public void serParam(ChanceParam chanceParam) {
        chanceParam.setCount(chanceMapper.getCount(chanceParam));
        chanceParam.setList(chanceMapper.getAll(chanceParam));
    }

    @Override
    public Chance findCPById(int Chc_id) {
        return chanceMapper.findCPById(Chc_id);
    }

    @Override
    public int updateChance(Chance chance) {
        return chanceMapper.updateChance(chance);
    }

    @Override
    public int updateChance2(Chance chance) {
        return chanceMapper.updateChance2(chance);
    }

    @Override
    public int addChance(Chance chance) {
        return chanceMapper.addChance(chance);
    }

    @Override
    public List<Maneger> findAllManeger() {
        return chanceMapper.findAllManeger();
    }

    @Override
    public List<Cust_name> getAllCustName() {
        return chanceMapper.getAllCustName();
    }

    @Override
    public List<Cust_name> getAllLkmName() {
        return chanceMapper.getAllLkmName();
    }
    @Override
    public String findUsernameByToken(String token) {
        if(Strings.isNullOrEmpty(token)){
            return null;
        }
        //解析token，反序列化
        Map<String,String> map= JWTHelper.verifyToken(token);
        String userName=map.get("usr_name");
        //从redis中去取,如果取不到或者过期（可以通过时间判断），获取失败
        Long expired=redisTemplate.getExpire(userName);
        if(expired>0L){  //重置一下时间
            redisTemplate.opsForValue().set(userName,token);
            redisTemplate.expire(userName,30, TimeUnit.MINUTES);
            return userName;
        }
        return null;
    }

    @Override
    public int findUserId(String userName) {
        return chanceMapper.findUserId(userName);
    }

    @Override
    public List<Plan> findAllPlan(int Pla_chc_id) {
        return chanceMapper.findAllPlan(Pla_chc_id);
    }

    @Override
    public int updatePlan(Plan plan) {
        return chanceMapper.updatePlan(plan);
    }

    @Override
    public int deletePlan(int Pla_id) {
        return chanceMapper.deletePlan(Pla_id);
    }

    @Override
    public int deletePlan2(int Pla_chc_id) {
        return chanceMapper.deletePlan2(Pla_chc_id);
    }

    @Override
    public int updatePlanResult(Plan plan) {
        return chanceMapper.updatePlanResult(plan);
    }

    @Override
    public int updateChanceStatus(Chance chance) {
        return chanceMapper.updateChanceStatus(chance);
    }

    @Override
    public int deleteChance(int Chc_id) {
        return chanceMapper.deleteChance(Chc_id);
    }
}
