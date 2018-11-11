package org.ydy.service.impl;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.ydy.entity.User;
import org.ydy.mapper.UserMapper;
import org.ydy.service.UserService;
import org.ydy.util.JWTHelper;

import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StringRedisTemplate redisTemplate;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    //用户登录
    @Override
    public User userLogin(String usr_name, String usr_password) {
        User user=userMapper.userLogin(usr_name,usr_password);
        if(user!=null){
            String token= JWTHelper.genToken(ImmutableMap.of("usr_name",user.getUsr_name()));
            redisTemplate.opsForValue().set(user.getUsr_name(),token);
            redisTemplate.expire(user.getUsr_name(),30, TimeUnit.MINUTES);
            user.setToken(token);
        }
        return user;
    }
    @Override
    public String findUsernameByToken(String token) {
        if(Strings.isNullOrEmpty(token)){
            return null;
        }
        //解析token，反序列化
        Map<String,String> map=JWTHelper.verifyToken(token);
        String userName=map.get("usr_name");
        //从redis中去取,如果取不到或者过期（可以通过时间判断），获取失败
        Long expired=redisTemplate.getExpire(userName);
        if(expired>0L){  //重置一下时间
            redisTemplate.opsForValue().set(userName,token);
            redisTemplate.expire(userName,30,TimeUnit.MINUTES);
            return userName;
        }
        return null;
    }
}
