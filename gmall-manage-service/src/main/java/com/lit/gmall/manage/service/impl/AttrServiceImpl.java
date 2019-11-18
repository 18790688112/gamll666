package com.lit.gmall.manage.service.impl;/*
@author Mr.Ding
@date 2019/11/18 - 19:05
*/

import com.alibaba.dubbo.config.annotation.Service;
import com.lit.gmall.bean.PmsBaseAttrInfo;
import com.lit.gmall.bean.PmsBaseAttrValue;
import com.lit.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.lit.gmall.manage.mapper.PmsBaseAttrValueMapper;
import com.lit.gmall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;


    @Override
    public List<PmsBaseAttrInfo> attInfoList(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        return pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
    }
}
