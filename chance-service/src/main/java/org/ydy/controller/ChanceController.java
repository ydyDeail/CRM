package org.ydy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.ydy.domain.ChanceParam;
import org.ydy.domain.RestCode;
import org.ydy.domain.Restrespones;
import org.ydy.entity.Chance;
import org.ydy.entity.Cust_name;
import org.ydy.entity.Maneger;
import org.ydy.entity.Plan;
import org.ydy.service.ChanceService;

import java.util.List;

/**
 * @author 姚端阳
 * @date 2018/10/16 16:53
 */
@RestController
public class ChanceController {
    @Autowired
    private ChanceService chanceService;

    public ChanceService getChanceService() {
        return chanceService;
    }

    public void setChanceService(ChanceService chanceService) {
        this.chanceService = chanceService;
    }
    @GetMapping(value = "/chances",produces = "application/json;charset=utf-8")
    public Restrespones<ChanceParam> getAll(ChanceParam chanceParam){
        chanceService.serParam(chanceParam);
        return Restrespones.success(chanceParam);
    }
    @GetMapping(value = "/chances/{Chc_id}",produces = "application/json;charset=utf-8")
    public Restrespones<Chance> findCPById(@PathVariable("Chc_id") int Chc_id){
        return Restrespones.success(chanceService.findCPById(Chc_id));
    }
    @PostMapping(value = "/updateChance",produces = "application/json;charset=utf-8")
    public Restrespones updateChance(@RequestBody Chance chance){
        int num=chanceService.updateChance(chance);
        if(num>0){
            return Restrespones.success(num);
        }else{
            return Restrespones.error(RestCode.UPDATE_DEFETE);
        }

    }
    @PostMapping(value = "/xiugaiChance",produces = "application/json;charset=utf-8")
    public Restrespones updateChance2(@RequestBody Chance chance){
        int num=chanceService.updateChance2(chance);
        if(num>0){
            return Restrespones.success(num);
        }else{
            return Restrespones.error(RestCode.UPDATE_DEFETE);
        }

    }
    @GetMapping(value = "/manegers",produces = "application/json;charset=utf-8")
    public Restrespones<List<Maneger>> findAllManeger(){
        return Restrespones.success(chanceService.findAllManeger());
    }
    @GetMapping(value = "/custname",produces = "application/json;charset=utf-8")
    public Restrespones<List<Cust_name>> getAllCustName(){
        return Restrespones.success(chanceService.getAllCustName());
    }
    @GetMapping(value = "/lkmname",produces = "application/json;charset=utf-8")
    public Restrespones<List<Cust_name>> getAllLkmName(){
        return Restrespones.success(chanceService.getAllLkmName());
    }
    @GetMapping(value = "/getUser",produces = "application/json;charset=utf-8")
    public Restrespones<String> getUser(String token){
        String username=chanceService.findUsernameByToken(token);
        if(username!=null){
            return Restrespones.success(username);
        }else{
            return Restrespones.error(RestCode.TOMKEN_INVALLD);
        }
    }
    @PostMapping(value = "/addChance",produces = "application/json;charset=utf-8")
    public Restrespones addChance(@RequestBody Chance chance){
        int num=chanceService.addChance(chance);
        if(num>0){
            return Restrespones.success(num);
        }else{
            return Restrespones.error(RestCode.ADD_ERROR);
        }
    }
    @GetMapping(value = "/findUser/{usr_name}")
    public Restrespones findUserId(@PathVariable("usr_name") String userName){
            return Restrespones.success(chanceService.findUserId(userName));
    }
    @GetMapping(value = "/plans/{Pla_chc_id}")
    public Restrespones<List<Plan>> findAllPlan(@PathVariable("Pla_chc_id") int Pla_chc_id){
        return Restrespones.success(chanceService.findAllPlan(Pla_chc_id));
    }
    @GetMapping(value = "/deletePlan/{Pla_id}")
    public Restrespones deletePlan(@PathVariable("Pla_id") int Pla_id){
        return Restrespones.success(chanceService.deletePlan(Pla_id));
    }
    @PostMapping(value = "/updatePlan",produces = "application/json;charset=utf-8")
    public Restrespones updatePlan(@RequestBody Plan plan){ //新增开发计划
        return Restrespones.success(chanceService.updatePlan(plan));
    }
    @PostMapping(value = "/updateResult",produces = "application/json;charset=utf-8")
    public Restrespones updatePlanResult(@RequestBody Plan plan){
        return Restrespones.success(chanceService.updatePlanResult(plan));
    }
    @PostMapping(value = "/updateStatus",produces = "application/json;charset=utf-8")
    public Restrespones updateChanceStatus(@RequestBody Chance chance){
        return Restrespones.success(chanceService.updateChanceStatus(chance));
    }
    @GetMapping(value = "/deletePlan2/{Pla_chc_id}")
    public Restrespones deletePlan2(@PathVariable("Pla_chc_id") int Pla_chc_id){
        return Restrespones.success(chanceService.deletePlan2(Pla_chc_id));
    }
    @GetMapping(value = "/deleteChance/{Chc_id}")
    public Restrespones deleteChance(@PathVariable("Chc_id") int Chc_id){
        return Restrespones.success(chanceService.deleteChance(Chc_id));
    }
}
