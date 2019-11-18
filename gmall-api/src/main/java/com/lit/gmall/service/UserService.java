package com.lit.gmall.service;/*
@author Mr.Ding
@date 2019/11/15 - 14:25
*/

import com.lit.gmall.bean.UmsMember;
import com.lit.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMumberId(String mumberId);
}