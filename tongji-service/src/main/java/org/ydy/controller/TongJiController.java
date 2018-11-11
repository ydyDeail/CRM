package org.ydy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ydy.domain.*;
import org.ydy.entity.Bas;
import org.ydy.service.TongJiService;

import java.util.List;

/**
 * @author 姚端阳
 * @date 2018/10/22 10:40
 */
@RestController
public class TongJiController {
    @Autowired
    private TongJiService tongJiService;

    public TongJiService getTongJiService() {
        return tongJiService;
    }

    public void setTongJiService(TongJiService tongJiService) {
        this.tongJiService = tongJiService;
    }
    @GetMapping(value = "/getAllGongXian",produces = "application/json;charset=utf-8")
    public Restrespones<List<GongXianParam>> findAllGongXian(GongXianParam gongXianParam){
        return Restrespones.success(tongJiService.findAllGongXian(gongXianParam));
    }
    @GetMapping(value = "/getAllLevel",produces = "application/json;charset=utf-8")
    public Restrespones<List<GouChengParam>> findAllLevel(GouChengParam gouChengParam){
        return Restrespones.success(tongJiService.findAllLevel(gouChengParam));
    }
    @GetMapping(value = "/getAllManYi",produces = "application/json;charset=utf-8")
    public Restrespones<List<GouChengParam>> findAllManYi(GouChengParam gouChengParam){
        return Restrespones.success(tongJiService.findAllManYi(gouChengParam));
    }
    @GetMapping(value = "/getAllXinYong",produces = "application/json;charset=utf-8")
    public Restrespones<List<GouChengParam>> findAllXinYong(GouChengParam gouChengParam){
        return Restrespones.success(tongJiService.findAllXinYong(gouChengParam));
    }

    @GetMapping(value = "/getAllFuWu")
    public Restrespones<List<FuWuParam>> findAllFuWu(FuWuParam fuWuParam){
        if(fuWuParam.getDowmtime()!=0){
            fuWuParam.setUptime(fuWuParam.getDowmtime()+1);
            fuWuParam.setStime(fuWuParam.getUptime()+"-01-01");
            fuWuParam.setXtime(fuWuParam.getDowmtime()+"-01-01");
        }
        return Restrespones.success(tongJiService.findAllFuWu(fuWuParam));
    }
    @GetMapping(value = "getAllService")
    public Restrespones<List<Bas>> findAllService(){
        return Restrespones.success(tongJiService.findService());
    }

    @GetMapping(value = "/getLost",produces = "application/json;charset=utf-8")
    public Restrespones<LostParam> findAllLost(LostParam lostParam){
        tongJiService.findAllLost(lostParam);
        return Restrespones.success(lostParam);
    }
}
