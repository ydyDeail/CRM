package org.ydy.service;

import org.ydy.entity.LianXi;

import java.util.List;

public interface LianXiService {
    public List<LianXi> findAll(String lkm_cust_no);
    public LianXi findInfo(int lkm_id);
    public int updateLianXi(LianXi lx);
    public int addLianXi(LianXi lx);
}
