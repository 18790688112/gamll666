package com.lit.gmall.user.controller;/*
@author Mr.Ding
@date 2019/11/14 - 17:07
*/

import com.lit.gmall.bean.UmsMember;
import com.lit.gmall.bean.UmsMemberReceiveAddress;
import com.lit.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("getReceiveAddressByMumberId")
    public List<UmsMemberReceiveAddress> getReceiveAddressByMumberId(String mumberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMumberId(mumberId);
        return umsMemberReceiveAddresses;
    }

    @ResponseBody
    @RequestMapping("getAllUser")
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("index")
    @ResponseBody
    public String hello(){
        return "hello Gmall!";
    }
}
