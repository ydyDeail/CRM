package org.ydy.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.ydy.domain.CustomerPageBean;
import org.ydy.domain.LostParam;
import org.ydy.domain.OrderInfoParam;
import org.ydy.domain.OrderParam;
import org.ydy.entity.*;
import org.ydy.mapper.CustomerMapper;
import org.ydy.service.CustomerService;

import java.util.List;

/**
 * @author 姚端阳
 * @date 2018/10/4 17:31
 */
@Service
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    private CustomerMapper customerMapper;

    public CustomerMapper getCustomerMapper() {
        return customerMapper;
    }

    public void setCustomerMapper(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Override
    public void serParam(CustomerPageBean customerPageBean) {
        int count=customerMapper.findCustomerCount(customerPageBean);
        customerPageBean.setCount(count);
        customerPageBean.setList(customerMapper.showAllCustomer(customerPageBean));
    }

    @Override
    public List<Area> findAllArea() {
        return customerMapper.findAllArea();
    }

    @Override
    public List<Level> findAllLevel() {
        return customerMapper.findAllLevel();
    }

    @Override
    public List<Maneger> findAllManeger() {
        return customerMapper.findAllManeger();
    }

    @Override
    public Customer customerInfo(String cust_no) {
        return customerMapper.customerInfo(cust_no);
    }

    @Override
    public int updateCustomer(Customer customer) {
        return customerMapper.updateCustomer(customer);
    }

    @Override
    public String findManegerId(String cust_manager_name) {
        return customerMapper.findManegerId(cust_manager_name);
    }

    @Override
    public String findLevelId(String cust_level_label) {
        return customerMapper.findLevelId(cust_level_label);
    }

    @Override
    public void findOrderByCustName(OrderParam orderParam) {
        orderParam.setCount(customerMapper.findOrderCount(orderParam));
        orderParam.setList(customerMapper.findOrder(orderParam));
    }

    @Override
    public void findOrderInfo(OrderInfoParam orderInfoParam) {
        orderInfoParam.setOrderInfos(customerMapper.findAllOrderInfo(orderInfoParam));
    }

    @Override
    public OrderInfoParam findOrderInfo1(OrderInfoParam orderInfoParam) {
        return customerMapper.findOrderInfo1(orderInfoParam);
    }

    @Override
    public void findAllLost(LostParam lostParam) {
        lostParam.setCount(customerMapper.findLostCount(lostParam));
        lostParam.setList(customerMapper.findAllLost(lostParam));
    }

    @Override
    public int updateLost(Lost lost) {
        return customerMapper.updateLost(lost);
    }

    @Override
    public int zupdateLost(Lost lost) {
        return customerMapper.zupdateLost(lost);
    }

    @Override
    public Lost findLostById(int lst_id) {
        return customerMapper.findLostById(lst_id);
    }


}
