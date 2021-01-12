package com.yiming.dubbo.service.impl;

import com.yiming.dubbo.model.User;
import com.yiming.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setAge(id);
        user.setUsername("张三");
        return user;
    }
}
