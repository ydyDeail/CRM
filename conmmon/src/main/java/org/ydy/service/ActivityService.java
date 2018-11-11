package org.ydy.service;

import org.ydy.entity.Activity;

import java.util.List;

public interface ActivityService {
    public List<Activity> findAll(String Atv_cust_no);
    public Activity findAInfo(int Atv_id);
    public int updateActivity(Activity activity);
}
