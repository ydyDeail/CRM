package org.ydy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.ydy.domain.*;
import org.ydy.entity.*;
import org.ydy.service.CustomerService;

import java.util.List;

/**
 * @author 姚端阳
 * @date 2018/10/4 17:46
 */
@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping(value = "/customers",produces = "application/json;charset=utf-8")
    public Restrespones<CustomerPageBean> showCustomerAll(CustomerPageBean customerPageBean){
        customerService.serParam(customerPageBean);
        return Restrespones.success(customerPageBean);
    }
    @GetMapping(value = "/areas",produces = "application/json;charset=utf-8")
    public Restrespones<List<Area>> findAllArea(){
        return Restrespones.success(customerService.findAllArea());
    }
    @GetMapping(value = "/levels",produces = "application/json;charset=utf-8")
    public Restrespones<List<Level>> findAllLevel(){
        return Restrespones.success(customerService.findAllLevel());
    }
    @GetMapping(value = "/manegers",produces = "application/json;charset=utf-8")
    public Restrespones<List<Maneger>> findAllManeger(){
        return Restrespones.success(customerService.findAllManeger());
    }
    @GetMapping(value = "/customers/{cust_no}")
    public Restrespones<Customer> customerInfo(@PathVariable("cust_no") String cust_no){
        return Restrespones.success(customerService.customerInfo(cust_no));
    }
    @GetMapping(value = "/findLevelId/{cust_level_label}")
    public Object findLevelById(@PathVariable("cust_level_label") String cust_level_label){
        String num=customerService.findLevelId(cust_level_label);
        return num;
    }
    @GetMapping(value = "/findManagerId/{cust_manager_name}")
    public Object findManagerById(@PathVariable("cust_manager_name") String cust_manager_name){
        return customerService.findManegerId(cust_manager_name);
    }
    @PostMapping(value = "/updateCustomer", produces = "application/json;charset=utf-8")
    public Restrespones updateCustomer(@RequestBody Customer customer){
        int num=customerService.updateCustomer(customer);
        if(num==1){
           return Restrespones.success(RestCode.OK);
        }else{
           return Restrespones.error(RestCode.UPDATE_DEFETE);
        }
    }

    @GetMapping(value = "/getOrder",produces = "application/json;charset=utf-8")
    public Restrespones<OrderParam> findOrderByCustName(OrderParam orderParam){
        customerService.findOrderByCustName(orderParam);
        return Restrespones.success(orderParam);
    }
    @GetMapping(value = "/getOrderInfo")
    public Restrespones<OrderInfoParam> findOrderInfoById(OrderInfoParam orderInfoParam){
        customerService.findOrderInfo(orderInfoParam);
        return Restrespones.success(orderInfoParam);
    }
    @GetMapping(value = "/getOrder")
    public Restrespones<OrderInfoParam> findOrderInfo(OrderInfoParam orderInfoParam){
        return Restrespones.success(customerService.findOrderInfo1(orderInfoParam));
    }

    @GetMapping(value = "/getLost",produces = "application/json;charset=utf-8")
    public Restrespones<LostParam> findAllLost(LostParam lostParam){
        customerService.findAllLost(lostParam);
        return Restrespones.success(lostParam);
    }
    @GetMapping(value = "/getLostById/{Lst_id}",produces = "application/json;charset=utf-8")
    public Restrespones<Lost> findLostBuId(@PathVariable("Lst_id") int Lst_id){
        return Restrespones.success(customerService.findLostById(Lst_id));
    }
    @PostMapping(value = "/qupdateLost", produces = "application/json;charset=utf-8")
    public Restrespones updateLost(@RequestBody Lost lost){
        int num=customerService.updateLost(lost);
        if(num==1){
            return Restrespones.success(num);
        }else{
            return Restrespones.error(RestCode.UPDATE_DEFETE);
        }
    }
    @PostMapping(value = "/zupdateLost", produces = "application/json;charset=utf-8")
    public Restrespones zupdateLost(@RequestBody Lost lost){
        int num=customerService.zupdateLost(lost);
        if(num==1){
            return Restrespones.success(num);
        }else{
            return Restrespones.error(RestCode.UPDATE_DEFETE);
        }
    }
}
