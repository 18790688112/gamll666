package com.lit.gmall.service;/*
@author Mr.Ding
@date 2019/11/18 - 16:40
*/

import com.lit.gmall.bean.PmsBaseCatalog1;
import com.lit.gmall.bean.PmsBaseCatalog2;
import com.lit.gmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {

    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
