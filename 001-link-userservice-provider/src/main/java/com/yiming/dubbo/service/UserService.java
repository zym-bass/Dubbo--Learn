package com.yiming.dubbo.service;

import com.yiming.dubbo.model.User;

public interface UserService {
    //根据用户标识获取用户信息
    User queryUserById(Integer id);
}
