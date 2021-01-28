package com.yiming.bubbo.service.impl;

import com.yiming.entity.User;
import com.yiming.service.UserService;

public class UserServiceImpl  implements UserService {
    @Override
    public User queryUserById(Integer id, String username) {
        User user = new User();
        user.setAge(100);
        user.setId(id);
        user.setName(username);

        return user;
    }
}
