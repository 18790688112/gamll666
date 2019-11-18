package com.lit.gmall.user.mapper;/*
@author Mr.Ding
@date 2019/11/14 - 17:09
*/

import com.lit.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}
