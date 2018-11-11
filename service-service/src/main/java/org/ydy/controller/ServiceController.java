package org.ydy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.ydy.domain.RestCode;
import org.ydy.domain.Restrespones;
import org.ydy.domain.ServiceParam;
import org.ydy.entity.Bas;
import org.ydy.entity.CstService;
import org.ydy.entity.Cust_name;
import org.ydy.entity.Maneger;
import org.ydy.service.CstServiceService;

import java.util.List;

/**
 * @author 姚端阳
 * @date 2018/10/22 16:12
 */
@RestController
public class ServiceController {
    @Autowired
    private CstServiceService cstServiceService;

    public CstServiceService getCstServiceService() {
        return cstServiceService;
    }

    public void setCstServiceService(CstServiceService cstServiceService) {
        this.cstServiceService = cstServiceService;
    }
    @PostMapping(value = "/addService",produces = "application/json;charset=utf-8")
    public Restrespones addCstService(@RequestBody CstService cstService){
        System.out.println(cstService);
        return Restrespones.success(cstServiceService.addCstService(cstService));
    }

    @GetMapping(value = "/getNewId")
    public Restrespones newId(){
        return Restrespones.success(cstServiceService.newId());
    }

    @GetMapping(value = "/getAllService",produces = "application/json;charset=utf-8")
    public Restrespones<List<Bas>> findService() {
        return Restrespones.success(cstServiceService.findService());
    }
    @GetMapping(value = "/getUser",produces = "application/json;charset=utf-8")
    public Restrespones<String> getUser(String token){
        String username=cstServiceService.findUsernameByToken(token);
        if(username!=null){
            return Restrespones.success(username);
        }else{
            return Restrespones.error(RestCode.TOMKEN_INVALLD);
        }
    }
    @GetMapping(value = "/findUser/{usr_name}")
    public Restrespones findUserId(@PathVariable("usr_name") String userName){
        return Restrespones.success(cstServiceService.findUserId(userName));
    }
    @GetMapping(value = "/findIdByName/{svr_cust_name}",produces = "application/json;charset=utf-8")
    public Restrespones findCustomerId(@PathVariable("svr_cust_name") String customerName){
        return Restrespones.success(cstServiceService.findCustomerId(customerName));
    }

    @GetMapping(value = "/custname",produces = "application/json;charset=utf-8")
    public Restrespones<List<Cust_name>> getAllCustName(){
        return Restrespones.success(cstServiceService.getAllCustName());
    }
    @GetMapping(value = "/getFenPei",produces = "application/json;charset=utf-8")
    public Restrespones<ServiceParam> findByFenPei(ServiceParam serviceParam){
        cstServiceService.findByFenPei(serviceParam);
        return Restrespones.success(serviceParam);
    }
    @GetMapping(value = "/manegers",produces = "application/json;charset=utf-8")
    public Restrespones<List<Maneger>> findAllManeger(){
        return Restrespones.success(cstServiceService.findAllManeger());
    }
}
