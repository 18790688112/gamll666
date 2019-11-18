package com.lit.gmall.manage.controller;/*
@author Mr.Ding
@date 2019/11/18 - 16:27
*/

import com.alibaba.dubbo.config.annotation.Reference;
import com.lit.gmall.bean.PmsBaseCatalog1;
import com.lit.gmall.bean.PmsBaseCatalog2;
import com.lit.gmall.bean.PmsBaseCatalog3;
import com.lit.gmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class CatalogController {

    @Reference
    CatalogService catalogService;

    @ResponseBody
    @RequestMapping("getCatalog3")
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        List<PmsBaseCatalog3>  pmsBaseCatalog3s = catalogService.getCatalog3(catalog2Id);
        return pmsBaseCatalog3s;

    }

    @ResponseBody
    @RequestMapping("getCatalog2")
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        List<PmsBaseCatalog2>  PmsBaseCatalog2s = catalogService.getCatalog2(catalog1Id);
        return PmsBaseCatalog2s;

    }

    @ResponseBody
    @RequestMapping("getCatalog1")
    public List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1>  PmsBaseCatalog1s = catalogService.getCatalog1();
        return PmsBaseCatalog1s;

    }


}
