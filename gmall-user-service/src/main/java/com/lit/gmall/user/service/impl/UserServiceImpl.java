package com.lit.gmall.user.service.impl;/*
@author Mr.Ding
@date 2019/11/14 - 17:08
*/

import com.alibaba.dubbo.config.annotation.Service;
import com.lit.gmall.bean.UmsMember;
import com.lit.gmall.bean.UmsMemberReceiveAddress;
import com.lit.gmall.service.UserService;
import com.lit.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.lit.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAll(); //userMapper.selectAllUser();
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMumberId(String mumberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(mumberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses;
    }
}
