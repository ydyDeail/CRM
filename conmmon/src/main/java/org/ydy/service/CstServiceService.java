package org.ydy.service;

import org.ydy.domain.ServiceParam;
import org.ydy.entity.Bas;
import org.ydy.entity.CstService;
import org.ydy.entity.Cust_name;
import org.ydy.entity.Maneger;

import java.util.List;

public interface CstServiceService {
    public String findUsernameByToken(String token);
    public int findUserId(String userName);
    public int addCstService(CstService cstService);
    public String findCustomerId(String customerName);
    public List<Cust_name> getAllCustName();
    public int newId();
    public List<Bas> findService();
    public void findByFenPei(ServiceParam serviceParam);
    public List<Maneger> findAllManeger();
}
