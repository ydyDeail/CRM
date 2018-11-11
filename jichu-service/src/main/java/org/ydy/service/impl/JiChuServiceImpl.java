package org.ydy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ydy.domain.BasParam;
import org.ydy.domain.ProductParam;
import org.ydy.domain.StorageParam;
import org.ydy.entity.Bas;
import org.ydy.mapper.JiChuMapper;
import org.ydy.service.JiChuService;

/**
 * @author 姚端阳
 * @date 2018/10/21 14:58
 */
@Service
public class JiChuServiceImpl implements JiChuService {
    @Autowired
    private JiChuMapper jiChuMapper;

    public JiChuMapper getJiChuMapper() {
        return jiChuMapper;
    }

    public void setJiChuMapper(JiChuMapper jiChuMapper) {
        this.jiChuMapper = jiChuMapper;
    }

    @Override
    public void basSetParam(BasParam basParam) {
        basParam.setCount(jiChuMapper.findAllBasCount(basParam));
        basParam.setList(jiChuMapper.findAllBas(basParam));
    }

    @Override
    public void productParam(ProductParam productParam) {
        productParam.setCount(jiChuMapper.findProductCount(productParam));
        productParam.setList(jiChuMapper.findAllProduct(productParam));
    }

    @Override
    public void storageParam(StorageParam storageParam) {
        storageParam.setCount(jiChuMapper.findStorageCount(storageParam));
        storageParam.setList(jiChuMapper.findAllStorage(storageParam));
    }

    @Override
    public int AddBas(Bas bas) {
        return jiChuMapper.AddBas(bas);
    }

    @Override
    public Bas findBasById(int dict_id) {
        return jiChuMapper.findBasById(dict_id);
    }

    @Override
    public int deleteBas(int dict_id) {
        return jiChuMapper.deleteBas(dict_id);
    }

    @Override
    public int updateBas(Bas bas) {
        return jiChuMapper.updateBas(bas);
    }

    @Override
    public Bas newBasId() {
        return jiChuMapper.newBasId();
    }
}
