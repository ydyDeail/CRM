package org.ydy.service;

import org.ydy.domain.CustomerPageBean;
import org.ydy.domain.LostParam;
import org.ydy.domain.OrderInfoParam;
import org.ydy.domain.OrderParam;
import org.ydy.entity.*;

import java.util.List;

/**
 * @author 姚端阳
 * @date 2018/10/4 15:27
 */
public interface CustomerService {
    public void serParam(CustomerPageBean customerPageBean);

    public List<Area> findAllArea();

    public List<Level> findAllLevel();

    public List<Maneger> findAllManeger();

    public Customer customerInfo(String cust_no);

    public int updateCustomer(Customer customer);

    public String findManegerId(String cust_manager_name);
    public String findLevelId(String cust_level_label);
    public void findOrderByCustName(OrderParam orderParam);
    public void findOrderInfo(OrderInfoParam orderInfoParam);
    public OrderInfoParam findOrderInfo1(OrderInfoParam orderInfoParam);

    public void findAllLost(LostParam lostParam);
    public int updateLost(Lost lost);
    public int zupdateLost(Lost lost);
    public Lost findLostById(int lst_id);
}

