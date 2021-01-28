package com.yiming.bubbo.service.impl;

import com.yiming.entity.User;
import com.yiming.service.UserService;

public class UserServiceImpl2 implements UserService {
    @Override
    public User queryUserById(Integer id, String username) {
        User user = new User();
        user.setAge(50);
        user.setId(id);
        user.setName(username);

        return user;

    }
}
