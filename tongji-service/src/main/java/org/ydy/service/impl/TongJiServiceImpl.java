package org.ydy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ydy.domain.FuWuParam;
import org.ydy.domain.GongXianParam;
import org.ydy.domain.GouChengParam;
import org.ydy.domain.LostParam;
import org.ydy.entity.Bas;
import org.ydy.mapper.TongJiMapper;
import org.ydy.service.TongJiService;

import java.util.List;

/**
 * @author 姚端阳
 * @date 2018/10/22 10:39
 */
@Service
public class TongJiServiceImpl implements TongJiService {
    @Autowired
    private TongJiMapper tongJiMapper;
    @Override
    public List<GongXianParam> findAllGongXian(GongXianParam gongXianParam) {
        return tongJiMapper.findAllGongXian(gongXianParam);
    }

    @Override
    public List<GouChengParam> findAllLevel(GouChengParam gouChengParam) {
        return tongJiMapper.findAllLevel(gouChengParam);
    }

    @Override
    public List<GouChengParam> findAllManYi(GouChengParam gouChengParam) {
        return tongJiMapper.findAllManYi(gouChengParam);
    }

    @Override
    public List<GouChengParam> findAllXinYong(GouChengParam gouChengParam) {
        return tongJiMapper.findAllXinYong(gouChengParam);
    }

    @Override
    public List<FuWuParam> findAllFuWu(FuWuParam fuWuParam) {
        return tongJiMapper.findAllFuWu(fuWuParam);
    }

    @Override
    public List<Bas> findService() {
        return tongJiMapper.findService();
    }

    @Override
    public void findAllLost(LostParam lostParam) {
        lostParam.setCount(tongJiMapper.findLostCount(lostParam));
        lostParam.setList(tongJiMapper.findAllLost(lostParam));
    }
}
