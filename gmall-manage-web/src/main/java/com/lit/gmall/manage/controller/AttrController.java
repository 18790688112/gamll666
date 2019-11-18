package com.lit.gmall.manage.controller;/*
@author Mr.Ding
@date 2019/11/18 - 18:38
*/

import com.alibaba.dubbo.config.annotation.Reference;
import com.lit.gmall.bean.PmsBaseAttrInfo;
import com.lit.gmall.bean.PmsBaseAttrValue;
import com.lit.gmall.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class AttrController {

    @Reference
    AttrService attrService;

    @ResponseBody
    @RequestMapping("attrInfoList")
    public List<PmsBaseAttrInfo> attInfoList(String catalog3Id){
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = attrService.attInfoList(catalog3Id);
        return pmsBaseAttrInfos;
    }





}


