package org.ydy.service;

import org.ydy.domain.FuWuParam;
import org.ydy.domain.GongXianParam;
import org.ydy.domain.GouChengParam;
import org.ydy.domain.LostParam;
import org.ydy.entity.Bas;

import java.util.List;

public interface TongJiService {
    public List<GongXianParam> findAllGongXian(GongXianParam gongXianParam);

    public List<GouChengParam> findAllLevel(GouChengParam gouChengParam);

    public List<GouChengParam> findAllManYi(GouChengParam gouChengParam);

    public List<GouChengParam> findAllXinYong(GouChengParam gouChengParam);

    public List<FuWuParam> findAllFuWu(FuWuParam fuWuParam);

    public List<Bas> findService();

    public void findAllLost(LostParam lostParam);
}
