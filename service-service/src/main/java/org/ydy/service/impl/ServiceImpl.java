package org.ydy.service.impl;

import com.google.common.base.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.ydy.domain.ServiceParam;
import org.ydy.entity.Bas;
import org.ydy.entity.CstService;
import org.ydy.entity.Cust_name;
import org.ydy.entity.Maneger;
import org.ydy.mapper.CstServiceMapper;
import org.ydy.service.CstServiceService;
import org.ydy.util.JWTHelper;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author 姚端阳
 * @date 2018/10/22 16:11
 */
@Service
public class ServiceImpl implements CstServiceService {
    @Autowired
    private CstServiceMapper cstServiceMapper;
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Override
    public int addCstService(CstService cstService) {
        return cstServiceMapper.addCstService(cstService);
    }

    @Override
    public String findCustomerId(String customerName) {
        return cstServiceMapper.findCustomerId(customerName);
    }

    @Override
    public List<Cust_name> getAllCustName() {
        return cstServiceMapper.getAllCustName();
    }

    @Override
    public int newId() {
        return cstServiceMapper.newId();
    }

    @Override
    public List<Bas> findService() {
        return cstServiceMapper.findService();
    }

    @Override
    public void findByFenPei(ServiceParam serviceParam) {
        serviceParam.setCount(cstServiceMapper.getCstServiceCount(serviceParam));
        serviceParam.setList(cstServiceMapper.getAllCstService(serviceParam));
    }

    @Override
    public List<Maneger> findAllManeger() {
        return cstServiceMapper.findAllManeger();
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
        return cstServiceMapper.findUserId(userName);
    }
}
