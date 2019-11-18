package com.lit.gmall.service;/*
@author Mr.Ding
@date 2019/11/18 - 19:04
*/

import com.lit.gmall.bean.PmsBaseAttrInfo;

import java.util.List;

public interface AttrService {
    List<PmsBaseAttrInfo> attInfoList(String catalog3Id);
}
