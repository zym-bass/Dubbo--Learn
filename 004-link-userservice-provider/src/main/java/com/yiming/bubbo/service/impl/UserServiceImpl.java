package com.yiming.bubbo.service.impl;

import com.yiming.model.User;
import com.yiming.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setAge(id);
        user.setUserName("大王");
        return null;
    }

    @Override
    public Integer queryAllUserCount() {
        return 100000;
    }
}
