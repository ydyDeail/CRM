package org.ydy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.ydy.domain.BasParam;
import org.ydy.domain.ProductParam;
import org.ydy.domain.Restrespones;
import org.ydy.domain.StorageParam;
import org.ydy.entity.Bas;
import org.ydy.service.JiChuService;

import java.util.List;

/**
 * @author 姚端阳
 * @date 2018/10/21 15:01
 */
@RestController
public class JiChuController {
    @Autowired
    private JiChuService jiChuService;

    public JiChuService getJiChuService() {
        return jiChuService;
    }

    public void setJiChuService(JiChuService jiChuService) {
        this.jiChuService = jiChuService;
    }
    @GetMapping(value = "/getAllBas",produces = "application/json;charset=utf-8")
    public Restrespones<BasParam> findAllBas(BasParam basParam){
        jiChuService.basSetParam(basParam);
        return Restrespones.success(basParam);
    }
    @PostMapping(value = "/addBas",produces = "application/json;charset=utf-8")
    public Restrespones AddBas(@RequestBody Bas bas){
        return Restrespones.success(jiChuService.AddBas(bas));
    }
    @GetMapping(value = "/getBasById/{dict_id}")
    public Restrespones<Bas> findBasById(@PathVariable("dict_id") int dict_id){
        return Restrespones.success(jiChuService.findBasById(dict_id));
    }
    @GetMapping(value = "/deleteBas/{dict_id}")
    public Restrespones deleteBas(@PathVariable("dict_id") int dict_id){
        return Restrespones.success(jiChuService.deleteBas(dict_id));
    }
    @PostMapping(value = "/updateBas",produces = "application/json;charset=utf-8")
    public Restrespones updateBas(@RequestBody Bas bas){
        return Restrespones.success(jiChuService.updateBas(bas));
    }
    @GetMapping(value = "/newBasId")
    public Restrespones<Bas> newBasId(){
        return Restrespones.success(jiChuService.newBasId());
    }
    @GetMapping(value = "/getAllProduct",produces = "application/json;charset=utf-8")
    public Restrespones<ProductParam> findAllProduct(ProductParam productParam){
        jiChuService.productParam(productParam);
        return Restrespones.success(productParam);
    }
    @GetMapping(value = "/getAllStorage",produces = "application/json;charset=utf-8")
    public Restrespones<StorageParam> findAllStorage(StorageParam storageParam){
        jiChuService.storageParam(storageParam);
        return Restrespones.success(storageParam);
    }
}
