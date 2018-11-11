package org.ydy.service;


import org.ydy.domain.BasParam;
import org.ydy.domain.ProductParam;
import org.ydy.domain.StorageParam;
import org.ydy.entity.Bas;

public interface JiChuService {
    public void basSetParam(BasParam basParam);
    public void productParam(ProductParam productParam);
    public void storageParam(StorageParam storageParam);
    public int AddBas(Bas bas);
    public Bas findBasById(int dict_id);
    public int deleteBas(int dict_id);
    public int updateBas(Bas bas);
    public Bas newBasId();
}
